package ru.slepcova.trainersapp

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.slepcova.trainersapp.ui.theme.TrainersAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(
    lastTraining: Pair<String, String> = Pair("Freestyle", "Today"),
    toHistory: () -> Unit,
    toSummary: (Pair<String, String>) -> Unit,
    toFreestyle: () -> Unit,
    toTemplate: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        CustomTopBar()
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            StatsCard(
                onClick = {
                    toHistory()
                }
            )
            Spacer(Modifier.size(16.dp))
            ExerciseRow(
                name = lastTraining.first,
                date = lastTraining.second,
                onClick = { training ->
                    toSummary(training)
                }
            )
        }
        Card {
            Column(
                modifier = Modifier.padding(8.dp).fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Spacer(Modifier.size(8.dp))
                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = {
                        toFreestyle()
                    },
                    modifier = Modifier.padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Text("Начать свободную тренировку".uppercase(),
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp),
                        lineHeight = 24.sp)
                }
                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = {
                        toTemplate()
                    },
                    modifier = Modifier.padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Text("Начать шаблон 1".uppercase(),
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = {},
                    modifier = Modifier.padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Text("Редактор шаблонов".uppercase(),
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun StartScreenPreview() {
    TrainersAppTheme {
        Scaffold()
        { innerPadding ->
            StartScreen(
                toHistory = {},
                toSummary = {},
                toFreestyle = {},
                toTemplate = {},
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}
