package com.sharath070.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btn)
        val edt: EditText = findViewById(R.id.editText)

        btn.setOnClickListener {
            if (edt.text.isEmpty()) {
                Toast.makeText(this, "Please Enter your Name.", Toast.LENGTH_SHORT).show()
            } else {
                val name = edt.text.toString()
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("name", name)
                startActivity(intent)
            }
        }
    }
}