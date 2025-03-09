package ru.slepcova.trainers

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import ru.slepcova.trainers.components.TrainingCard
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource

@Composable
fun StartScreen(
    //navController: NavHostController = rememberNavController()
) {
    Scaffold() {
        Column() {
            Image(
                painter = painterResource(id = R.drawable.statsgraphic),
                contentDescription = "Stats Card"
            )
            TrainingCard("Feb 23", "Running")
        }
    }
}