package com.example.twopages4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<AppCompatButton>(R.id.but)
        val disp1= findViewById<EditText>(R.id.display1)
        val disp2=findViewById<EditText>(R.id.display2)
        val disp3=findViewById<TextView>(R.id.display3)
        var sum=0
        btn.setOnClickListener{
            var string1=disp1.text
            var string2=disp2.text
            sum=(Integer.parseInt(string1.toString()))+(Integer.parseInt(string2.toString()))
            disp3.text=sum.toString()
        } }
}