package com.alexbar.demoanimation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.alexbar.demoanimation.nav.AppNavigationGraph
import com.alexbar.demoanimation.ui.theme.DemoAnimationTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedContentLambdaTargetStateParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoAnimationTheme {
                AppNavigationGraph(rememberNavController())
            }
        }
    }
}



