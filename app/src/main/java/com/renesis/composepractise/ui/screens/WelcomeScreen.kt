package com.renesis.composepractise.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun  WelcomeScreen(navController: NavController, name: String?, cardValue: String?){



    Surface (modifier = Modifier.fillMaxSize()){

        Column {
            Text(Routes.Welcome_SCREEN)

            Spacer(modifier = Modifier.size(10.dp))

            Text("Edit text field is :${name}")
            Spacer(modifier = Modifier.size(10.dp))

            Text("Edit text field is :${cardValue}")
        }


    }
}

