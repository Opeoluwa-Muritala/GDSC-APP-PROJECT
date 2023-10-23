package com.example.gdscpublic.ui.Components

import androidx.compose.ui.graphics.Color
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdscpublic.ui.theme.OpenSans
import com.example.gdscpublic.ui.theme.White

@Composable
fun QuestionCard(
    question: String,
    answer: String,
    color: Color
){
    var expanded by remember { mutableStateOf(false) }
    val extraPadding by animateDpAsState(
        if (expanded) 10.dp else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioHighBouncy,
            stiffness = Spring.StiffnessLow,
            visibilityThreshold = 2.dp
        )
    )
    val textAlpha by animateFloatAsState(
        if (expanded) 1f else 0f
    )
    Surface(
        color = White,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column {
            Row(Modifier.padding(24.dp)) {

                Text(
                    question, style = TextStyle(
                        fontFamily = OpenSans,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 10.sp
                    ),
                    color = color
                )

                IconButton(onClick = { expanded = !expanded })
                {
                    Icon(
                        if (expanded) Icons.Default.KeyboardArrowDown else Icons.Default.KeyboardArrowUp,
                        null,
                        tint = color
                    )
                }
            }

            Column {
                AnimatedVisibility(
                    visible = expanded,
                    enter = fadeIn(initialAlpha = 0.0f),
                    exit = fadeOut(targetAlpha = 0.0f)
                ) {
                    Text(
                        answer,
                        modifier = Modifier.alpha(textAlpha).padding(16.dp),
                        fontWeight = FontWeight.SemiBold,
                        style = TextStyle(
                            fontFamily = OpenSans,
                            fontWeight = FontWeight.Normal,
                            fontStyle = FontStyle.Normal,
                            fontSize = 10.sp
                        )
                    )
                }
            }
        }
    }
}