package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton: Button = findViewById(R.id.button)
        playButton.setOnClickListener(){ play() }
    }

    private fun play(){
        val startActivity = Intent(this@MainActivity, VendingMachine::class.java)
        startActivity(startActivity)
    }
}

