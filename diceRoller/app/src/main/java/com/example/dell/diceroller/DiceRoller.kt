package com.example.dell.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class DiceRoller : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)

        val rollButton: Button = this.findViewById(R.id.roll_button)
        rollButton.text="Lets roll!"
        rollButton.setOnClickListener()
        {
            Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
