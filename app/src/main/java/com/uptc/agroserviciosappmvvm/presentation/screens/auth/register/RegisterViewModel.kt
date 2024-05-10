package com.uptc.agroserviciosappmvvm.presentation.screens.auth.register

import android.util.Patterns
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(): ViewModel() {

    var state by mutableStateOf(RegisterState())
        private set

    var errorMessage by mutableStateOf("")
        private set

    fun onNameInput(input: String) {
        state = state.copy(name = input)
    }

    fun onLastNameInput(input: String) {
        state = state.copy(lastname = input)
    }

    fun onEmailInput(input: String) {
        state = state.copy(email = input)
    }

    fun onPasswordInput(input: String) {
        state = state.copy(password = input)
    }

    fun validateForm() = viewModelScope.launch{
        if (state.name == ""){
            errorMessage = "Ingrese el nombre"
        }
        else if (state.lastname == ""){
            errorMessage = "Ingrese el apellido"
        }
        else if (state.email == ""){
            errorMessage = "Ingrese el correo"
        }
        else if (state.password == ""){
            errorMessage = "Ingrese la contraseña"
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()) {
            errorMessage = "El correo no es valido"
        }
        else if (state.password.length < 6) {
            errorMessage = "La contraseña debe tener al menos 6 caracteres"
        }
        delay(2000)
        errorMessage = ""
    }
}