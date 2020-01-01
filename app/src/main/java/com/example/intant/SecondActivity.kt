package com.example.intant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var txtName=findViewById<TextView>(R.id.second)
        var intent=intent
        var name=intent.getStringExtra("name")
        txtName.text=name
    }
}
