package com.uptc.agroserviciosappmvvm.data.repository

import com.uptc.agroserviciosappmvvm.data.repository.dataSource.AuthRemoteDataSource
import com.uptc.agroserviciosappmvvm.domain.model.User
import com.uptc.agroserviciosappmvvm.domain.repository.AuthRepository
import com.uptc.agroserviciosappmvvm.domain.util.Response
import java.lang.Exception

class AuthRepositoryImpl(private val authRemoteDataSource: AuthRemoteDataSource): AuthRepository {

    override suspend fun login(email: String, password: String): Response<User> {
        return try {
            val result = authRemoteDataSource.login(email, password)
            Response.Success(result.body()!!)
        } catch (e: Exception) {
            e.printStackTrace()
            Response.Failure(e)
        }
    }
}