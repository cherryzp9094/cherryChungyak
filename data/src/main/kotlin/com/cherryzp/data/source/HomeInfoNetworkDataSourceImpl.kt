package com.cherryzp.data.source

import com.cherryzp.data.api.HomeInfoApi
import com.cherryzp.data.model.HomeAptInfoDetailEntity
import javax.inject.Inject

class HomeInfoNetworkDataSourceImpl @Inject constructor(
    private val service: HomeInfoApi
): HomeInfoNetworkDataSource {
    override suspend fun getHomeAptInfo(page: Int, perPage: Int): List<HomeAptInfoDetailEntity> =
        service.getHomeAptInfo(page, perPage).data

}