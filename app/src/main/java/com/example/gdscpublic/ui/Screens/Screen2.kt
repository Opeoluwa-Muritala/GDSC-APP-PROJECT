package com.example.gdscpublic.ui.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.gdscpublic.R
import com.example.gdscpublic.ui.Components.Contact
import com.example.gdscpublic.ui.Components.GreetingCard
import com.example.gdscpublic.ui.Components.HeaderText
import com.example.gdscpublic.ui.Components.QuestionCard
import com.example.gdscpublic.ui.theme.Black
import com.example.gdscpublic.ui.theme.White

@Composable
fun Screen2(){
    Column(Modifier.verticalScroll(rememberScrollState())) {
        Card(modifier = Modifier.background(White)) {
            QuestionCard(
                "What is GDSC?",
                "GDSC .......",
                Color.Red
            )
            QuestionCard(
                "What does GDSC mean?",
            "Google Developer Students Club",
            Color.Green
            )
            QuestionCard(
                "Who is the Lead?",
                "GDSC .......",
                Color.Blue
            )
            QuestionCard(
                "What teams are in GDSC?",
                "Google Developer Students Club",
                Color.Yellow
            )
        }
        HeaderText(
            "Contact Us",
            15,
            Black
        )
        GreetingCard(
            R.drawable.whatsapp_back,
            R.drawable.whatsapp,
            "Join The GDSC",
        "WhatsApp Group"
        )
        Row {
            Contact(
                R.drawable.ig,
                "@gdsc_unilorin",
                Color.Red,
                "https://www.google.com/search?q=gdscunilorininstagram"
            )
            Contact(
                R.drawable.x,
                "@gdsc_unilorin",
                Color.Yellow,
                "https://www.google.com/search?q=gdscunilorintwitter"
            )
            Contact(
                R.drawable.mail,
                "gdsc_unilorin@gmail.com",
                Color.Green,
                "https://www.google.com/search?q=gdscunilorinemail"
            )
        }
    }
}