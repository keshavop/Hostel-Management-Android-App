package com.example.hms

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ShowStudents : AppCompatActivity() {
    lateinit var name : TextView
    lateinit var email : TextView
    lateinit var phnumber : TextView
    lateinit var roomnumber : TextView
    lateinit var floornumber : TextView
    lateinit var dob : TextView
    lateinit var sharedPreferences: SharedPreferences
    val Name = "nameKey"
    val Email = "emailKey"
    val PhoneNumber = "phoneKey"
    val RoomNumber = "numberKey"
    val FloorNumber = "floorNumberKey"
    val Dob = "dobKey"
    val studentFile = "studentFile"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_students)
        name = findViewById(R.id.firstName)
        email = findViewById(R.id.email)
        phnumber = findViewById(R.id.phoneNumber)
        roomnumber = findViewById(R.id.roomNumber)
        floornumber = findViewById(R.id.floorNumber)
        dob = findViewById(R.id.dob)
        sharedPreferences = getSharedPreferences(studentFile, Context.MODE_PRIVATE)
        getData()
    }
    fun getData(){
        sharedPreferences = getSharedPreferences(studentFile, Context.MODE_PRIVATE)
        name.text = sharedPreferences.getString(Name,"")
        email.text = sharedPreferences.getString(Email,"")
        phnumber.text = sharedPreferences.getString(PhoneNumber,"")
        roomnumber.text = sharedPreferences.getString(RoomNumber,"")
        floornumber.text = sharedPreferences.getString(FloorNumber,"")
        dob.text = sharedPreferences.getString(Dob,"")
    }
}