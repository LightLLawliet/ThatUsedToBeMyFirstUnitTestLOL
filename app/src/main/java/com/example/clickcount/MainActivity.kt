package com.example.clickcount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.clickButton)
        val text = findViewById<TextView>(R.id.counter)

        button.setOnClickListener {
            val a = (0..10).random()
            val b = (0..10).random()
            text.text = Count.Base(a, b).sum().toString()
        }
    }
}