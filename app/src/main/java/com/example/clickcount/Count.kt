package com.example.clickcount

interface Count {

    fun sum(): Int

    class Base(private val a: Int, private val b: Int) : Count {
        override fun sum(): Int {
            return a + b
        }
    }
}