package com.example.clickcount

import org.junit.Assert.assertEquals
import org.junit.Test


internal class CounterTest {
    @Test

    fun test() {
        val a = (0..10).random()
        val b = (0..10).random()
        val numbers = Count.Base(a, b)
        val actual = numbers.sum()
        val expected = a + b
        assertEquals(actual, expected)
    }
}