package com.uptc.agroserviciosappmvvm.data.repository.dataSourceImpl

import com.uptc.agroserviciosappmvvm.data.repository.dataSource.AuthRemoteDataSource
import com.uptc.agroserviciosappmvvm.data.service.AuthService
import com.uptc.agroserviciosappmvvm.domain.model.User
import retrofit2.Response

class AuthRemoteDataSourceImpl(private val authService:AuthService): AuthRemoteDataSource{

    override suspend fun login(email: String, password: String) = authService.login(email, password)

}