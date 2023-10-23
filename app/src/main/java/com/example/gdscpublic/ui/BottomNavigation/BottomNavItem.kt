package com.example.football.Navigation

import androidx.annotation.DrawableRes
import com.example.gdscpublic.R
import com.example.gdscpublic.ui.BottomNavigation.NavRoute

data class BottomNavItem(
    val title: String,
    @DrawableRes val iconId:Int,
    val route: String
)
    fun BottomNavItems(): List<BottomNavItem>{
        return listOf(
            BottomNavItem("About Us", R.drawable.info, NavRoute.Info.route),
            BottomNavItem("GDSC", R.drawable.gdsc_logo, NavRoute.Home_page.route),
            BottomNavItem("Team", R.drawable.baseline_people_24, NavRoute.Team.route)
        )
    }

