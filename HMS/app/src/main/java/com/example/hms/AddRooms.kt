package com.example.hms

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AddRooms : AppCompatActivity() {
    lateinit var rn : EditText
    lateinit var floor : EditText
    lateinit var type : EditText
    lateinit var remark : EditText
    lateinit var add : Button
    lateinit var sharedPreferences: SharedPreferences
    val RoomNumber = "numberKey"
    val Floor = "floorKey"
    val roomFile = "myRoomFile"
    val Remark = "remarkKey"
    val Type = "typeKey"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_rooms)
         rn = findViewById(R.id.rn)
         floor = findViewById(R.id.floor)
         type = findViewById(R.id.rtype)
         remark = findViewById(R.id.remark)
         sharedPreferences = getSharedPreferences(roomFile, Context.MODE_PRIVATE)
    }
    fun save(v: View){
        val n = rn.text.toString()
        val f = floor.text.toString()
        val t = type.text.toString()
        val r = remark.text.toString()
        val editor = sharedPreferences.edit()
        editor.putString(RoomNumber,n)
        editor.putString(Floor,f)
        editor.putString(Type,t)
        editor.putString(Remark,r)
        editor.apply()
        Toast.makeText(this,"Room Added Successfully", Toast.LENGTH_LONG).show()
    }
}