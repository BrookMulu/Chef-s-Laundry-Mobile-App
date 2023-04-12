package com.example.mocking_game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        val buttonClick = findViewById<Button>(R.id.PlayGame)
        buttonClick.setOnClickListener() {
            val intent = Intent(this, MainActivity3_Game::class.java)
            startActivity(intent)
        }

        val buttonClickb = findViewById<Button>(R.id.HighScores)
        buttonClickb.setOnClickListener() {
            val intent = Intent(this, MainActivity4_HighScores::class.java)
            startActivity(intent)
        }

        val buttonClickc = findViewById<Button>(R.id.Settings)
        buttonClickc.setOnClickListener() {
            val intent = Intent(this, MainActivity5_Settings::class.java)
            startActivity(intent)
        }


    }
}