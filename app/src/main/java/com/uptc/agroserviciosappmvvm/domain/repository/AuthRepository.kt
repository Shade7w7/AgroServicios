package com.uptc.agroserviciosappmvvm.domain.repository

import com.uptc.agroserviciosappmvvm.domain.model.User
import com.uptc.agroserviciosappmvvm.domain.util.Response

interface AuthRepository {

    suspend fun login(email: String, password: String): Response<User>

}