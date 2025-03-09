package ru.slepcova.trainers

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import ru.slepcova.trainers.components.TrainingCard
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

enum class Screen() {
    Start,
    History,
    TrainingSummary,
    Freestyle,
    Template,
    TemplateEditor
}

@Composable
fun StartScreen(
) {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.statsgraphic),
            contentDescription = "Stats Card"
        )
        TrainingCard("Feb 23", "Running")
    }
}

@Composable
fun TrainingApp() {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Start.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Screen.Start.name) {
                StartScreen()
            }
            composable(route = Screen.History.name) {
                HistoryScreen()
            }
        }
    }
}