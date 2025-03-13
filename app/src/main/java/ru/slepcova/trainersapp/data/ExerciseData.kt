package ru.slepcova.trainersapp.data

val trainingNames: Set<String> = setOf(
    "Freestyle",
    "Running",
    "Template 2",
    "Awesome Custom Name"
)

val exerciseNames: Set<String> = setOf(
    "Situps",
    "Pullups",
    "Deadlifts",
    "Sprints",
    "Jogging by km",
    "Jumping Jacks",
    "Анжуманя",
    "Пресс качат"
)

val months: Set<String> = setOf(
    "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"
)

fun generateDate(): String {
    return (1..25).random().toString() + " " + months.random()
}