
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
import android.os.Handler

class LoadingActivity : AppCompatActivity() {

    class LoadingActivity : AppCompatActivity() {

        // This method is called when the activity is created
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            // Set the content view of the activity to the activity_loading layout
            setContentView(R.layout.activity_loading)

            // Get the string extra named "name" from the intent that started this activity and store it in a variable named playerName
            val playerName = intent.getStringExtra("name")

            // Create a new Handler object and call its postDelayed method
            Handler().postDelayed(
                {

                    // Create a new Intent object that will start the GameActivity
                    val intent = Intent(this, GameActivity::class.java)

                    // Add the playerName variable as an extra to the intent
                    intent.putExtra("playerName", playerName)

                    // Start the GameActivity using the intent and finish this activity
                    startActivity(intent)
                    finish()
                }, 3000) // Set a delay of 3 seconds before executing the code inside the Handler's postDelayed method
        }
    }
}
