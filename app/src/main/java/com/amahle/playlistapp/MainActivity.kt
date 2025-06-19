package com.amahle.playlistapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // 1. Link elements from the GUI to the background
        
       var edtPlaylistName = findViewById<Button>(R.id.Playlistbtn
           var btnExit = findViewById<Button>(R.id.Exitbtn)             
        var Mainbtn = findViewById<Button>(R.id.ScreenTwobtn) 

        

        // Listener for the "Add Playlist" or "Process Playlist" button
            Playlistbtn.setOnClickListener {
            val playlistName = etPlaylistName.text.toString().trim() 

            if (playlistName.isEmpty()) {
                
                Toast.makeText(this, "Please enter a playlist name!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Playlist '$playlistName' added/processed!", Toast.LENGTH_SHORT).show()
                
                etPlaylistName.text.clear()
            }
        }

        // Listener for the "Exit" button
        Exitbtn.setOnClickListener {
            
            finishAffinity() 
            
            // finish()
        }


        Mainbtn.setOnClickListener {
            val intent = Intent(this, ScreenTwo2::class.java) 
    
            // intent.putExtra("someKey", "someValue")
            startActivity(intent)
            
        }

    } // end of onCreate
} // end of MainActivity






