package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Calls the button id
        val rollBtn: Button = findViewById(R.id.btn_roll)

        // Create a function to capture once the button is clicked
        rollBtn.setOnClickListener {

            // Feedback for button is clicked
            // val toast: Toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            // toast.show()

            // Calls rollDice() method
            rollDice()
        }
        // Clead code
        // rollBtn.setOnClickListener { rollDice() }
    }

    // initiate rollDice method
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Calls the textView id
        val textView: TextView = findViewById(R.id.tv_text)

        // Because the textView is a string, then make the data from the dice into a string
        textView.text = diceRoll.toString()
    }
}