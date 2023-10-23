package com.example.gdscpublic.ui.Components

import android.content.Intent
import android.net.Uri
import androidx.compose.ui.graphics.Color
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdscpublic.ui.theme.OpenSans
import com.example.gdscpublic.ui.theme.White
import java.net.URI

@Composable
fun Contact(
    @DrawableRes icon: Int,
    SocialAccount: String,
    color: Color,
    uri: String
){
    val context = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse(uri)) }
    Card(
        colors = cardColors(
            containerColor = color,
        ),
        shape = RoundedCornerShape(10.dp),
        elevation = cardElevation(
            defaultElevation = 5.dp
        ),
        modifier = Modifier
            .clickable { context.startActivity(intent) }
            .height(100.dp).width(130.dp).padding(10.dp)
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
                style = TextStyle(
                    fontFamily = OpenSans,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal,
                    fontSize = 10.sp
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun imbutton(@DrawableRes image: Int){
    val context = LocalContext.current
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linktr.ee/gdsc_unilorin"))
     Image(
            painterResource(image),
            modifier = Modifier.size(40.dp).padding(start = 10.dp).clickable {
                context.startActivity(intent)
            },
            contentDescription = null
        )

}