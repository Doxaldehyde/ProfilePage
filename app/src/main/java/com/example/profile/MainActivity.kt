package com.example.profile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profile.ui.theme.ProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProfileImage(name = "Dox Aldehyde", duty = "Android Developer Extraordinaire")
                }
            }
        }
    }
}

@Composable
fun ProfileImage(name: String, duty: String) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.profileBackground))
    ) {


        Box {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null, modifier = Modifier
                    .padding(top = 250.dp, start = 150.dp, end = 150.dp)
            )

            Profile(name = name, duty = duty)
        }
    }
}

@Composable
fun Profile(name: String, duty: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = name, modifier = Modifier.padding(top = 350.dp),
            fontSize = 40.sp, color = Color.White
        )
        Text(
            text = duty,
            modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
            color = Color.Green,
            fontSize = 18.sp
        )
    }
    Row(modifier = Modifier.padding(start = 45.dp, top = 550.dp, bottom = 10.dp)) {
        TextFieldDefaults
        Icon(
            imageVector = Icons.Default.Share,
            contentDescription = null,
            modifier = Modifier,
            tint = Color.Green
        )
        Text(text = "Dox_aldehyde/Instagram", modifier = Modifier.padding(start = 8.dp),color = Color.White)
    }
    Row(modifier = Modifier.padding(start = 45.dp, top = 590.dp, bottom = 10.dp)) {
        TextFieldDefaults
        Icon(
            imageVector = Icons.Default.Call,
            contentDescription = null,
            modifier = Modifier,
            tint = Color.Green
        )
        Text(text = "+234-706-562-096-2", modifier = Modifier.padding(start = 8.dp), color = Color.White)
    }
    Row(modifier = Modifier.padding(start = 45.dp, top = 630.dp, bottom = 10.dp)) {
        TextFieldDefaults
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = null,
            modifier = Modifier,
            tint = Color.Green
        )
        Text(text = "Dox_aldehyde@android.com", modifier = Modifier.padding(start = 8.dp), Color.White)
    }
    TextFieldDefaults
    Text(text = "DoxPro", modifier = Modifier
        .fillMaxWidth()
        .wrapContentWidth(Alignment.End)
        .padding(top = 740.dp, end = 10.dp))
    Divider(color = Color.LightGray, modifier = Modifier.padding(top = 540.dp))
    Divider(color = Color.LightGray, modifier = Modifier.padding(top = 580.dp))
    Divider(color = Color.LightGray, modifier = Modifier.padding(top = 620.dp))
    Divider(color = Color.LightGray, modifier = Modifier.padding(top = 660.dp))
}

@Preview(showBackground = true)
@Composable
fun ProfileImagePreview() {
    ProfileTheme {
        ProfileImage(name = "Dox Aldehyde", duty = "Android Developer Extraordinaire")
    }
}