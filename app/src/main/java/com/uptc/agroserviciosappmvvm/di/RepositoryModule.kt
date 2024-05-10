package com.uptc.agroserviciosappmvvm.di

import com.uptc.agroserviciosappmvvm.data.repository.AuthRepositoryImpl
import com.uptc.agroserviciosappmvvm.data.repository.dataSource.AuthRemoteDataSource
import com.uptc.agroserviciosappmvvm.data.repository.dataSourceImpl.AuthRemoteDataSourceImpl
import com.uptc.agroserviciosappmvvm.data.service.AuthService
import com.uptc.agroserviciosappmvvm.domain.repository.AuthRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideAuthRepository(authRemoteDataSource: AuthRemoteDataSource): AuthRepository = AuthRepositoryImpl(authRemoteDataSource)
}