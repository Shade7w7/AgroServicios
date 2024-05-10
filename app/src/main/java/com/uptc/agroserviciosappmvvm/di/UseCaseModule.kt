package com.uptc.agroserviciosappmvvm.di

import com.uptc.agroserviciosappmvvm.domain.repository.AuthRepository
import com.uptc.agroserviciosappmvvm.domain.useCase.auth.AuthUseCase
import com.uptc.agroserviciosappmvvm.domain.useCase.auth.LoginUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideAuthUseCase(authRepository: AuthRepository) = AuthUseCase(
        login = LoginUseCase(authRepository)
    )

}