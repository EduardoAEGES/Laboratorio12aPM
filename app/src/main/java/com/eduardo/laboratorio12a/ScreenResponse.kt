package com.eduardo.laboratorio12a
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenResponse(navController: NavController, logeado:String) {
    val partes = logeado.split(">")
    val  username= partes[0]
    val password = partes[1]
    Column(verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()){
        Text(text = "Esta es la segunda pantalla", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(25.dp))
        Text(text = "Su usuario es: $username", fontSize = 25.sp)
        Text(text = "Su contraseña es: $password", fontSize = 25.sp)
    }
}