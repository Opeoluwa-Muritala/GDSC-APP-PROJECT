package com.example.football.Navigation

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gdscpublic.ui.BottomNavigation.NavRoute
import com.example.gdscpublic.ui.theme.Blue
import com.example.gdscpublic.ui.theme.DarkBlue
import com.example.gdscpublic.ui.theme.DarkGray
import com.example.gdscpublic.ui.theme.DarkWhite
import com.example.gdscpublic.ui.theme.Green

@Composable
fun BottomMenu(navController: NavController){
    var selectedItemIndex by remember {
        mutableStateOf(1)
    }

    NavigationBar(Modifier.height(80.dp), ) {
        BottomNavItems().forEachIndexed { index, bottomNavItem ->
            NavigationBarItem(
                selected = index == selectedItemIndex,
                label = {
                    Text(bottomNavItem.title, fontSize = 9.sp)
                },
                icon = {
                    Icon(
                        painter = painterResource(bottomNavItem.iconId),
                        contentDescription = bottomNavItem.title,
                        modifier = Modifier.size(30.dp)
                    )
                },
                onClick = {
                    selectedItemIndex =  index
                    navController.navigate(bottomNavItem.route){
                        popUpTo(NavRoute.Home_page.route){
                        }
                        launchSingleTop =true
                        restoreState = true
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor= Blue,
                    selectedTextColor= Green,
                    unselectedIconColor= DarkGray,
                    unselectedTextColor= DarkWhite,
                    indicatorColor = Color.Unspecified
                )
            )

        }
    }
}




