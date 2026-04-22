package com.chelsea.markethub.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chelsea.markethub.ui.screens.about.AboutScreen
import com.chelsea.markethub.ui.screens.auth.LoginScreen
import com.chelsea.markethub.ui.screens.auth.RegisterScreen
import com.chelsea.markethub.ui.screens.home.HomeScreen
import com.chelsea.markethub.ui.screens.OnBoardingScreen.OnBoardingScreen
import com.chelsea.markethub.ui.screens.intent.IntentScreen
import com.chelsea.markethub.ui.screens.payments.PaymentsScreen
import com.chelsea.markethub.ui.screens.scaffold.ScaffoldScreen
import com.chelsea.markethub.ui.screens.service.ServiceScreen
import com.chelsea.markethub.ui.screens.splash.SplashScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ONBOARDING
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ONBOARDING) {
            OnBoardingScreen(navController)
        }
        composable(ROUT_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUT_PAYMENT) {
            PaymentsScreen(navController)
        }
        composable(ROUT_SERVICES) {
            ServiceScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_SCAFFOLD) {
            ScaffoldScreen(navController)
        }
    }
}
