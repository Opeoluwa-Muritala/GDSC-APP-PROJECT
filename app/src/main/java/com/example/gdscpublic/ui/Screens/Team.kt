package com.example.gdscpublic.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gdscpublic.R
import com.example.gdscpublic.ui.Components.Contact
import com.example.gdscpublic.ui.Components.GreetingCard
import com.example.gdscpublic.ui.Components.HeaderText
import com.example.gdscpublic.ui.Components.QuestionCard
import com.example.gdscpublic.ui.Components.TeamMember
import com.example.gdscpublic.ui.Components.imbutton
import com.example.gdscpublic.ui.theme.Black
import com.example.gdscpublic.ui.theme.Blue
import com.example.gdscpublic.ui.theme.DarkRed
import com.example.gdscpublic.ui.theme.DarkWhite
import com.example.gdscpublic.ui.theme.DarkYellow
import com.example.gdscpublic.ui.theme.GDSCPublicTheme
import com.example.gdscpublic.ui.theme.Green
import com.example.gdscpublic.ui.theme.Red
import com.example.gdscpublic.ui.theme.White

@Composable
fun Team() {

    Column {
        Column() {
            Row(
                modifier = Modifier.padding(start = 5.dp).fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                HeaderText(
                    "GDSC TEAM",
                    30,
                    if (isSystemInDarkTheme()) DarkWhite else Black
                )
                Image(
                    painterResource(R.drawable.gdsc_logo),
                    contentDescription = null,
                    modifier = Modifier.size(70.dp)
                )
            }
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
            //GIF Animation /*TODO*/
        }
        Column(
            Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(bottom = 90.dp),

            ) {
            //GDSC GIF /*TODO*/
            HeaderText(
                "GDSC LEAD",
                20,
                if (isSystemInDarkTheme()) DarkWhite else Black

            )
            TeamMember(
                "Black Black Sheep",
                "Lead",
                R.drawable.baseline_person_outline_24
            ) {
                Row {
                    imbutton(R.drawable.instagram)
                    imbutton(R.drawable.whatsapp)
                    imbutton(R.drawable.x)
                    imbutton(R.drawable.youtube)
                    imbutton(R.drawable.github)
                }
            }

            HeaderText(
                "GDSC CORE TEAM",
                20,
                if (isSystemInDarkTheme()) DarkWhite else Black
            )
            Row(Modifier.horizontalScroll(rememberScrollState())) {
                TeamMember(
                    "Black Black Sheep",
                    "Lead",
                    R.drawable.baseline_person_outline_24
                ) {
                    Row {
                        imbutton(R.drawable.instagram)
                        imbutton(R.drawable.whatsapp)
                        imbutton(R.drawable.x)
                        imbutton(R.drawable.youtube)
                        imbutton(R.drawable.github)
                    }
                }
                TeamMember(
                    "Black Black Sheep",
                    "Lead",
                    R.drawable.baseline_person_outline_24
                ) {
                    Row {
                        imbutton(R.drawable.instagram)
                        imbutton(R.drawable.whatsapp)
                        imbutton(R.drawable.x)
                        imbutton(R.drawable.youtube)
                        imbutton(R.drawable.github)
                    }
                }
                TeamMember(
                    "Black Black Sheep",
                    "Lead",
                    R.drawable.baseline_person_outline_24
                ) {
                    Row {
                        imbutton(R.drawable.instagram)
                        imbutton(R.drawable.whatsapp)
                        imbutton(R.drawable.x)
                        imbutton(R.drawable.youtube)
                        imbutton(R.drawable.github)
                    }
                }
            }
            Row(Modifier.horizontalScroll(rememberScrollState())) {
                TeamMember(
                    "Black Black Sheep",
                    "Lead",
                    R.drawable.baseline_person_outline_24
                ) {
                    Row {
                        imbutton(R.drawable.ig)
                        imbutton(R.drawable.whatsapp)
                        imbutton(R.drawable.x)
                        imbutton(R.drawable.youtube)
                        imbutton(R.drawable.github)
                    }
                }
                TeamMember(
                    "Black Black Sheep",
                    "Lead",
                    R.drawable.baseline_person_outline_24
                ) {
                    Row {
                        imbutton(R.drawable.ig)
                        imbutton(R.drawable.whatsapp)
                        imbutton(R.drawable.x)
                        imbutton(R.drawable.youtube)
                        imbutton(R.drawable.github)
                    }
                }
                TeamMember(
                    "Black Black Sheep",
                    "Lead",
                    R.drawable.baseline_person_outline_24
                ) {
                    Row {
                        imbutton(R.drawable.ig)
                        imbutton(R.drawable.whatsapp)
                        imbutton(R.drawable.x)
                        imbutton(R.drawable.youtube)
                        imbutton(R.drawable.github)
                    }
                }
            }


            HeaderText(
                "Contact Us",
                20,
                if (isSystemInDarkTheme()) DarkWhite else Black
            )
            Card(
                modifier = Modifier.padding(vertical = 10.dp, horizontal = 10.dp),
                colors = CardDefaults.cardColors(containerColor = White)
            ) {
                GreetingCard(
                    R.drawable.whatsapp_back,
                    R.drawable.whatsapp,
                    "Join The GDSC",
                    "WhatsApp Group"
                )
                Row(Modifier.horizontalScroll(rememberScrollState())) {
                    Contact(
                        R.drawable.ig,
                        "@gdsc_unilorin",
                        DarkYellow,
                        "https://www.google.com/search?q=gdscunilorininstagram"
                    )
                    Contact(
                        R.drawable.x,
                        "@gdsc_unilorin",
                        MaterialTheme.colorScheme.onPrimaryContainer,
                        "https://www.google.com/search?q=gdscunilorintwitter"
                    )
                    Contact(
                        R.drawable.mail,
                        "gdsc_unilorin@gmail.com",
                        DarkRed,
                        "https://www.google.com/search?q=gdscunilorinemail"
                    )
                }
            }
        }
    }
}

