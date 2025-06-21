package com.amahle.playlistapp

import android.icu.util.Output
import android.os.Bundle
import android.provider.Telephony.Mms.Rate
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class ScreenTwo2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen_two2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Set up click listeners for the buttons

        // Listener for "Display All Songs" button
        displayAllButton.setOnClickListener {
            displayAllSongs()
        }

        // Listener for "Show Rated Songs" button (songs with rating >= 2)
        showRatedButton.setOnClickListener {
            displayFilteredSongs()
        }

        // Listener for "Back to Main" button
        mainButton.setOnClickListener {
            // This will close ScreenTwo2 and return to the previous activity (MainActivity)
            finish()
        }

        // Optional: Display all songs when the screen first loads
        displayAllSongs()
    }
     /
    private fun displayAllSongs() {
        val outputStringBuilder = StringBuilder() 

        
        if (MainActivity.playlist.isEmpty()) {
            outputStringBuilder.append("The playlist is currently empty. Add some songs from the main screen!\n")
        } else {
            outputStringBuilder.append(" All Songs in Playlist\n\n")
            // Iterate through each song in the playlist and append its details to the StringBuilder
            for (song in MainActivity.playlist) {
                outputStringBuilder.append("Title: ${song.title}\n")
                outputStringBuilder.append("Artist: ${song.artist}\n")
                outputStringBuilder.append("Rating: ${song.rating}/5\n")
                outputStringBuilder.append("Comment: ${song.comment}\n\n")
            }
        }
        
        displayListTextView.text = outputStringBuilder.toString()
    }

    private fun displayFilteredSongs() {
        val outputStringBuilder = StringBuilder() //

        // Filter the playlist to get songs with a rating of 2 or more
        val filteredSongs = MainActivity.playlist.filter { song -> song.rating >= 2 }

        
        if (filteredSongs.isEmpty()) {
            outputStringBuilder.append("No songs found with a rating of 2 or higher.\n")
        } else {
            outputStringBuilder.append("--- Songs Rated 2 or Higher ---\n\n")
            
            for (song in filteredSongs) {
                outputStringBuilder.append("Title: ${song.title}\n")
                outputStringBuilder.append("Artist: ${song.artist}\n")
                outputStringBuilder.append("Rating: ${song.rating}/5\n")
                outputStringBuilder.append("Comment: ${song.comment}\n\n")
            }
        }
        
        displayListTextView.text = outputStringBuilder.toString()
    }
}
