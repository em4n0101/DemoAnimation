package com.alexbar.demoanimation.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alexbar.demoanimation.screens.list.ListScreen
import com.alexbar.demoanimation.screens.onboarding.OnboardingScreen

@Composable
fun AppNavigationGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screens.OnboardingScreen.route
    ) {
        composable(route = Screens.OnboardingScreen.route) {
            OnboardingScreen {
                navController.navigate(Screens.ListScreen.route)
            }
        }
        composable(route = Screens.ListScreen.route) {
            ListScreen ()
        }
    }
}
