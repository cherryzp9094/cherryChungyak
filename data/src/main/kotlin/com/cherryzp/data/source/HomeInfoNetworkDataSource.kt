package com.cherryzp.data.source

import com.cherryzp.data.model.HomeAptInfoDetailEntity

interface HomeInfoNetworkDataSource {
    suspend fun getHomeAptInfo(
        page: Int,
        perPage: Int,
    ): List<HomeAptInfoDetailEntity>
}