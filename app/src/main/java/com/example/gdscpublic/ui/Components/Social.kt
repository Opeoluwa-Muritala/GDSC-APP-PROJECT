package com.example.gdscpublic.ui.Components

import androidx.compose.ui.graphics.Color
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.gdscpublic.ui.theme.White

@Composable
fun Contact(
    @DrawableRes icon: Int,
    SocialAccount: String,
    color: Color
){
    Card(
        colors = cardColors(
            containerColor = color,
        ),
        shape = RoundedCornerShape(10.dp),
        elevation = cardElevation(
            defaultElevation = 5.dp
        ),
        modifier = Modifier
            .clickable { /*TODO*/ }
            .height(50.dp).width(70.dp).padding(10.dp)
    ){
        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(icon),
                contentDescription = SocialAccount,
                Modifier.size(50.dp),
                colorFilter = ColorFilter.tint(White)
            )
            Text(
                SocialAccount,
                fontWeight = FontWeight.Normal,
                color = White,
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}