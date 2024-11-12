package com.renesis.composepractise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }

    }

    @Composable
    fun MyApp() {
//        NavigationGraph()

        Column (modifier = Modifier.fillMaxSize().background(color = Color(0xFFf2f2f2)).padding(20.dp).verticalScroll(state = rememberScrollState(),
            )) {
            Image(
                painter = painterResource(R.drawable.happy_meal),
                contentDescription = "This is burger with chips",
                contentScale = ContentScale.Fit,
                modifier = Modifier.height(200.dp).fillMaxWidth(),
                alignment = Alignment.Center
            )
            Spacer(modifier = Modifier.height(10.dp))
            Column {
                Text(
                    "Happy Meal",
                    style = TextStyle(color = Color(0xFF85bb65), fontSize = 26.sp),

                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    "800 Calories",
                    style = TextStyle(color = Color(color = 0xFFaabbcc), fontSize = 12.sp)
                )

                Text(
                    "800 Calories",
                    style = TextStyle(color = Color(color = 0xFFaabbcc),fontSize = 12.sp)
                )
                Text(
                    "800 Calories",
                    style = TextStyle(color = Color(color = 0xFFaabbcc),fontSize = 12.sp)
                )
                Text(
                    "800 Calories",
                    style = TextStyle(color = Color(color = 0xFFaabbcc),fontSize = 12.sp)
                )

                Text(
                    "800 Calories",
                    style = TextStyle(color = Color(color = 0xFFaabbcc),fontSize = 12.sp)
                )
                Text(
                    "800 Calories",
                    style = TextStyle(color = Color(color = 0xFFaabbcc),fontSize = 12.sp)
                )
                Text(
                    "800 Calories",
                    style = TextStyle(color = Color(color = 0xFFaabbcc),fontSize = 12.sp)
                )
                Text(
                    "600 Calories",
                    style = TextStyle(color = Color(color = 0xFFaabbcc),fontSize = 12.sp)
                )


            }

        }


    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyApp()

    }

}