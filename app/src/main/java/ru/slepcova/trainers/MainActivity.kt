package ru.slepcova.trainers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.slepcova.trainers.ui.theme.TrainersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrainersTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StartScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun StartScreen(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.SpaceEvenly) {
        Row(verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.End) {
            Text("settings", modifier = modifier)
        }
        Text("stats", modifier = modifier)
        Text("history", modifier = modifier)
        Sheet(modifier)
    }
}

@Composable
fun Sheet(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Начать свободную тренировку",
            modifier = modifier
        )
        Text(
            text = "Начать шаблон 1",
            modifier = modifier
        )
        Text(
            text = "Редактор шаблонов",
            modifier = modifier
        )
    }
}

@Preview
@Composable
fun StartScreenPreview() {
    TrainersTheme {
        StartScreen()
    }
}