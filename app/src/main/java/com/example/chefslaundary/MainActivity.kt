
/*
* Comment generated with the assistance of Chat GPT
* We used the help of a lot of tutorial videos to understand the Concept
* We used the help of Stack Overflow
* We used the help of the textBook
* We used the help of ChatGPT especially for the errors that is happening with us
* */


package com.example.chefslaundary

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    // Declare private properties for the MediaPlayer, volume buttons, shared preferences, and playing status
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var volumeOnButton: FloatingActionButton
    private lateinit var volumeOffButton: FloatingActionButton
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    private var isPlaying = false

    // This method is called when the activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content view of the activity to the activity_main layout
        setContentView(R.layout.activity_main)

        // Initialize the media player with background music and set looping and volume
        mediaPlayer = MediaPlayer.create(this, R.raw.chefmusic)
        mediaPlayer.isLooping = true
        mediaPlayer.setVolume(0.5f, 0.5f)

        // Initialize volume buttons and set their click listeners to turn music on/off
        volumeOnButton = findViewById(R.id.volume_on)
        volumeOffButton = findViewById(R.id.volume_off)
        volumeOnButton.setOnClickListener { turnOnMusic() }
        volumeOffButton.setOnClickListener { turnOffMusic() }

        // Get shared preferences for music playing status and update UI accordingly
        sharedPreferences = getSharedPreferences("MUSIC", Context.MODE_PRIVATE)
        isPlaying = sharedPreferences.getBoolean("isPlaying", false)
        if (isPlaying) {
            mediaPlayer.start()
            volumeOnButton.visibility = View.GONE
            volumeOffButton.visibility = View.VISIBLE
        }

        // Set initial state of volume buttons
        volumeOnButton.visibility = View.VISIBLE
        volumeOffButton.visibility = View.GONE

        // Set click listeners for buttons to start other activities
        var newGame = findViewById<Button>(R.id.bt_Newgame)
        newGame.setOnClickListener {
            val intent = Intent(this, NameActivity::class.java)
            startActivity(intent)
        }

        var faqButton = findViewById<Button>(R.id.bt_faq)
        var aboutButton = findViewById<Button>(R.id.bt_about)
        var highScore = findViewById<Button>(R.id.bt_Highscore2)

        faqButton.setOnClickListener {
            val intent1 = Intent(this, FaqActivity::class.java)
            startActivity(intent1)
        }
        aboutButton.setOnClickListener {
            val intent2 = Intent(this, AboutActivity::class.java)
            startActivity(intent2)
        }
        highScore.setOnClickListener {
            val intent7 = Intent(this, HighScoreActivity::class.java)
            startActivity(intent7)
        }

    }

    // Turn on music and update Visibilty
    private fun turnOnMusic() {
        mediaPlayer.start()
        volumeOnButton.visibility = View.GONE
        volumeOffButton.visibility = View.VISIBLE
    }

    // Turn off music and update Visibilty
    private fun turnOffMusic() {
        mediaPlayer.pause()
        volumeOnButton.visibility = View.VISIBLE
        volumeOffButton.visibility = View.GONE
    }

    // This method is called when the activity is paused
    override fun onPause() {
        super.onPause()

        // Save the music playing status in shared preferences
        editor = sharedPreferences.edit()
        editor.putBoolean("isPlaying", mediaPlayer.isPlaying)
        editor.apply()
    }

    // This method is called when the activity is resumed
    override fun onResume() {
        super.onResume()

        // Get the music playing status from shared preferences and update UI accordingly
        isPlaying = sharedPreferences.getBoolean("isPlaying", false)
        if (isPlaying) {
            volumeOnButton.visibility = View.GONE
            volumeOffButton.visibility = View.VISIBLE
        } else {
            volumeOnButton.visibility = View.VISIBLE
            volumeOffButton.visibility = View.GONE
        }
    }


    fun onNewGameButtonClicked(view: View){
        val intent = Intent(this, NameActivity::class.java)
        startActivity(intent)
    }


    fun onSettingsButtonClicked(view: View){
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.stop()
        mediaPlayer.release()
    }
}

