
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
import android.widget.Button

class FaqActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the layout for the activity
        setContentView(R.layout.activity_faq)

        // Find the "About Us" button in the layout
        val aboutUs = findViewById<Button>(R.id.aboutUsBtnHelp)

        // Set an OnClickListener for the "About Us" button
        aboutUs.setOnClickListener(){

            // Create an Intent to start the FaqActivity (this activity)
            val intent = Intent(this, FaqActivity::class.java)

            // Start the FaqActivity (this activity)
            startActivity(intent)
        }

        // Find the "Home" button in the layout
        val home = findViewById<Button>(R.id.homeBtnHelpPage)

        // Set an OnClickListener for the "Home" button
        home.setOnClickListener(){

            // Create an Intent to start the MainActivity
            val intent = Intent(this, MainActivity::class.java)

            // Start the MainActivity
            startActivity(intent)
        }
    }
}
