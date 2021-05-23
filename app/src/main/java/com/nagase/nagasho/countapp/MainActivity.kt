package com.nagase.nagasho.countapp

import android.graphics.Color
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
            if (number%3==0){
                numberText.setTextColor(Color.GREEN)
            }else{
                numberText.setTextColor(Color.BLACK)
            }
        }
        minusButton.setOnClickListener {
            number--
            numberText.text=number.toString()
            if (number%3==0){
                numberText.setTextColor(Color.GREEN)
            }else{
                numberText.setTextColor(Color.BLACK)
            }
        }
        resetButton.setOnClickListener {
            number=0
            numberText.text=number.toString()
            if (number%3==0){
                numberText.setTextColor(Color.GREEN)
            }else{
                numberText.setTextColor(Color.BLACK)
            }
        }
    }




}