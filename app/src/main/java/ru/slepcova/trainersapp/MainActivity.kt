package ru.slepcova.trainersapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import ru.slepcova.trainersapp.ui.theme.TrainersAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrainersApp()
        }
    }
}

enum class TrainerScreen() {
    Start,
    History,
    TrainingFreestyle,
    TrainingTemplate,
    TrainingSummary
}

@Composable
fun TrainersApp() {
    TrainersAppTheme {
        Scaffold()
        { innerPadding ->
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = TrainerScreen.Start.name,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(route = TrainerScreen.Start.name) {
                    StartScreen(
                        toHistory = {
                            navController.navigate(TrainerScreen.History.name)
                        },
                        toSummary = {
                            navController.navigate(TrainerScreen.TrainingSummary.name)
                        },
                        toFreestyle = {
                            navController.navigate(TrainerScreen.TrainingFreestyle.name)
                        },
                        toTemplate = {
                            navController.navigate(TrainerScreen.TrainingTemplate.name)
                        }
                    )
                }
                composable(route = TrainerScreen.History.name) {
                    HistoryScreen(
                        toSummary = {
                            navController.navigate(TrainerScreen.TrainingSummary.name)
                        }
                    )
                }
                composable(route = TrainerScreen.TrainingFreestyle.name) {
                    TrainingFreestyleScreen()
                }
                composable(route = TrainerScreen.TrainingTemplate.name) {
                    TrainingWithTemplateScreen()
                }
                composable(route = TrainerScreen.TrainingSummary.name) {
                    TrainingSummaryScreen()
                }
            }
        }
    }
}