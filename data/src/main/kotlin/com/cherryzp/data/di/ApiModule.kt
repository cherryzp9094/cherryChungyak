package com.cherryzp.data.di

import com.cherryzp.data.api.HomeInfoApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun provideHomeInfoApiService(retrofit: Retrofit): HomeInfoApi {
        return retrofit.create(HomeInfoApi::class.java)
    }

}