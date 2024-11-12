package com.renesis.composepractise.ui.states

sealed class UserInputScreenState {

    data class UserNameState(val name: String): UserInputScreenState()

    data class AnimalSelectedState(val animalSelect: String): UserInputScreenState()
}