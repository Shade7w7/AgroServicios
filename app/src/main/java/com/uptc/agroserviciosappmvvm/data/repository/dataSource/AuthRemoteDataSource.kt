package com.uptc.agroserviciosappmvvm.data.repository.dataSource

import com.uptc.agroserviciosappmvvm.domain.model.User
import retrofit2.Response

interface AuthRemoteDataSource {

    suspend fun login(email: String, password: String): Response<User>

}