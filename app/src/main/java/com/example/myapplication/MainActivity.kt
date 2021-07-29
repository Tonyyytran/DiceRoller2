package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindButton()
    }

    private fun bindButton() {
        val button = findViewById<Button>(R.id.button_send)
        button.setOnClickListener {
            sendMessage()
        }
    }

    /** Called when the user taps the Send button */
    private fun sendMessage() {
        val editText = findViewById<EditText>(R.id.editText_personName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

}