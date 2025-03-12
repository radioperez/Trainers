package ru.slepcova.trainersapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.slepcova.trainersapp.ui.theme.TrainersAppTheme

@Composable
fun TrainingSummaryScreen(
    modifier: Modifier = Modifier,
    name: String = "Training Title",
    date: String = "22 february, 12:34",
) {
    LazyColumn(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        item {
            Text(date,
                fontSize = 40.sp
            )
        }
        item {
            Spacer(Modifier.size(16.dp))
            Text(name,
                fontSize = 40.sp,
                fontWeight = FontWeight.Black)
        }
        items(1) { _ ->
            Spacer(Modifier.size(16.dp))
            ExerciseFullCard()
        }
        item {
            Spacer(Modifier.size(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Text("Итоговое время ",
                    fontSize = 24.sp)
                Text("45:06.12",
                    fontSize = 24.sp)
            }
        }
    }
}

@Preview
@Composable
fun TrainingSummaryScreenPreview() {
    TrainersAppTheme {
        Scaffold { innerPadding ->
            TrainingSummaryScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}