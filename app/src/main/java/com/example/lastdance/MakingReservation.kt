package com.example.lastdance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MakingReservation : AppCompatActivity() {

    object takeName{
        var reservationName = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_making_reservation)
    }

    fun goValidation(view: View){
        if(findViewById<EditText>(R.id.ReservationName).text.toString().trim { it <= ' ' } != ""){
            takeName.reservationName = findViewById<EditText>(R.id.ReservationName).text.toString()
            startActivity(Intent(this,TableList::class.java))
        }
        else{
            Toast.makeText(applicationContext, "Please enter your name", Toast.LENGTH_SHORT).show()
        }
    }
}
