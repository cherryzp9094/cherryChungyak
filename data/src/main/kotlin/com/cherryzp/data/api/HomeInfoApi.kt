package com.cherryzp.data.api

import com.cherryzp.data.BuildConfig
import com.cherryzp.data.model.HomeAptInfoDetailEntity
import retrofit2.http.GET
import retrofit2.http.Query

private const val SERVICE_KEY = BuildConfig.SERVICE_KEY

interface HomeInfoApi {

    @GET("ApplyhomeInfoDetailSvc/v1/getAPTLttotPblancDetail")
    suspend fun getHomeAptInfo(
        @Query("page") page: Int,
        @Query("perPage") perPage: Int,
        @Query("serviceKey") serviceKey: String = SERVICE_KEY,
    ): NetworkResponse<List<HomeAptInfoDetailEntity>>

}

data class NetworkResponse<T>(
    val currentCount: Int,
    val data: T,
    val matchCount: Int,
    val page: Int,
    val perPage: Int,
    val totalCount: Int,
)