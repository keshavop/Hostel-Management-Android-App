package com.example.hms

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class attendanceLayout : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attendance_layout)

        var markAttendanceButton = findViewById<Button>(R.id.markAttendanceButton)
        var checkAttendanceButton = findViewById<Button>(R.id.checkAttendanceButton)
        var attendanceStatusTextView = findViewById<TextView>(R.id.attendanceStatusTextView)

        var markAttendanceButton2 = findViewById<Button>(R.id.markAttendanceButton2)
        var checkAttendanceButton2 = findViewById<Button>(R.id.checkAttendanceButton2)
        var attendanceStatusTextView2 = findViewById<TextView>(R.id.attendanceStatusTextView2)

        val sharedPreferences = getSharedPreferences("AttendancePref", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        markAttendanceButton.setOnClickListener {
            val currentDate = Date().toString()
            editor.putString("attendance_date", currentDate)
            editor.apply()
            Toast.makeText(this, "Marked Attendance", Toast.LENGTH_SHORT).show()
        }

        checkAttendanceButton.setOnClickListener {
            val attendanceDate = sharedPreferences.getString("attendance_date", "")
            val currentDate = Date().toString()
            if (attendanceDate == currentDate) {
                attendanceStatusTextView.text = "Attendance has been marked"
            } else {
                attendanceStatusTextView.text = "Last Attendance marked on $attendanceDate"
            }
        }


    }
}