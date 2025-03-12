package ru.slepcova.trainersapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import ru.slepcova.trainersapp.data.exercises

class AppViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(AppUIState())
    val uiState: StateFlow<AppUIState> = _uiState.asStateFlow()

    private fun getTraining(): Pair<String, String> {
        return exercises.random()
    }

    private fun resetApp() {
        _uiState.value = AppUIState(lastTraining = getTraining())
    }

    init {
        resetApp()
    }
}