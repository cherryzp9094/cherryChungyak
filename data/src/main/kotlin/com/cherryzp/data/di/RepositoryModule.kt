package com.cherryzp.data.di

import com.cherryzp.data.repository.HomeInfoRepositoryImpl
import com.cherryzp.domain.repository.HomeInfoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindsHomeInfoRepository(
        homeInfoRepositoryImpl: HomeInfoRepositoryImpl
    ): HomeInfoRepository

}