package com.example.helloworld.di

import com.example.helloworld.data.preference.DataStoreRepository
import com.example.helloworld.data.preference.DataStoreRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindDataStoreRepository(repo: DataStoreRepositoryImpl): DataStoreRepository

}

