package ru.slepcova.trainersapp

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import ru.slepcova.trainersapp.data.exercises

class AppViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(AppUIState())
    val uiState: StateFlow<AppUIState> = _uiState.asStateFlow()

    private fun getLastTraining(): Pair<String,String> {
        // TODO логику поиска самого недавнего
        return exercises.random()
    }

    fun setOpenedTraining(to: Pair<String, String>) {
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