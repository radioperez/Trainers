package ru.slepcova.trainersapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import ru.slepcova.trainersapp.ui.theme.TrainersAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrainersAppTheme {
                Scaffold()
                { innerPadding ->
                    StartScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}