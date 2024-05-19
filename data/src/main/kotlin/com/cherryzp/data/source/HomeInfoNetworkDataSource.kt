package com.cherryzp.data.source

import com.cherryzp.data.model.HomeAptInfoDetail

interface HomeInfoNetworkDataSource {
    suspend fun getHomeAptInfo(
        page: Int,
        perPage: Int,
    ): List<HomeAptInfoDetail>
}