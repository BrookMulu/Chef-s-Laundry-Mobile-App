

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

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the layout for the activity
        setContentView(R.layout.activity_about)

        // Find the "Help" button in the layout
        val helpPage = findViewById<Button>(R.id.helpPageBtnAboutUs)

        // Set an OnClickListener for the "Help" button
        helpPage.setOnClickListener{

            // Create an Intent to start the FaqActivity
            val intent = Intent(this, FaqActivity::class.java)

            // Start the FaqActivity
            startActivity(intent)
        }

        // Find the "Home" button in the layout
        val home = findViewById<Button>(R.id.homeBtnAboutUs)

        // Set an OnClickListener for the "Home" button
        home.setOnClickListener(){

            // Create an Intent to start the MainActivity
            val intent = Intent(this, MainActivity::class.java)

            // Start the MainActivity
            startActivity(intent)
        }
    }
}
