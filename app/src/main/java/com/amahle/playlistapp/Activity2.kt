package com.amahle.playlistapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            //end of ViewCompat
            //Code goes here
            //link the elements from the GUI to the backend
            val songtitle = findViewById<Button>(R.id.edtSongTitle)
            val artists = findViewById<Button>(R.id.edtArtist)
            val rate = findViewById<Button>(R.id.edtRate)
            val comment =findViewById<Button>(R.id.edtComment)

            }
                finish()
        }
    }
}