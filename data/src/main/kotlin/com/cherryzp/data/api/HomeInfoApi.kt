package com.cherryzp.data.api

import com.cherryzp.data.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Query

private const val SERVICE_KEY = BuildConfig.SERVICE_KEY

interface HomeInfoApi {
    @GET("ApplyhomeInfoDetailSvc/v1/getAPTLttotPblancDetail")
    suspend fun getHomeInfo(
        @Query("page") page: Int,
        @Query("perPage") perPage: Int,
        @Query("serviceKey") serviceKey: String = SERVICE_KEY,
    ): NetworkResponse<List<Any>>
}

data class NetworkResponse<T>(
    val currentCount: Int,
    val data: T,
    val matchCount: Int,
    val page: Int,
    val perPage: Int,
    val totalCount: Int,
)