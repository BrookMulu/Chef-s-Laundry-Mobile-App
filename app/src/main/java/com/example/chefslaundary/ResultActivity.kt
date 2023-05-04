
/*
* Comment generated with the assistance of Chat GPT
* We used the help of a lot of tutorial videos to understand the Concept
* We used the help of Stack Overflow
* We used the help of the textBook
* We used the help of ChatGPT especially for the errors that is happening with us
* */


package com.example.chefslaundary


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Get the score and player name passed from the previous activity
        var score: Int = intent.getIntExtra("score", 0)
        var pName = intent.getStringExtra("finalName")

        // Set the score on the text view
        val textView = findViewById<TextView>(R.id.tv_Answer)
        textView.text = score.toString()

        // Add a click listener to the "View High Score" button to navigate to the high score activity
        val hs = findViewById<Button>(R.id.btn_viewHighScore)
        hs.setOnClickListener(){
            val intent = Intent(this, HighScoreActivity::class.java)
            intent.putExtra("finalName", pName)
            intent.putExtra("score", score)
            startActivity(intent)
        }
    }

    // Add a click listener to the "Play Again" button to start a new game
    fun onplayAgainButtonClicked(view: View) {
        val intent = Intent(this, NameActivity::class.java)
        startActivity(intent)
    }

    // Add a click listener to the "Exit" button to close the app
    fun onexitButtonClicked(view: View) {
        finishAffinity()
    }
}

