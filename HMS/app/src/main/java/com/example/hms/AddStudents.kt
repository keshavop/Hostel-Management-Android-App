package com.example.hms

import android.app.DatePickerDialog
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.Calendar

class AddStudents : AppCompatActivity() {
    lateinit var name : EditText
    lateinit var email : EditText
    lateinit var phnumber : EditText
    lateinit var roomnumber : EditText
    lateinit var floornumber : EditText
    lateinit var dob :EditText
    lateinit var sharedPreferences: SharedPreferences
    private var mYear:Int=0
    private var mMonth:Int=0
    private var mDay:Int=0
    val Name = "nameKey"
    val Email = "emailKey"
    val PhoneNumber = "phoneKey"
    val RoomNumber = "numberKey"
    val FloorNumber = "floorNumberKey"
    val studentFile = "studentFile"
    val Dob = "dobKey"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_students)
        dob = findViewById(R.id.dob)
        name = findViewById(R.id.Name)
        email = findViewById(R.id.email)
        phnumber = findViewById(R.id.phoneNumber)
        roomnumber = findViewById(R.id.roomNumber)
        floornumber = findViewById(R.id.floorNumber)
        sharedPreferences = getSharedPreferences(studentFile, Context.MODE_PRIVATE)
        dob.setOnClickListener{
            showDatePickerDialog()
        }
    }
    fun save(v: View){
        val n = name.text.toString()
        val e = email.text.toString()
        val p = phnumber.text.toString()
        val rt = floornumber.text.toString()
        val rn = roomnumber.text.toString()
        val db = dob.text.toString()
        val editor = sharedPreferences.edit()
        editor.putString(Name,n)
        editor.putString(Email,e)
        editor.putString(PhoneNumber,p)
        editor.putString(RoomNumber,rn)
        editor.putString(FloorNumber,rt)
        editor.putString(Dob,db)
        editor.apply()
        Toast.makeText(this,"Student Added Successfully", Toast.LENGTH_LONG).show()
    }
    private fun showDatePickerDialog(){
        val c = Calendar.getInstance()
        mYear = c[Calendar.YEAR]
        mMonth = c[Calendar.MONTH]
        mDay = c[Calendar.DAY_OF_MONTH]
        val datePickerDialog = DatePickerDialog(
            this,
            {
                    view,year,monthOfYear,dayOfMonth->dob.setText(
                dayOfMonth.toString() + "-" + (monthOfYear + 1) + "-" + year
            )
            },
            mYear,mMonth,mDay
        )
        datePickerDialog.show()
    }
}