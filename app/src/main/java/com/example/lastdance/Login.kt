package com.example.lastdance

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {

    private val REmail = "admin"
    private val Rpassword = "admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun goManageTable(view: View){
        val email = findViewById<EditText>(R.id.email).text.toString()
        val password = findViewById<EditText>(R.id.password).text.toString()
        if(email == REmail && password == Rpassword){
            startActivity(Intent(this,ManageTable::class.java))
        }
        else{
            Toast.makeText(applicationContext,"Wrong email or password!!!\nPlease Try again", Toast.LENGTH_SHORT).show()
        }
    }
}