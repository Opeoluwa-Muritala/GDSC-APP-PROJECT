package com.example.gdscpublic.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gdscpublic.R
import com.example.gdscpublic.ui.Components.HeaderText
import com.example.gdscpublic.ui.theme.Black
import com.example.gdscpublic.ui.theme.Blue
import com.example.gdscpublic.ui.theme.DarkBlue
import com.example.gdscpublic.ui.theme.DarkGreen
import com.example.gdscpublic.ui.theme.DarkRed
import com.example.gdscpublic.ui.theme.DarkWhite
import com.example.gdscpublic.ui.theme.DarkYellow
import com.example.gdscpublic.ui.theme.Green
import com.example.gdscpublic.ui.theme.OpenSans
import com.example.gdscpublic.ui.theme.Red
import com.example.gdscpublic.ui.theme.Yellow

@OptIn(ExperimentalTextApi::class)
@Composable
fun Home(){
    Column {
        Row(
            modifier = Modifier.padding(start = 5.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                "Developer Students Club",
                fontSize = 20.sp,
                color = if (isSystemInDarkTheme()) DarkWhite else Black,
                style = TextStyle(
                    fontFamily = OpenSans,
                    fontWeight = FontWeight.SemiBold,
                    fontStyle = FontStyle.Normal,
                )
            )
            Image(
                painterResource(R.drawable.gdsc_logo),
                contentDescription = null,
                modifier = Modifier.size(70.dp).padding(top = 37.dp)
            )
        }
        Text(
            "University Of Ilorin",
            style = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.Light,
                fontSize = 15.sp
            ),
            modifier = Modifier.padding(start = 5.dp)
        )
        Row(
            Modifier.fillMaxWidth().padding(5.dp)
        ) {
            Divider(
                thickness = 3.dp,
                color = Blue,
                modifier = Modifier.width(90.dp)
            )
            Divider(
                thickness = 3.dp,
                color = Red,
                modifier = Modifier.width(90.dp)
            )
            Divider(
                thickness = 3.dp,
                color = Green,
                modifier = Modifier.width(90.dp)
            )
            Divider(
                thickness = 3.dp,
                color = Color.Yellow,
                modifier = Modifier.width(90.dp)
            )
        }

        HeaderText(
            "Upcoming Events",
            20,
            if (isSystemInDarkTheme()) DarkWhite else Black
        )
        Box(Modifier.size(100.dp, 120.dp).shadow(10.dp))
        HeaderText(
            "Past Events",
            20,
            if (isSystemInDarkTheme()) DarkWhite else Black
        )
        Box(Modifier.size(100.dp, 120.dp).shadow(10.dp))
    }
}