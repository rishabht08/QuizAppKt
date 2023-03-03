package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FinishScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish_screen)

        val btnFinish : Button = findViewById(R.id.btnFinish)
        val tvScore : TextView = findViewById(R.id.tvScore)
        val tvUserName : TextView = findViewById(R.id.tvUserName)

        val score = intent.getIntExtra(Constants.CORRECT_ANSWERS , 0)
        val userName = intent.getStringExtra(Constants.USER_NAME)

        tvUserName.text = userName
        tvScore.text = "Your Score is $score out of 10"

        btnFinish.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}