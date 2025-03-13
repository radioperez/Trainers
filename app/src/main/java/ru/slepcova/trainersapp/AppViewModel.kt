package ru.slepcova.trainersapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.runBlocking
import ru.slepcova.trainersapp.data.Repository
import ru.slepcova.trainersapp.data.Training

class AppViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(AppUIState())
    val uiState: StateFlow<AppUIState> = _uiState.asStateFlow()

    private val repo by lazy { Repository() }
    val allTraining: List<Training> = runBlocking { repo.load() }

    private fun getLastTraining(): Training {
        // TODO логику поиска самого недавнего
        return allTraining[0]
    }

    fun setOpenedTraining(to: Training) {
        _uiState.value = AppUIState(
            openedTraining = to,
            lastTraining = getLastTraining()
        )
    }

    private fun resetApp() {
        _uiState.value = AppUIState(lastTraining = getLastTraining())
    }

    init {
        resetApp()
    }
}