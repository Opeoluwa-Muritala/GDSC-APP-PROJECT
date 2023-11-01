package com.example.gdscpublic.ui.Screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdscpublic.R
import com.example.gdscpublic.ui.Components.HeaderText
import com.example.gdscpublic.ui.Components.shimmerLoadingAnimation
import com.example.gdscpublic.ui.theme.Black
import com.example.gdscpublic.ui.theme.Blue
import com.example.gdscpublic.ui.theme.DarkWhite
import com.example.gdscpublic.ui.theme.Green
import com.example.gdscpublic.ui.theme.OpenSans
import com.example.gdscpublic.ui.theme.Red

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
        Column(
            Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(bottom = 90.dp),

            ) {
            HeaderText(
                "Upcoming Events",
                20,
                if (isSystemInDarkTheme()) DarkWhite else Black
            )
            /*Todo*/ // Infinite Animation
            repeat(10) {
                InfiniteLoadingBox()
            }
            HeaderText(
                "Past Events",
                20,
                if (isSystemInDarkTheme()) DarkWhite else Black
            )
            /*Todo*/ // Infinite Animation
            repeat(10) {
                InfiniteLoadingBox()
            }
        }
    }
}

@Composable
fun InfiniteLoadingBox(
    widthOfShadow: Int = 500,
    angleOfAxisY: Float = 270f,
    durationMillis: Int = 1000,
) {
    val shimmerColors = listOf(
        Color.White.copy(alpha = 0.3f),
        Color.White.copy(alpha = 0.5f),
        Color.White.copy(alpha = 1.0f),
        Color.White.copy(alpha = 0.5f),
        Color.White.copy(alpha = 0.3f)
    )
    val transition = rememberInfiniteTransition()
    val translateAnimation = transition.animateFloat(
        initialValue = 0f,
        targetValue = (durationMillis + widthOfShadow).toFloat(),
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = durationMillis,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        ) ,

        )


    Spacer(Modifier.height(10.dp))
    Row(
        modifier = Modifier
            .fillMaxWidth().background(Color.LightGray).padding(bottom = 10.dp, top = 10.dp)
            .height(40.dp),
        horizontalArrangement = Arrangement.SpaceEvenly// Define your desired height
    ) {
        // Logo with animated alpha loading
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(1f).clip(CircleShape).shimmerLoadingAnimation()
        )

        // Text with animated alpha loading
        Box(
            modifier = Modifier
                .fillMaxHeight().size(200.dp, 30.dp)
                .padding(8.dp) .shimmerLoadingAnimation()// Add padding as needed
        )

        // Calendar Icon with animated alpha loading
        Image(
            painter = painterResource(id = R.drawable.calender_icon), // Replace with your calendar icon
            contentDescription = null, // Provide a meaningful description
            modifier = Modifier
                .fillMaxHeight()
                .alpha(0.1f)
                .graphicsLayer(alpha = 0.99f)
                .drawWithCache {
                    onDrawWithContent {
                      drawContent()
                      drawRect(brush = Brush.linearGradient(
                          shimmerColors,
                          start = Offset(translateAnimation.value - widthOfShadow, 0.0f),
                          end = Offset(translateAnimation.value, angleOfAxisY)
                      ), blendMode = BlendMode.SrcAtop
                      )
                    }
                }
        )

        // Meeting Icon with animated alpha loading
        Image(
            painter = painterResource(id = R.drawable.meet), // Replace with your meeting icon
            contentDescription = null, // Provide a meaningful description
            modifier = Modifier
                .fillMaxHeight()
                .alpha(0.1f)
                .graphicsLayer(alpha = 0.99f)
                .drawWithCache {
                    onDrawWithContent {
                        drawContent()
                        drawRect(brush = Brush.linearGradient(
                            shimmerColors,
                            start = Offset(translateAnimation.value - widthOfShadow, 0.0f),
                            end = Offset(translateAnimation.value, angleOfAxisY)
                        ), blendMode = BlendMode.SrcAtop
                        )
                    }
                }
        )
    }
    Spacer(Modifier.height(10.dp))
}


