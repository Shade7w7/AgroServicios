package com.uptc.agroserviciosappmvvm.data.service

import com.uptc.agroserviciosappmvvm.domain.model.User
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.POST

interface AuthService {

    // http://192.168.100.31:3000/auth/Login
    @POST("auth/login")
    suspend fun login(
        @Field("email_user") email: String,
        @Field("password_user") password: String
    ): Response<User>

}