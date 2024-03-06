package com.example.icetask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            var intent = Intent(this,Home::class.java)
            startActivity(intent)
            finish()
       },
            3000)
    }
}