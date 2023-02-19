package com.example.clickcount

interface Count {

    fun sum(): Int

    class Base : Count {
        private val a: Int = 1
        private val b: Int = 2
        override fun sum(): Int {
            return a + b
        }
    }
}