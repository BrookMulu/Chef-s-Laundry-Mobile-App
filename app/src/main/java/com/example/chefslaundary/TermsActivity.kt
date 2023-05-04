
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

class TermsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms)
    }
    // Open the TermsActivity when the user clicks the Terms and Conditions button
    fun onbtnTermSubmitClicked(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
