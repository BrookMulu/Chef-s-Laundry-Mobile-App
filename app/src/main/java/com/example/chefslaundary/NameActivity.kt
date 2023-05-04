

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
import android.widget.EditText
import android.widget.Toast

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
    }

    // function to handle submit button click event
    fun onSubmitClicked(view: View) {
        // Get the entered name from EditText view
        val name = findViewById<EditText>(R.id.etn_enterName).text.toString()

        // If the entered name is empty, show a toast message and do nothing
        if (name == ""){
            Toast.makeText(this,"Please use a valid name.",Toast.LENGTH_SHORT).show()
        } else {
            // If the entered name is valid, start the LoadingActivity and pass the name as extra data
            val intent = Intent(this, LoadingActivity::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}
