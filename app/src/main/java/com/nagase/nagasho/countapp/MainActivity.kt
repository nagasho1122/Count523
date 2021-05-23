package com.nagase.nagasho.countapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number = 0
        plusButton.setOnClickListener {
            number++
            numberText.text=number.toString()
        }
        minusButton.setOnClickListener {
            number--
            numberText.text=number.toString()
        }
        resetButton.setOnClickListener {
            number=0
            numberText.text=number.toString()
        }

    }




}