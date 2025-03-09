package ru.slepcova.trainers.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun ExerciseCard(exercise: String, modifier: Modifier = Modifier) {
    Column() {
        Text(exercise)
        ExerciseLine()
        ExerciseLine()
        ExerciseLine()
    }
}

@Composable
fun ExerciseLine() {
    Row {
        TextField(
            value = "4",
            onValueChange = { },
            label = { Text("") }
        )
        Text("x")
        TextField(
            value = "12",
            onValueChange = {},
            label = { Text("") }
        )
        Checkbox(
            checked = false,
            onCheckedChange = { },
            enabled = true,
            modifier = Modifier
                .padding(5.dp)
                .size(3.dp),
        )
    }
}

@Composable
fun TrainingCard(date: String, name: String, modifier: Modifier = Modifier) {
    Row {
        Icon(
            Icons.Rounded.ShoppingCart,
            contentDescription = "Lol"
        )
        Column {
            Text(date)
            Text(name)
        }
    }
}