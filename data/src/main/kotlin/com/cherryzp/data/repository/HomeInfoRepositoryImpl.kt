package com.cherryzp.data.repository

import com.cherryzp.data.mapper.toDomain
import com.cherryzp.data.source.HomeInfoNetworkDataSource
import com.cherryzp.domain.model.HomeAptInfoDetail
import com.cherryzp.domain.repository.HomeInfoRepository
import javax.inject.Inject

class HomeInfoRepositoryImpl @Inject constructor(
    private val dataSource: HomeInfoNetworkDataSource,
) : HomeInfoRepository {
    override suspend fun getHomeAptInfo(page: Int, perPage: Int): List<HomeAptInfoDetail> =
        dataSource.getHomeAptInfo(page, perPage)
            .map {
                it.toDomain()
            }

}