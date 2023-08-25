package com.sharath070.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val luckyNum: TextView = findViewById(R.id.luckyNum)
        val shareBtn:Button = findViewById(R.id.shareBtn)

        val userName = userName()!!
        val num = randomNum()

        luckyNum.text = num.toString()

        shareBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_SUBJECT, "$userName is lucky today!")
            intent.putExtra(Intent.EXTRA_TEXT, "His lucky number is $num.")
            startActivity(intent)
        }

    }

    private fun userName(): String {
        return intent.getStringExtra("name")!!
    }

    private fun randomNum(): Int{
        return Random.nextInt(100)
    }
}