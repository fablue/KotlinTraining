package com.quickbirdstudios.kotlintrainingexercises

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

class MainViewModel {
    val dataSet = listOf(AnimalEntry("Hund", "dog"),
            AnimalEntry("Katze", "cat"),
            AnimalEntry("Hase", "rabbit"),
            AnimalEntry("Ratte", "rat"),
            AnimalEntry("Maus", "mouse"),
            AnimalEntry("Elefant", "elephant"),
            AnimalEntry("Wal", "whale"),
            AnimalEntry("Pferd", "horse"),
            AnimalEntry("Affe", "monkey"))

    var message = "Such nach etwas :-)"
        private set
    var resultQuantityString = "-"
        private set
    var results = emptyList<String>()
        private set

    fun onSearchTermChanged(newSearchTerm: String) {
        //  TODO TASK 4 update the "results" based on the search term.
        //  TODO first check which "AnimalEntry"s match the "newSearchTerm"
        //  TODO put "AnimalEntry.toString" to the results, if it matches
        //  HINT if you want a concise, functional solution:  "filter" and "map" are very useful

        //  TODO TASK 5 if "newSearchTerm" is empty (blank), show an empty "results" list

        //  TODO TASK 6 if the "newSearchTerm" is a number: show all animals whose "english" word has less or equals characters than the typed number
        //  TODO example: newSearchTerm == 4, results -> "cat","rat"
        //  HINT use "toIntOrNull()" to convert string to number

        //  TODO TASK 7 show the number of results by putting them into "resultQuantityString"
        //  TODO show "-" if no result was found
    }

    fun onResultListUpdated() {
        // TODO TASK 8 update the message to represent the new result list
        // TODO if empty -> return "Kein Ergebnisse"
        // TODO if 1-3 results -> return "Eins davon sollte passen"
        // TODO if more than 3 results -> return "Viel zu viele Ergebnisse"
        // HINT use "when" keyword


    }

    // TODO TASK 9 add a property "sound" to "AnimalEntry", and return the sound here
    // TODO e.g. "Miaooo" for a cat
    fun getAnimalSoundOf(animal: AnimalEntry) = ""
}
