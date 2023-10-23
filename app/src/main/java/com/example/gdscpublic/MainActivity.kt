package com.example.gdscpublic

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.football.Navigation.BottomMenu
import com.example.gdscpublic.ui.BottomNavigation.NavRoute
import com.example.gdscpublic.ui.Screens.AboutUs
import com.example.gdscpublic.ui.Screens.Home
import com.example.gdscpublic.ui.Screens.SplashScreen
import com.example.gdscpublic.ui.Screens.Team
import com.example.gdscpublic.ui.theme.GDSCPublicTheme
import com.example.gdscpublic.ui.theme.White
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        WindowCompat.setDecorFitsSystemWindows(window, true)
        super.onCreate(savedInstanceState)
        setContent {
            GDSCPublicTheme(isSystemInDarkTheme()) {
                // A surface container using the 'background' color from the theme
                val systemuicontroller = rememberSystemUiController()
                val  darktheme = isSystemInDarkTheme()
                SideEffect {
                    systemuicontroller.setNavigationBarColor(
                        if (darktheme) Color(51,51,51) else White
                    )
                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Nav(rememberNavController())
                }
            }
        }
    }
}

/*ToDo*/ //GIFS, Infinite Animation

@Composable
fun Nav(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = NavRoute.Splash.route){
        composable(route = NavRoute.Splash.route){
            SplashScreen(navHostController)
        }
        composable(route = NavRoute.Main.route) {
                MainScreen()
        }
    }
}


@Composable
fun Screen(navHostController: NavHostController){

    NavHost(navController = navHostController, startDestination = NavRoute.Home_page.route) {
        composable(route = NavRoute.Home_page.route) {
            Home()
        }
        composable(route = NavRoute.Team.route) {
            Team()
        }
        composable(route = NavRoute.Info.route) {
            AboutUs()
        }
    }
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {


    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomMenu(navController)
        }
    ){
        Screen(navController)
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GDSCPublicTheme {

    }
}