package com.quickbirdstudios.kotlintrainingexercises

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

class MainViewModel {
    private val dataSet = listOf("tes1t", "tes2t", "t3est", "te44st", "tes4t", "te4st", "test", "test", "test", "test", "test", "test", "test")
    var results = dataSet

    fun onNewSearchTerm(searchTerm: String) {
        results = dataSet.filter { it.contains(searchTerm) }
    }
}
