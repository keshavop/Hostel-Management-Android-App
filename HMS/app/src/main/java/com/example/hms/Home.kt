package com.example.hms

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val rooms = findViewById<ImageView>(R.id.imageButton)
        rooms.setOnClickListener{
            intent = Intent(this,Rooms::class.java)
            startActivity(intent)
        }
        val students = findViewById<ImageView>(R.id.imageButton2)
        students.setOnClickListener{
            intent = Intent(this,Students::class.java)
            startActivity(intent)
        }
        val atn = findViewById<ImageView>(R.id.imageButton3)
        atn.setOnClickListener{
            intent = Intent(this,attendanceLayout::class.java)
            startActivity(intent)
        }
    }
}