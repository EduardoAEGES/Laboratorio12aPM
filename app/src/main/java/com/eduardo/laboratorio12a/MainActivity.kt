package com.eduardo.laboratorio12a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenMain()
        }
    }
}

@Composable
fun ScreenMain(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            ScreenLogin(navController = navController)
        }
        composable("response/{logeado}"){navBackStackEntry ->
    ScreenResponse(
        navController = navController,
        logeado = navBackStackEntry.arguments?.getString("logeado").orEmpty())
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ScreenMain()
}