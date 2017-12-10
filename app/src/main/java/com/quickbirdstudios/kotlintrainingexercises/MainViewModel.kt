package com.quickbirdstudios.kotlintrainingexercises

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

class MainViewModel {
    private val dataSet = mapOf("Hund" to "dog", "Katze" to "cat", "Hase" to "rabbit"
            , "Maus" to "mouse", "Wal" to "whale"
            , "Pferd" to "horse", "Affe" to "monkey")

    var message = "Such nach etwas :-)"
        private set
    var resultQuantityString = "-"
        private set
    var results = emptyList<String>()
        private set

    fun onNewSearchTerm(searchTerm: String) {
//        TODO TASK 2 show empty list if searchTerm is empty (blank)
        if (searchTerm.isBlank()) {
            results = emptyList()
            message = "Such nach etwas :-)"
            resultQuantityString = "-"
            return
        }

        val desiredWordLength = searchTerm.toIntOrNull()
        if (desiredWordLength != null) {
            results = dataSet.filter { it.component2().count() == desiredWordLength }.map(this::entryToString)
        } else {
//        TODO TASK 1 filter and map to
            results = dataSet.filter { it.component1().toLowerCase().contains(searchTerm.toLowerCase()) }
                    .map { entryToString(it) }
        }

//        TODO TASK 4
        resultQuantityString = results.size.toString()
        updateMessage()
    }

    //    TODO TASK 5
    fun getExclamationOf(animal: String) = "Wufff!"

    private fun entryToString(it: Map.Entry<String, String>) =
            "${it.component2()} (Deutsch: ${it.component1()})"

    //    TODO TASK 3 update the message
    private fun updateMessage() {
        message = when (results.count()) {
            0 -> "Kein Ergebnisse"
            in 1..3 -> "Eins davon sollte passen"
            else -> "Viel zu viele Ergebnisse"
        }
    }

//    TODO EXPLAIN ${}

//    TODO NOW exercise -> make magic number/string to companion object constant
}
