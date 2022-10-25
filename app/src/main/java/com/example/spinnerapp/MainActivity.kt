package com.example.spinnerapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spGender = findViewById<Spinner>(R.id.spGender)
        val btOK = findViewById<Button>(R.id.btOK)
        val etAge = findViewById<EditText>(R.id.etAge)
        btOK.setOnClickListener {
            val age = etAge.text.toString().toInt()
            if (spGender.selectedItemPosition ==0) {
                when{
                    age < 28 ->
                        Toast.makeText(this,"${getString(R.string.no_hurry)}",Toast.LENGTH_LONG).show()
                    age in 28 .. 33 ->
                        Toast.makeText(this,"${getString(R.string.find_partner)}",Toast.LENGTH_LONG).show()
                    age > 33 ->
                        Toast.makeText(this,"${getString(R.string.get_marry)}",Toast.LENGTH_LONG).show()
                }
            }
            else {
                when {
                    age < 25 ->
                        Toast.makeText(this,"${getString(R.string.no_hurry)}",Toast.LENGTH_LONG).show()
                    age in 25..30 ->
                        Toast.makeText(this,"${getString(R.string.find_partner)}",Toast.LENGTH_LONG).show()
                    age > 30 ->
                        Toast.makeText(this,"${getString(R.string.get_marry)}",Toast.LENGTH_LONG).show()
                }
            }

        }
    }
}