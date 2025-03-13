package ru.slepcova.trainersapp.data

data class Exercise(
    val name: String,
    var setsReps: List<Pair<Int, Int>>? = null
)

data class Training(
    val date: String,
    val name: String,
    var exercises: List<Exercise>? = null
)

class Repository {
    fun load(): List<Training> {
        val allTraining = emptyList<Training>().toMutableList()

        // Creating 16 fake trainings
        (1..16).forEach { _ ->
            val exerciseList = emptyList<Exercise>().toMutableList()

            // for every training generate from 1 to 4 random exercises
            (1..(1..4).random()).forEach { _ ->
                val setRepList = emptyList<Pair<Int, Int>>().toMutableList()

                // For every exercise generate from 1 to 4 random set+rep combinations
                (1..(1..4).random()).forEach { _ ->
                    val setRep = Pair((1..3).random(), (5..12).random())
                    setRepList.add(setRep)
                }

                val exercise = Exercise(exerciseNames.random(), setRepList.toList())
                exerciseList.add(exercise)
            }

            val training = Training(
                generateDate(),
                trainingNames.random(),
                exerciseList.toList()
            )
            allTraining.add(training)
        }

        return allTraining.toList()
    }
}