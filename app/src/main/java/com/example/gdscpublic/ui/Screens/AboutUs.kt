package com.example.gdscpublic.ui.Screens

import android.content.Intent
import android.net.Uri
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
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
import androidx.compose.ui.unit.sp
import com.example.gdscpublic.R
import com.example.gdscpublic.ui.Components.HeaderText
import com.example.gdscpublic.ui.Components.QuestionCard
import com.example.gdscpublic.ui.Components.TrackCard
import com.example.gdscpublic.ui.Components.imbutton
import com.example.gdscpublic.ui.theme.Black
import com.example.gdscpublic.ui.theme.Blue
import com.example.gdscpublic.ui.theme.DarkWhite
import com.example.gdscpublic.ui.theme.Green
import com.example.gdscpublic.ui.theme.OpenSans
import com.example.gdscpublic.ui.theme.Red
import com.example.gdscpublic.ui.theme.White

@Composable
fun AboutUs(){
    val context = LocalContext.current
    val join = Intent(Intent.ACTION_VIEW, Uri.parse("https://gdsc.community.dev/university-of-ilorin/"))
    val website = Intent(Intent.ACTION_VIEW, Uri.parse("https://gdsc.community.dev/"))

    Column {
        Column() {
            Row(
                modifier = Modifier.padding(start = 5.dp).fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                HeaderText(
                    "About Us",
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

            ElevatedCard(Modifier.fillMaxWidth().padding(20.dp)) {
                Text(
                    "Google Developer Student\n" +
                            "Clubs (GDSC) are community\n" +
                            "groups for college and\n" +
                            "university students interested\n" +
                            "in Google developer\n" +
                            "technologies. Students from\n" +
                            "all undergraduate or graduate\n" +
                            "programs with an interest\n" +
                            "in growing as a developer\n" +
                            "are welcome. By joining a\n" +
                            "GDSC, students grow their\n" +
                            "knowledge in a peer-to-peer\n" +
                            "learning environment and build\n" +
                            "solutions for local businesses\n" +
                            "and their community.",
                    style = TextStyle(
                        fontFamily = OpenSans,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Normal
                    ),
                    color = if (isSystemInDarkTheme()) DarkWhite else Black,
                    modifier = Modifier.padding(5.dp),
                    fontSize = 15.sp

                )
            }

                Row(
                    Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.Center
                ) {
                    imbutton(R.drawable.instagram)
                    imbutton(R.drawable.whatsapp)
                    imbutton(R.drawable.x)
                    imbutton(R.drawable.youtube)
                    imbutton(R.drawable.open_source_one)
                    imbutton(R.drawable.linkdin)
                    imbutton(R.drawable.tiktok)
                    imbutton(R.drawable.mail)
                }

            Column(
                Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedButton(onClick = {context.startActivity(website)}) {
                    Text("Official WebSite")
                }
            }
            ElevatedCard(Modifier.fillMaxWidth().padding(20.dp)) {
                HeaderText(
                    "Join Our Community",
                    15,
                    if (isSystemInDarkTheme()) DarkWhite else Black
                )
                Text(
                    "Backed by a community of\n" +
                            "passionate student developers\n" +
                            "from across the globe. Get access\n" +
                            "to all our resources, attend events,\n" +
                            "work together and connect with\n" +
                            "other passionate developers.",
                    style = TextStyle(
                        fontFamily = OpenSans,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Normal
                    ),
                    color = if (isSystemInDarkTheme()) DarkWhite else Black,
                    modifier = Modifier.padding(5.dp),
                    fontSize = 15.sp
                )
                Button(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Green,
                        contentColor = DarkWhite
                    ),
                    onClick = {context.startActivity(join)},
                    modifier = Modifier.padding(start = 5.dp, bottom = 10.dp)
                ) {
                    Text("Become A Member")
                }
            }
            HeaderText(
                "Tracks",
                20,
                if (isSystemInDarkTheme()) DarkWhite else Black,
            )
            Row(Modifier.horizontalScroll(rememberScrollState())) {
                TrackCard(
                    "App Development",
                    R.drawable.mobile_dev
                )
                TrackCard(
                    "CyberSecurity",
                    R.drawable.encrypt_color
                )
                TrackCard(
                    "Web Development",
                    R.drawable.web_dev
                )
                TrackCard(
                    "Open Source",
                    R.drawable.open_source_main
                )
                TrackCard(
                    "Much More",
                    R.drawable.box
                )
            }
            HeaderText(
                "Frequently Asked Questions(FAQ)",
                20,
                if (isSystemInDarkTheme()) DarkWhite else Black,
            )
            Card(
                modifier = Modifier.padding(vertical = 10.dp, horizontal = 10.dp),
                colors = CardDefaults.cardColors(containerColor = White)
            ) {
                QuestionCard(
                    "What is GDSC?",
                    "GDSC .......",
                    MaterialTheme.colorScheme.primary
                )
                QuestionCard(
                    "What does GDSC mean?",
                    "Google Developer Students Club",
                    Color.Green
                )
                QuestionCard(
                    "Who is the Lead?",
                    "GDSC .......",
                    MaterialTheme.colorScheme.secondary
                )
                QuestionCard(
                    "What teams are in GDSC?",
                    "Google Developer Students Club",
                    MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
        }
    }
}