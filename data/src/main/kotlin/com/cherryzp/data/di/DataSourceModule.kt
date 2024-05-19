package com.cherryzp.data.di

import com.cherryzp.data.source.HomeInfoNetworkDataSource
import com.cherryzp.data.source.HomeInfoNetworkDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    fun bindsHomeInfoNetworkDataSource(
        homeInfoNetworkDataSource: HomeInfoNetworkDataSourceImpl
    ): HomeInfoNetworkDataSource
}