package com.example.hms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Students : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)
        val addStu = findViewById<Button>(R.id.addStu)
        addStu.setOnClickListener{
            intent = Intent(this,AddStudents::class.java)
            startActivity(intent)
        }
        val showStu = findViewById<Button>(R.id.showStu)
        showStu.setOnClickListener{
            intent = Intent(this,ShowStudents::class.java)
            startActivity(intent)
        }
    }
}