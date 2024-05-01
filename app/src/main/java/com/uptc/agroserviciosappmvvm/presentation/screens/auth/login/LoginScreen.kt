package com.uptc.agroserviciosappmvvm.presentation.screens.auth.login

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.uptc.agroserviciosappmvvm.presentation.screens.auth.login.components.LoginContent
import com.uptc.agroserviciosappmvvm.presentation.ui.theme.AgroServiciosAppMVVMTheme

@Composable
fun LoginScreen(navController: NavHostController){
    Scaffold (
    ) { paddingValues ->
        LoginContent(navController = navController, paddingValues)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    AgroServiciosAppMVVMTheme {
        LoginScreen(rememberNavController())
    }
}
