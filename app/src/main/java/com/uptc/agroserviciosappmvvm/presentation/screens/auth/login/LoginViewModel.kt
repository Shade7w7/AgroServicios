package com.uptc.agroserviciosappmvvm.presentation.screens.auth.login

import android.util.Log
import android.util.Patterns
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uptc.agroserviciosappmvvm.domain.model.User
import com.uptc.agroserviciosappmvvm.domain.useCase.auth.AuthUseCase
import com.uptc.agroserviciosappmvvm.domain.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val authUseCase: AuthUseCase): ViewModel() {

    var state by mutableStateOf(LoginState())
        private set

    var errorMessage by mutableStateOf("")
        private set

    // LOGIN RESPONSE
    var loginResponse by mutableStateOf<Response<User>?>(null)
        private set

    fun login() = viewModelScope.launch {
        if (isValidForm()) {
            loginResponse = Response.Loading // ESPERANDO
            val result = authUseCase.login(state.email, state.password) // RETORNA UNA RESPUESTA
            loginResponse = result // EXITOSA / ERROR
            Log.d("LoginViewModel", "Response: ${loginResponse}")
        }
    }

    fun onEmailInput(email: String){
        state = state.copy(email = email)
    }

    fun onPasswordInput(password: String){
        state = state.copy(password = password)
    }

    fun isValidForm(): Boolean {
        if (state.email == ""){
            errorMessage = "Ingrese el correo"
            return false
        }
        else if (state.password == ""){
            errorMessage = "Ingrese la contraseña"
            return false
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()) {
            errorMessage = "El correo no es valido"
            return false
        }
        else if (state.password.length < 6) {
            errorMessage = "La contraseña debe tener al menos 6 caracteres"
            return false
        }
        return true
    }
}