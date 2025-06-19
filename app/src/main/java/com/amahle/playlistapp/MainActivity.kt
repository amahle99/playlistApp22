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
        // code goes here
        // link the elements from the GUI to the background
        val playlist = findViewById<Button>(R.id.Playlistbtn)
        val Exit = findViewById<Button>(R.id.Exitbtn)
        val screenTwo2 =findViewById<Button>(R.id.ScreenTwobtn)

        Exit.setOnClickListener {
            val username = Playlistbtn..text.toString()
            if (username.isEmpty()) {
                Toast.makeText(this,"Please add a playlist" , Toast.LENGTH_SHORT).show()
            }
            val intent = Intent(this, MainActivity:class.java).putExtra("songTitle")
            startActivity(intent)
            finish()
        }
    }//end of onCreate
}//end of MainActivity

