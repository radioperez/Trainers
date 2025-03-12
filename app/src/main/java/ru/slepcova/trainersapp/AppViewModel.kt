package ru.slepcova.trainersapp

class AppViewModel: ViewModel {
    private val _uiState = MutableStateFlow(AppUiState())
    val uiState: StateFlow<AppUiState> = _uiState.asStateFlow

    private fun getLastTraining() {
        return "Yesterday"
    }

    fun resetApp() {
        _uiState.value = AppUIState(lastTraining = "Yesterday")
    }

    init {
        resetApp()
    }
}