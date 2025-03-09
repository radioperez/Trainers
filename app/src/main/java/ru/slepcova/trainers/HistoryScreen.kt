package ru.slepcova.trainers

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.slepcova.trainers.ui.theme.TrainersTheme
import ru.slepcova.trainers.components.TrainingCard

@Composable
fun HistoryScreen(
    //modifier: Modifier
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Stats")
        TrainingCard("Dec 10", "Training")
        TrainingCard("March 2", "Running")
    }
}

@Preview
@Composable
fun HistoryScreenPreview() {
    TrainersTheme {
        HistoryScreen()
    }
}