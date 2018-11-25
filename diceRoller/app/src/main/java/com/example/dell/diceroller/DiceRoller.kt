package com.example.dell.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class DiceRoller : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)

        val rollButton: Button = this.findViewById(R.id.roll_button)
        rollButton.text="Lets roll!"
        rollButton.setOnClickListener()
        {
            rollDice()
        }
    }

    private fun rollDice()
    {
        val resultText: TextView = findViewById(R.id.roll_result)

        val randomInt = Random().nextInt(6)+1
        resultText.text = randomInt.toString()
    }
}
