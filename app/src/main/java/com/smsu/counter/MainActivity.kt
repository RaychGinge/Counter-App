package com.smsu.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countUp: Button = findViewById(R.id.up)
        countUp.setOnClickListener{increaseCounter()}

        val countDown: Button = findViewById(R.id.down)
        countDown.setOnClickListener{decreaseCounter()}

        val resetCounter: Button = findViewById(R.id.reset)
        resetCounter.setOnClickListener{reset()}


    }


    private fun increaseCounter() {
        val counter: TextView = findViewById(R.id.counter)

        num++

        counter.text = num.toString()
    }

    private fun decreaseCounter() {
        val counter: TextView = findViewById(R.id.counter)

        num--

        counter.text = num.toString()
    }

    private fun reset() {
        val counter: TextView = findViewById(R.id.counter)

        num = 0

        counter.text = num.toString()
    }
}