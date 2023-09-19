package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var m_tv1:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        m_tv1 = findViewById(R.id.mytv1);

        m_tv1.setOnClickListener(this::movetoactivity2)
    }

    private fun movetoactivity2(view: View?) {

        var intent = Intent(applicationContext, MainActivity2::class.java)
        startActivity(intent);


    }
}