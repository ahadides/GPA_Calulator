package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity3 : AppCompatActivity() {
    lateinit var m_textView:TextView;
    lateinit var sk:Snackbar;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        m_textView = findViewById(R.id.textView)

        var fn= intent.getStringExtra("FULL_NAME")
        var g= intent.getIntExtra("AGE",0)
        var sldFlt= intent.getFloatExtra("SLIDERVALUE",0.0f)

        m_textView.text = fn+ " "+(sldFlt+g)

        m_textView.setOnClickListener({
            Toast.makeText(this,"Clicked the name",Toast.LENGTH_LONG).show()
        }
        )


    }


}