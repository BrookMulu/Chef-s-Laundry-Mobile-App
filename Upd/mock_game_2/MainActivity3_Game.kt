package com.example.mock_game_2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity3_Game : AppCompatActivity() {

    private var currentScore = 0
    //add

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity3_game)
        val PizzaDough: TextView = findViewById(R.id.PizzaDough)

        val imgMarinara : ImageView = findViewById(R.id.imgMarinara)

        val imgCheese: ImageView = findViewById(R.id.imgCheese)


        imgMarinara.setOnClickListener() {
            currentScore++
            PizzaDough.text = "$currentScore"

        }

        imgCheese.setOnClickListener() {
            2 +currentScore

        }



    }
}