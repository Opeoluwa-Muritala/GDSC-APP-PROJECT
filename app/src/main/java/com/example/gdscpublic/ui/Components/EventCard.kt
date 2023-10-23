package com.example.gdscpublic.ui.Components

import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.gdscpublic.ui.theme.DarkWhite
import com.example.gdscpublic.ui.theme.OpenSans
import com.example.gdscpublic.ui.theme.White

@Composable
fun Event(
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

@Composable
fun TrackCard(
    text: String,
    @DrawableRes image: Int
){
    val context = LocalContext.current
    Card(
        Modifier.padding(20.dp).height(200.dp).width(170.dp).clickable {
            Toast.makeText(context, "Coming Soon *_*", Toast.LENGTH_LONG).show()
        }
    ) {
        Column(
            Modifier.fillMaxSize().background(White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painterResource(image),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            Text(text, style = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ))
        }
    }
}