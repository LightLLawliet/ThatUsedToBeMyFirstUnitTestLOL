package com.example.clickcount

import org.junit.Assert.assertEquals
import org.junit.Test


internal class CounterTest {
    @Test

    fun test() {
        val numbers = Count.Base()
        val actual = numbers.sum()
        val expected = 3
        assertEquals(actual, expected)
    }
}