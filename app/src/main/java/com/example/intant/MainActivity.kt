package com.example.intant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtName=findViewById<EditText>(R.id.txt_name)
        var btnClick=findViewById<Button>(R.id.btn_name)

        btnClick.setOnClickListener {
            var name=txtName.text.toString()
            var intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }
    }
}
