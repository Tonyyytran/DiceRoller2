package com.example.DiceRoller2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener { countUp() }
    }

    /**
     * Click listener for the Roll button.
     */
    private fun rollDice() {
        val randomInt= (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    /**
     * Click listener for the countUp button.
     */
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        // If text is the default "Hello World!" set that text to 1.
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }

}