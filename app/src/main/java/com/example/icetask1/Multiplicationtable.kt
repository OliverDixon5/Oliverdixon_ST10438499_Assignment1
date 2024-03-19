package com.example.icetask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Multiplication_table : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication_table)

        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")

        val tableNumber = tableString?.toInt()

        val multiplicationTable = findViewById<TextView>(R.id.multiplication_TabelTextView)

        multiplicationTable.text = "$tableNumber x table"
    }
}