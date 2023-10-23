package com.example.gdscpublic.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.gdscpublic.R
import com.example.gdscpublic.ui.BottomNavigation.NavRoute
import com.example.gdscpublic.ui.theme.GDSCPublicTheme
import com.example.gdscpublic.ui.theme.White
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    GDSCPublicTheme{
        Column(
            Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painterResource(R.drawable.gdsc_logo),
                contentDescription = null
            )
        }
        LaunchedEffect(Unit) {
            delay(2000)
            navController.navigate(NavRoute.Main.route)
        }
    }
}