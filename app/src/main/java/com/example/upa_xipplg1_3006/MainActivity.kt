package com.example.upa_xipplg1_3006

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)

            button.setOnClickListener {
            val intent = Intent(this, biodata::class.java)
            startActivity(intent)
            button4.setOnClickListener {
                val intent = Intent(this, pendidikan::class.java)
                startActivity(intent)
                button5.setOnClickListener {
                    val intent = Intent(this, portofolio::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}