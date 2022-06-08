package com.example.lastdance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goManagerLogin(view: View){
        startActivity(Intent(this,Login::class.java))
    }
    fun goTableList(view: View){
        startActivity(Intent(this,MakingReservation::class.java))
    }
}