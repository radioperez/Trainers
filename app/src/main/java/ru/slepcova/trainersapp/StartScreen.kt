package ru.slepcova.trainersapp

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.slepcova.trainersapp.ui.theme.TrainersAppTheme

@Composable
fun StartScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.height(48.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Spacer(Modifier.fillMaxWidth(0.90f))
            Icon(
                imageVector = Icons.Filled.Settings,
                contentDescription = "Settings",
                modifier = Modifier.size(64.dp)
            )
        }
        Column(
            modifier = modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Card(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(R.drawable.graphic),
                    contentDescription = "Stats Graphic",
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Spacer(Modifier.size(16.dp))
            ExerciseRow()
        }
        Card() {
            Column(
                modifier = modifier.padding(6.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Spacer(Modifier.size(8.dp))
                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = {},
                    modifier = Modifier.padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Text("Начать свободную тренировку".uppercase(),
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp))
                }
                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = {},
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
            StartScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}
