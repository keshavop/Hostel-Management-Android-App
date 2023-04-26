package com.example.hms

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowRooms : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var rnumber:TextView
    lateinit var fnumber:TextView
    lateinit var rtype:TextView
    lateinit var remark:TextView
    val RoomNumber = "numberKey"
    val Floor = "floorKey"
    val roomFile = "myRoomFile"
    val Remark = "remarkKey"
    val Type = "typeKey"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_rooms)
        rnumber = findViewById(R.id.rnum)
        fnumber = findViewById(R.id.fnum)
        rtype = findViewById(R.id.rtype)
        remark = findViewById(R.id.remark)
        sharedPreferences = getSharedPreferences(roomFile, Context.MODE_PRIVATE)
        getData()
    }

    fun getData(){
        sharedPreferences = getSharedPreferences(roomFile,Context.MODE_PRIVATE)
        rnumber.text = sharedPreferences.getString(RoomNumber,"")
        fnumber.text = sharedPreferences.getString(Floor,"")
        rtype.text = sharedPreferences.getString(Type,"")
        remark.text = sharedPreferences.getString(Remark,"")
    }
}