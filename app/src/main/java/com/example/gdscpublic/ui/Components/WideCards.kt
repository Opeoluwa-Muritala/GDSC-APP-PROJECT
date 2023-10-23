package com.example.gdscpublic.ui.Components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdscpublic.ui.theme.OpenSans
import com.example.gdscpublic.ui.theme.White

@Composable
fun GreetingCard(
    @DrawableRes image: Int,
    @DrawableRes icon: Int,
    text: String,
    sub: String
){
    Card(
        modifier = Modifier.fillMaxWidth().padding(10.dp).height(80.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painterResource( image),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )
            Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
                Column(Modifier.padding(5.dp)) {
                    Text(
                    text = text,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = OpenSans,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 20.sp
                    ),
                        color = White
                )

                Text(
                    text = sub,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = OpenSans,
                        fontWeight = FontWeight.Light,
                        fontStyle = FontStyle.Normal,
                        fontSize = 10.sp
                    ),
                    color = White
                )}
                Image(
                    painterResource(icon),
                    modifier = Modifier.size(70.dp).padding(5.dp),
                    contentDescription = text
                )
            }
        }
    }
}