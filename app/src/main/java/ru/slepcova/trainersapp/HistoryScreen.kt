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

@Composable
fun HistoryScreen(
    toSummary: () -> Unit,
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
            items(16) { _ ->
                Spacer(Modifier.size(16.dp))
                ExerciseRow(
                    onClick = {
                        toSummary()
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun HistoryScreenPreview() {
    Scaffold { innerPadding ->
        HistoryScreen(
            toSummary = {},
            modifier = Modifier.padding(innerPadding)
        )
    }
}