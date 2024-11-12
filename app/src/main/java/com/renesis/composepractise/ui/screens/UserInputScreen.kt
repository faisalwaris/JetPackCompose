package com.renesis.composepractise.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.renesis.composepractise.ui.states.UserInputScreenState
import com.renesis.composepractise.viewmodels.UserInputViewModel

@Composable
fun UserInputScreen(
    navController: NavHostController,
    userInputScreenViewModel: UserInputViewModel
) {

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize().padding(18.dp)
        ) {
            TopBar("Hi There")

            TextComponent("Lets learn about you!", color = Color.Gray)

            Spacer(modifier = Modifier.size(10.dp))


            OutlinedTextFieldExample(onTextChanged = { updatedValue ->
                userInputScreenViewModel.onEvent(UserInputScreenState.UserNameState(updatedValue))

            })

            Spacer(modifier = Modifier.size(10.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                CardSelection(
                    isSelected = userInputScreenViewModel.uiState.value.animalSelect == "Dog",
                    onCardSelected = {
                        userInputScreenViewModel.onEvent(UserInputScreenState.AnimalSelectedState("Dog"))

                    })
                CardSelection(
                    isSelected = userInputScreenViewModel.uiState.value.animalSelect == "Cat",
                    onCardSelected = {
                        userInputScreenViewModel.onEvent(UserInputScreenState.AnimalSelectedState("Cat"))


                    })
            }
            Spacer(modifier = Modifier.weight(1f))

            if (!userInputScreenViewModel.uiState.value.name.isNullOrBlank() && !userInputScreenViewModel.uiState.value.animalSelect.isNullOrBlank())
                Button(
                    onClick = {
                        navController.navigate(Routes.Welcome_SCREEN + "/" + userInputScreenViewModel.uiState.value.name + "/" + userInputScreenViewModel.uiState.value.animalSelect)

                    },
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Text("Submit")

                }


        }


    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UserInputScreen(rememberNavController(), UserInputViewModel())
}