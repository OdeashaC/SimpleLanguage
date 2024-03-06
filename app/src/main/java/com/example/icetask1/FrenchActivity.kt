package com.example.icetask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FrenchActivity : AppCompatActivity() {
    lateinit var hbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_french)

        hbtn = findViewById(R.id.HBtn)

        hbtn.setOnClickListener{
            var frenchIntent = Intent(this, Home::class.java)
            startActivity(frenchIntent)
        }
    }
}