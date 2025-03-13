package ru.slepcova.trainersapp

import ru.slepcova.trainersapp.data.Training

data class AppUIState(
    val openedTraining: Training = Training("Filler Date", "Filler Name"),
    val lastTraining: Training = Training("Filler Date", "Filler Name")
)
