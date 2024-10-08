package com.example.mayapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mayapp.ui.theme.screens.home.HomeScreen
import com.example.mayapp.ui.theme.screens.login.LoginScreen
import com.example.mayapp.ui.theme.screens.products.AddProductsScreen
import com.example.mayapp.ui.theme.screens.products.ViewProductsScreen
import com.example.mayapp.ui.theme.screens.signup.SignupScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_HOME
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

            composable(ROUT_HOME) {
               HomeScreen(navController = navController)
            }
        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL) {
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL) {
          ViewProductsScreen(navController = navController)
        }



    }
}