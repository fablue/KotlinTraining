package com.quickbirdstudios.kotlintrainingexercises.basics

import org.junit.Assert.*
import org.junit.Test

/**
 * Created by Malte Bucksch on 11/12/2017.
 */
//TODO NOW solutions

// TODO TASK 1 use the standard library extension function "any" to check if any char in a string is whitespace(' ')
// TODO definition of "any": CharSequence.any(predicate: (Char) -> Boolean): Boolean
// TODO HINT: similar example from "any" on a dog list: val wasTomFound = dogList.any { element -> element.name == "Tom" }
fun hasAnyWhitespace(text: String): Boolean {
    return text.any { it == ' ' }
}

// TODO TASK 2 use the standard library extension function "all" to check if all elements in a list are empty
// TODO definition of "all": Iterable<T>.all(predicate: (T) -> Boolean): Boolean
// TODO HINT: see example of Task 1
fun List<String>.areAllEmpty(): Boolean {
    return this.all { it.isEmpty() }
}

// TODO TASK 3 use the standard library extension function "substringAfter" to get the file ending of a file name
// TODO definition of "substringAfter": String.substringAfter(delimiter: String): String
fun String.fileEnding(): String {
    return this.substringAfter(".")
}

// TODO TASK 4 use the standard library extension function "count" to count the number of empty strings in a list
// TODO definition of "all": Iterable<T>.count(predicate: (T) -> Boolean): Int
// TODO HINT: almost the same as TASK 1 and TASK 2
fun List<String>.countEmptyStrings(): Int {
    return this.count { it.isEmpty() }
}

class StandardLibraryTests {
    @Test
    fun testAreAllEmpty() {
        assertTrue(listOf("", "", "").areAllEmpty())
        assertFalse(listOf("", "Bruno", "").areAllEmpty())
    }

    @Test
    fun testHasAnyWhitespace() {
        assertTrue(hasAnyWhitespace("Ich heiße Bruno"))
        assertFalse(hasAnyWhitespace("IchheißeBruno"))
    }

    @Test
    fun testFileEnding() {
        assertEquals("mp3", "song.mp3".fileEnding())
    }

    @Test
    fun testCountEmptyStrings() {
        assertEquals(1, listOf("","apple","banana").countEmptyStrings())
        assertEquals(2, listOf("","apple","","banana").countEmptyStrings())
        assertEquals(0, listOf("apple","banana").countEmptyStrings())
    }
}