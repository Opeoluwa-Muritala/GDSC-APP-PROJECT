package com.example.gdscpublic.ui.Components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun Corner(
    text: String,
    backgroundColor: Color,
    textColor: Color,
    @DrawableRes icons: Int,
    content: @Composable ColumnScope.() -> Unit
){
    val icon = icons
    Card(
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        )
    ){
        Column(Modifier.fillMaxSize()) {
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start
            )
            {
                HeaderText(
                text,
                15,
                textColor,)
                Icon(
                    painterResource(icon),
                    tint = textColor,
                    contentDescription = null
                )
            }

            content()
        }
    }
}