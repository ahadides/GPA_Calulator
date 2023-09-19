package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.slider.Slider

class MainActivity2 : AppCompatActivity() {

    lateinit var m_btn: Button
    lateinit var m_first_name:EditText
    lateinit var m_last_name:EditText
    lateinit var m_age:EditText
    lateinit var m_slidingBar:Slider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        m_btn = findViewById(R.id.button);
        m_btn.setOnClickListener(this::moveToActivity3)

        m_first_name= findViewById(R.id.first_name);
        m_last_name= findViewById(R.id.last_name);
        m_age= findViewById(R.id.age);
        m_slidingBar= findViewById(R.id.slidingBar)


    }

    private fun moveToActivity3(view: View?) {

        var intent = Intent(applicationContext, MainActivity3::class.java)
        intent.putExtra("FULL_NAME", m_first_name.text.toString() + " "
                +m_last_name.text.toString() )
        intent.putExtra("AGE", m_age.text.toString().toInt())
        intent.putExtra("SLIDERVALUE",m_slidingBar.value)
        startActivity(intent);

    }
}