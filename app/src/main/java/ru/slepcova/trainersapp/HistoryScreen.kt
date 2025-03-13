package ru.slepcova.trainersapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.slepcova.trainersapp.data.Training

@Composable
fun HistoryScreen(
    trainingList: List<Training>,
    toSummary: (Training) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        CustomTopBar()
        LazyColumn(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            item {
                StatsExpanded()
            }
            trainingList.forEach { it ->
                item {
                    Spacer(Modifier.size(16.dp))
                    ExerciseRow(
                        training = it,
                        onClick = { training ->
                            toSummary(training)
                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun HistoryScreenPreview() {
    Scaffold { innerPadding ->
        HistoryScreen(
            trainingList = emptyList(),
            toSummary = {},
            modifier = Modifier.padding(innerPadding)
        )
    }
}