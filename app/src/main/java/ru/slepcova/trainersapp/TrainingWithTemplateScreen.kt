package ru.slepcova.trainersapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.slepcova.trainersapp.ui.theme.TrainersAppTheme

@Composable
fun TrainingWithTemplateScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        item { Row {
            Text("15:03",
                fontSize = 64.sp,
                fontWeight = FontWeight.Bold)
            Text(".28",
                fontSize = 64.sp)
        } }
        items(1) { _ ->
            Spacer(Modifier.size(16.dp))
            ExerciseFullCard()
        }
        item {
            Spacer(Modifier.size(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(R.drawable.pause),
                        contentDescription = "Exercise Icon",
                        modifier = Modifier.size(50.dp)
                    )
                }
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("Завершить".uppercase(),
                        fontSize = 32.sp)
                }
            }
        }
    }
}

@Preview
@Composable
fun TrainingWithTemplateScreenPreview() {
    TrainersAppTheme {
        Scaffold { innerPadding ->
            TrainingWithTemplateScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}