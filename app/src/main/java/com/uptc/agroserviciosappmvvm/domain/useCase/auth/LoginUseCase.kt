package com.uptc.agroserviciosappmvvm.domain.useCase.auth

import com.uptc.agroserviciosappmvvm.domain.repository.AuthRepository

class LoginUseCase(private val repository: AuthRepository) {

    suspend operator fun invoke(email: String, password: String) = repository.login(email, password)

}