package com.example.icetask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JapaneseActivity : AppCompatActivity() {
    lateinit var homeBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_japanese)

        homeBtn.setOnClickListener{
            var japaneseIntent = Intent(this, Home::class.java)
            startActivity(japaneseIntent)
        }
    }
}