package com.example.walkthroughscaffold.ui.theme.composables

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.walkthroughscaffold.ui.theme.screens.InfoScreen
import com.example.walkthroughscaffold.ui.theme.screens.SettingsScreen

@Composable
fun ScaffoldApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable(route = "home")  { MainScreen(navController)  }
        composable(route = "info")  { InfoScreen(navController)  }
        composable(route = "settings")  { SettingsScreen(navController)  }
    }
}