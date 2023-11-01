package com.example.gdscpublic.ui.Components

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
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
    widthOfShadow: Int = 500,
    angleOfAxisY: Float = 270f,
    durationMillis: Int = 1000,
    content: @Composable ColumnScope.()->Unit
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
            Text(
                name,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,
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
            Text(
                position,
                fontWeight = FontWeight.Normal,
                color = Color.Black,
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
            content()
        }

    }
}