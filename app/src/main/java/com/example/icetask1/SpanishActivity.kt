package com.example.icetask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SpanishActivity : AppCompatActivity() {
    lateinit var homeBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spanish)

        homeBtn = findViewById(R.id.HBtn)
        homeBtn.setOnClickListener{
            var spanishIntent = Intent(this, Home::class.java)
            startActivity(spanishIntent)
        }
    }
}