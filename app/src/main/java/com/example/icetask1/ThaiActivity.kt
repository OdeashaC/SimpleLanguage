package com.example.icetask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThaiActivity : AppCompatActivity() {
    lateinit var homeBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thai)

        homeBtn = findViewById(R.id.HBtn)
        homeBtn.setOnClickListener{
            var thaiIntent = Intent(this, Home::class.java)
            startActivity(thaiIntent)
        }
    }
}