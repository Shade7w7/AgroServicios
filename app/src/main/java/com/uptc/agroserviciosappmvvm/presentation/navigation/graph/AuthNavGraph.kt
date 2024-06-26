package com.uptc.agroserviciosappmvvm.presentation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.uptc.agroserviciosappmvvm.presentation.navigation.Graph
import com.uptc.agroserviciosappmvvm.presentation.navigation.screen.AuthScreen
import com.uptc.agroserviciosappmvvm.presentation.screens.auth.login.LoginScreen
import com.uptc.agroserviciosappmvvm.presentation.screens.auth.register.RegisterScreen

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(navController)
        }
        composable(route = AuthScreen.Register.route) {
            RegisterScreen(navController)
        }
    }
}