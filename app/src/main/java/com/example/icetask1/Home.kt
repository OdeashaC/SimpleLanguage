package com.example.icetask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class Home : AppCompatActivity() {
    private lateinit var SBtn : Button
    private lateinit var JBtn : Button
    private lateinit var FBtn : Button
    private lateinit var KBtn : Button
    private lateinit var TBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        SBtn = findViewById(R.id.SpanishBtn)
        JBtn = findViewById(R.id.JapaneseBtn)
        FBtn = findViewById(R.id.FrenchBtn)
        KBtn = findViewById(R.id.KoreanBtn)
        TBtn = findViewById(R.id.ThaiBtn)

        SBtn.setOnClickListener{
            var spanishIntent = Intent(this, SpanishActivity::class.java)
            startActivity(spanishIntent)
        }

        JBtn.setOnClickListener{
            var japaneseIntent = Intent(this, JapaneseActivity::class.java)
            startActivity(japaneseIntent)
        }
        FBtn.setOnClickListener{
            var frenchIntent = Intent(this, FrenchActivity::class.java)
            startActivity(frenchIntent)
        }
        KBtn.setOnClickListener{
            var koreanIntent = Intent(this, KoreanActivity::class.java)
            startActivity(koreanIntent)
        }
        TBtn.setOnClickListener{
            var thaiIntent = Intent(this, ThaiActivity::class.java)
            startActivity(thaiIntent)
        }

    }
}