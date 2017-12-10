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
    var results = emptyList<String>()
        private set

    fun onNewSearchTerm(searchTerm: String) {
//        TODO TASK 2 show empty list if searchTerm is empty (blank)
        if (searchTerm.isBlank()) {
            results = emptyList()
            message = "Such nach etwas :-)"
            return
        }

//        TODO TASK 1 filter and map to
        results = dataSet.filter { it.component1().toLowerCase().contains(searchTerm.toLowerCase()) }
                .map { "${it.component2()} (Deutsch: ${it.component1()})" }
        updateMessage()
    }

    //    TODO TASK 3 update the message
    private fun updateMessage() {
        message = when (results.count()) {
            0 -> "Kein Ergebnisse"
            in 1..3 -> "Eins davon sollte passen"
            else -> "Viel zu viele Ergebnisse"
        }
    }

//    TODO EXPLAIN ${}

//    TODO NOW when
//    TODO NOW optionals

}
