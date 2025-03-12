package ru.slepcova.trainersapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ExerciseRow() {
    Card {
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.running),
                contentDescription = "Exercise Icon",
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text("Month Nth, 12:34", fontSize = 20.sp)
                Text("Exercise Name".uppercase(), fontSize = 24.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview
@Composable
fun ExerciseFullCard() {
    Card {
        Text("Exercise Name",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp))
        RepSetLine()
        RepSetLine()
        RepSetLine()
    }
}

@Composable
fun RepSetLine() {
    val sets = 3
    val reps = 12
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)) {
        TextField(
            // Sets
            value = sets.toString(),
            textStyle = TextStyle.Default.copy(fontSize = 40.sp),
            onValueChange = { },
            modifier = Modifier.width(60.dp)
        )
        Spacer(Modifier.size(20.dp))
        Text("x", fontSize = 40.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.size(20.dp))
        TextField(
            // Reps
            value = reps.toString(),
            textStyle = TextStyle.Default.copy(fontSize = 40.sp),
            onValueChange = { },
            modifier = Modifier.width(150.dp)
        )
        Checkbox(
            checked = true,
            onCheckedChange = { },
            modifier = Modifier.size(50.dp)
        )
    }
}

@Preview
@Composable
fun StatsCard() {
    val currentProgress = 0.6f
    Card {
        Text(
            text = "На этой неделе Вы тренировались на 45 мин больше последней!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(20, 240, 164),
            modifier = Modifier.padding(16.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(16.dp)
        ) {
            CircularProgressIndicator(
                progress = { currentProgress },
                strokeWidth = 24.dp,
                modifier = Modifier.size(132.dp),
                color = Color(20, 240, 164)
            )
            Spacer(Modifier.fillMaxWidth(0.20f))
            Image(
                painter = painterResource(
                    R.drawable.weekbarchart
                ),
                contentDescription = "Weekbar chart",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
fun StatsExpanded() {
    val currentProgress = 0.6f
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(20, 240, 164)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Статистика недели",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "24 фев. - 2 мар.",
            fontSize = 24.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        CircularProgressIndicator(
            progress = { currentProgress },
            strokeWidth = 20.dp,
            trackColor = Color.Transparent,
            color = Color.White,
            modifier = Modifier.size(128.dp)
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )
        Text(
            text = "Длительность",
            fontSize = 24.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Image(
            painter = painterResource(
                R.drawable.weekbarchart
            ),
            contentDescription = "Weekbar chart",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxWidth(0.75f)
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            colorFilter = ColorFilter.tint(Color.White)

        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar() {
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
        }
    )
}