package com.alexbar.demoanimation.nav

sealed class Screens(val route: String) {
    object OnboardingScreen : Screens("onboarding_screen")
    object ListScreen : Screens("list_screen")
}
