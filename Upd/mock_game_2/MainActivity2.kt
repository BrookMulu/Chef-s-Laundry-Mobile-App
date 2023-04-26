package com.example.mock_game_2

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






    }
}