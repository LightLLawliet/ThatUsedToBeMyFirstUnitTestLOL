package com.example.clickcount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.clickButton)
        val text = findViewById<TextView>(R.id.counter)

        button.setOnClickListener {
            text.text = Count.Base().sum().toString()
        }
    }
}