package com.uptc.agroserviciosappmvvm.di

import com.uptc.agroserviciosappmvvm.data.repository.dataSource.AuthRemoteDataSource
import com.uptc.agroserviciosappmvvm.data.repository.dataSourceImpl.AuthRemoteDataSourceImpl
import com.uptc.agroserviciosappmvvm.data.service.AuthService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    fun provideAuthRemoteDataSource(authService: AuthService): AuthRemoteDataSource = AuthRemoteDataSourceImpl(authService)
}