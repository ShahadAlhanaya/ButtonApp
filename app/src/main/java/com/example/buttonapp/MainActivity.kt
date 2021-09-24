package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var addButton : ImageButton
    lateinit var removeButton : ImageButton
    lateinit var numberTextView : TextView
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton= findViewById(R.id.plus_button)
        removeButton= findViewById(R.id.minus_button)
        numberTextView= findViewById(R.id.number_textview)

        numberTextView.text = count.toString()

        fun addToNumber(){
            count++
            numberTextView.text = count.toString()
        }

        fun removeFromNumber(){
            count--
            numberTextView.text = count.toString()
        }

        addButton.setOnClickListener { addToNumber() }
        removeButton.setOnClickListener { removeFromNumber() }

    }
}