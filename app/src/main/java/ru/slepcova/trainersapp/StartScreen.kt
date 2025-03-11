package ru.slepcova.trainersapp

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.slepcova.trainersapp.ui.theme.TrainersAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        TopAppBar(
            title = { },
            actions = {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = "Settings",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            },
            modifier = Modifier.height(32.dp)
        )
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
        StartScreen()
    }
}
