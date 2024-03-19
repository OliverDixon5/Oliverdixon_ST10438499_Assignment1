package com.example.icetask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val tableNumberEditText = findViewById<EditText>(R.id.tableNumberEditText)

        multiplyButton.setOnClickListener{
            val intent = Intent(this,Multiplication_table::class.java)

            intent.putExtra("tableNumber",
                tableNumberEditText.text.toString())
            startActivity(intent)
        }
    }
}