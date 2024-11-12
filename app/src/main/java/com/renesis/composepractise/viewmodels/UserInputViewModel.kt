package com.renesis.composepractise.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.renesis.composepractise.model.UserInputScreenMode
import com.renesis.composepractise.ui.states.UserInputScreenState

class UserInputViewModel : ViewModel() {
    var uiState = mutableStateOf(UserInputScreenMode())


    fun onEvent(event: UserInputScreenState) {
        when (event) {
            is UserInputScreenState.AnimalSelectedState -> {
                uiState.value = uiState.value.copy(animalSelect = event.animalSelect)
            }

            is UserInputScreenState.UserNameState -> {
                uiState.value = uiState.value.copy(name = event.name)

            }
        }
    }
}



