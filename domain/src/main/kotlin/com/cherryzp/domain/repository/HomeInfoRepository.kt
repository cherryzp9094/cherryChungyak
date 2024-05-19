package com.cherryzp.domain.repository

import com.cherryzp.domain.model.HomeAptInfoDetail

interface HomeInfoRepository {

    suspend fun getHomeAptInfo(
        page: Int,
        perPage: Int,
    ): List<HomeAptInfoDetail>

}