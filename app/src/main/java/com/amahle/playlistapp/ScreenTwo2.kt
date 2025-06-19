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
        //initialize views
        val display = findViewById<Button>(R.id.Displaybtn)
        val Rate = findViewById<Button>(R.id.Ratebtn)
        val mainbutton = findViewById<Button>(R.id.MainBtn)
        val comments = findViewById<TextView>(R.id.TvComment)

        val songtitle = intent.getStringArrayExtra("songtitle")
        val artists = intent.getStringArrayExtra("artist")
        val rating = intent.getStringArrayExtra("rating")
        val comment = intent.getStringArrayExtra("comment")
    }

    //show all songs
    displayAllButton.setOnClickListner
    {
        display all ()
    }

    //show only songs with ratings
    displayFlitered()


    Fun displayFiltered()
    val Output = StringBuilder()
    for(song in ?MainActivity.playlist)
    {
        if (song.rating >= 2) {
            output.ppend("${song.Title}by $song artist},{song.Rating})\nComments\nn")
        }
    }
displaylist.text+output.toString()
    }
}