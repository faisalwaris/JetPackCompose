package com.renesis.composepractise.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.renesis.composepractise.viewmodels.UserInputViewModel


@Composable
fun NavigationGraph(userInputScreenViewModel: UserInputViewModel = viewModel()) {

    val navController = rememberNavController()
    NavHost(navController, startDestination = Routes.USER_INPUT_SCREEN) {

        composable(Routes.USER_INPUT_SCREEN) {
            UserInputScreen(navController,userInputScreenViewModel)
        }

        composable("${Routes.Welcome_SCREEN}/{${Routes.USER_NAME}}/{${Routes.ANIMAL_NAME}}",
            arguments = listOf(navArgument(name = Routes.USER_NAME){type = NavType.StringType},
                navArgument(name = Routes.ANIMAL_NAME){type = NavType.StringType})
        ) {
            WelcomeScreen(navController,it.arguments?.getString(Routes.USER_NAME),it.arguments?.getString(Routes.ANIMAL_NAME))
        }

    }
}