package com.example.hms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Rooms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rooms)
        val add = findViewById<Button>(R.id.add)
        add.setOnClickListener{
            intent = Intent(this,AddRooms::class.java)
            startActivity(intent)
        }
        val show = findViewById<Button>(R.id.show)
        show.setOnClickListener{
            intent = Intent(this,ShowRooms::class.java)
            startActivity(intent)
        }

    }
}