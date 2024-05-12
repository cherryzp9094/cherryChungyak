package com.cherryzp.data.di

import android.content.Context
import com.cherryzp.data.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

private const val CHUNGYAK_BASE_URL = BuildConfig.CHUNGYAK_URL
private const val CONNECT_TIMEOUT = "CONNECT_TIMEOUT"

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Singleton
    @Provides
    fun provideHttpLoggingInterceptor() = HttpLoggingInterceptor().apply {
        level =
            if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
            else HttpLoggingInterceptor.Level.NONE
    }

    @Singleton
    @Provides
    fun provideInterceptor(@ApplicationContext context: Context): Interceptor =
        Interceptor { chain: Interceptor.Chain ->
            var request = chain.request()
            val url = request.url.newBuilder()
                .build()
            request = request.newBuilder()
                .addHeader(name = "content-type", value = "application/json")
                .addHeader(name = "charset", value = "UTF-8")
                .url(url)
                .build()
            var connectTimeout = chain.connectTimeoutMillis()
            val connectNew = request.header(CONNECT_TIMEOUT)
            if (!connectNew.isNullOrEmpty()) {
                connectTimeout = connectNew.toIntOrNull() ?: 0
            }
            chain
                .withConnectTimeout(connectTimeout, TimeUnit.MILLISECONDS)
                .proceed(request)
        }

    @Singleton
    @Provides
    fun provideOKHttpClient(
        interceptor: Interceptor,
        httpLoggingInterceptor: HttpLoggingInterceptor,
    ): OkHttpClient {
        val okHttpClientBuilder =
            OkHttpClient().newBuilder()

        return okHttpClientBuilder
            .addInterceptor(interceptor)
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(CHUNGYAK_BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}