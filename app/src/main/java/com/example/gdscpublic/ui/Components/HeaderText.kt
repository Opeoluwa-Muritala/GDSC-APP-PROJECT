package com.example.gdscpublic.ui.Components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdscpublic.ui.theme.OpenSans

@Composable
fun HeaderText(
    text: String,
    fontSize: Int,
    color: Color,
){
    Text(
        text,
        style = TextStyle(
            fontFamily = OpenSans,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = fontSize.sp
        ),
        color = color,
        modifier = Modifier.padding(10.dp)
    )
}