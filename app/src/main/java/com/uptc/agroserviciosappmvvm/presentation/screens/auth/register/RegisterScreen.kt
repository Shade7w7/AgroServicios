package com.uptc.agroserviciosappmvvm.presentation.screens.auth.register

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.uptc.agroserviciosappmvvm.presentation.screens.auth.register.components.RegisterContent
import com.uptc.agroserviciosappmvvm.presentation.ui.theme.AgroServiciosAppMVVMTheme

@Composable
fun RegisterScreen(navController: NavHostController) {
    Scaffold { paddingValues ->
        RegisterContent(paddingValues = paddingValues)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview() {
    AgroServiciosAppMVVMTheme {
        RegisterScreen(rememberNavController())
    }
}