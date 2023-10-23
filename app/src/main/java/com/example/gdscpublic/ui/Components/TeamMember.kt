package com.example.gdscpublic.ui.Components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.gdscpublic.ui.theme.DarkGray
import com.example.gdscpublic.ui.theme.DarkWhite

@Composable
fun TeamMember(
    name: String,
    position: String,
    @DrawableRes image:Int,
    content: @Composable ColumnScope.()->Unit
){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = DarkWhite
        ),
        modifier = Modifier.padding(20.dp)
    ){
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = name + position,
                modifier = Modifier.size(150.dp)
            )
            Text(
                name,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black
            )
            Text(
                position,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )
            content()
        }

    }
}