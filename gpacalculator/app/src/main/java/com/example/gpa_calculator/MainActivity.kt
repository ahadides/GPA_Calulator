package com.example.gpa_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculateGPA();
    }
}private fun calculateGPA(){

    var editText1: EditText = findViewById(R.id.editText1)
    var editText2: EditText = findViewById(R.id.editText2)
    var editText3: EditText = findViewById(R.id.editText3)
    var editText4: EditText = findViewById(R.id.editText4)
    var editText5: EditText = findViewById(R.id.editText5) // Init

    val grades = arrayListOf<Double>()

    grades.add(editText1.text.toString().toDoubleOrNull() ?: 0.0)
    grades.add(editText2.text.toString().toDoubleOrNull() ?: 0.0)
    grades.add(editText3.text.toString().toDoubleOrNull() ?: 0.0)
    grades.add(editText4.text.toString().toDoubleOrNull() ?: 0.0)
    grades.add(editText5.text.toString().toDoubleOrNull() ?: 0.0)
}