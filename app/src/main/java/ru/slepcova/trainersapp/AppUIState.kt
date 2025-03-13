package ru.slepcova.trainersapp

data class AppUIState(
    val openedTraining: Pair<String, String> = Pair("Nothing", "Never"),
    val lastTraining: Pair<String, String> = Pair("Freestyle", "Today")
)
