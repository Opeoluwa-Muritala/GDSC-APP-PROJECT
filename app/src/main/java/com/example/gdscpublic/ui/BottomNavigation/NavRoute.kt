package com.example.gdscpublic.ui.BottomNavigation

sealed class NavRoute(val route: String){
    object Splash : NavRoute("Splash")
    object Home_page : NavRoute("Home")
    object Info : NavRoute("Info")
    object Team : NavRoute("Team")
    object Main : NavRoute("Main")
}
