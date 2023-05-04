
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
import android.view.Gravity
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

// This is a data class used to represent a high score.
data class HighScore(val name: String, val score: Int)

// This is the HighScoreActivity class which extends the AppCompatActivity class.
class HighScoreActivity : AppCompatActivity() {

    // This is a mutable list of HighScore objects representing the high scores.
    // It is initialized with some default values for testing purposes.
    private val highScores = mutableListOf(
        HighScore("John", 100),
        HighScore("Daniel", 90),
        HighScore("Bob", 70),
        HighScore("Alex", 60)
    )

    // This method is called when the activity is created.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This sets the layout of the activity to the one defined in the activity_high_score.xml file.
        setContentView(R.layout.activity_high_score)

        // This gets a reference to the TableLayout where the high scores will be displayed.
        val highScoreTable = findViewById<TableLayout>(R.id.high_score_table)

        // This gets the name and score of the new high score passed from another activity using an Intent.
        val name = intent.getStringExtra("finalName")
        val score = intent.getIntExtra("score", 0)

        // If the name is not null, it means a new high score was achieved and it is added to the list of high scores.
        if (name != null) {
            highScores.add(HighScore(name, score))
        }

        // This sorts the high scores list in descending order of score.
        highScores.sortByDescending { it.score }

        // This loop creates a new TableRow for each high score and adds it to the TableLayout.
        for (score in highScores) {
            val row = TableRow(this)
            val nameView = TextView(this).apply {
                text = score.name
                textSize = 16f
                gravity = Gravity.START
            }
            val scoreView = TextView(this).apply {
                text = score.score.toString()
                textSize = 16f
                gravity = Gravity.END
            }
            row.addView(nameView)
            row.addView(scoreView)
            highScoreTable.addView(row)
        }

        // This gets a reference to the back button and sets a click listener to take the user back to the MainActivity.
        val backButton = findViewById<Button>(R.id.backBtn)
        backButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
