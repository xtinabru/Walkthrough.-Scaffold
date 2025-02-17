package com.example.walkthroughscaffold.ui.theme.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Scaffold (
        topBar = { MainTopAppBar("My app", navController) },
    ) { innerPadding ->
        Text(text = "Home Screen", modifier = Modifier.padding(innerPadding))
    }
}