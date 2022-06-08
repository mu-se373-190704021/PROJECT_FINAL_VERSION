package com.example.lastdance

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import org.json.JSONException
import org.json.JSONObject
import java.util.*

class ManageTable : AppCompatActivity() {

    object tables{
        var tables = arrayListOf<Int>(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
        var tableNumber = 16
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_table)

        findViewById<TextView>(R.id.table1).isVisible = false
        findViewById<TextView>(R.id.table2).isVisible = false
        findViewById<TextView>(R.id.table3).isVisible = false
        findViewById<TextView>(R.id.table4).isVisible = false
        findViewById<TextView>(R.id.table5).isVisible = false
        findViewById<TextView>(R.id.table6).isVisible = false
        findViewById<TextView>(R.id.table7).isVisible = false
        findViewById<TextView>(R.id.table8).isVisible = false
        findViewById<TextView>(R.id.table9).isVisible = false
        findViewById<TextView>(R.id.table10).isVisible = false
        findViewById<TextView>(R.id.table11).isVisible = false
        findViewById<TextView>(R.id.table12).isVisible = false
        findViewById<TextView>(R.id.table13).isVisible = false
        findViewById<TextView>(R.id.table14).isVisible = false
        findViewById<TextView>(R.id.table15).isVisible = false
        findViewById<TextView>(R.id.table16).isVisible = false

        val sharedPreferences1 = this.getSharedPreferences("com.example.lastdance",Context.MODE_PRIVATE)
        tables.tableNumber = sharedPreferences1.getInt("tableNumber",0)
        arrangeTable()
    }

    private fun arrangeTable(){
        for (i in 1..tables.tableNumber){
            when (i){
                1 -> findViewById<TextView>(R.id.table1).isVisible = true
                2 -> findViewById<TextView>(R.id.table2).isVisible = true
                3 -> findViewById<TextView>(R.id.table3).isVisible = true
                4 -> findViewById<TextView>(R.id.table4).isVisible = true
                5 -> findViewById<TextView>(R.id.table5).isVisible = true
                6 -> findViewById<TextView>(R.id.table6).isVisible = true
                7 -> findViewById<TextView>(R.id.table7).isVisible = true
                8 -> findViewById<TextView>(R.id.table8).isVisible = true
                9 -> findViewById<TextView>(R.id.table9).isVisible = true
                10 -> findViewById<TextView>(R.id.table10).isVisible = true
                11 -> findViewById<TextView>(R.id.table11).isVisible = true
                12 -> findViewById<TextView>(R.id.table12).isVisible = true
                13 -> findViewById<TextView>(R.id.table13).isVisible = true
                14 -> findViewById<TextView>(R.id.table14).isVisible = true
                15 -> findViewById<TextView>(R.id.table15).isVisible = true
                16 -> findViewById<TextView>(R.id.table16).isVisible = true
            }
        }
        if(tables.tableNumber != 0){
            val idTableNumber = findViewById<EditText>(R.id.enterNumberOfTables)
            val idSaveButton = findViewById<Button>(R.id.Save)
            idTableNumber.isEnabled = false
            idSaveButton.isEnabled = false
        }
    }

    @SuppressLint("SetTextI18n")
    fun userLogin(view: View) {
        val idTableNumber = findViewById<EditText>(R.id.enterNumberOfTables)
        val idSaveButton = findViewById<Button>(R.id.Save)
        val tableNumber = idTableNumber.text.toString().toInt()
        tables.tableNumber = tableNumber

        if(tableNumber in 1..16){
            idTableNumber.isEnabled = false
            idSaveButton.isEnabled = false
            for(i in 0..(tableNumber-1)){
                tables.tables[i]=1
            }
            for(i in tableNumber..15){
                tables.tables[i]=3
            }
            arrangeTable()
            sendDataBase()
        }
        else{
            Toast.makeText(applicationContext,"Please enter between 0 to 16...",Toast.LENGTH_SHORT).show()
        }

        val sharedPreferences1 = this.getSharedPreferences("com.example.lastdance",Context.MODE_PRIVATE)
        sharedPreferences1.edit().putInt("tableNumber",tables.tableNumber).apply()
    }

    @SuppressLint("SetTextI18n")
    fun reset(view: View){
        val idTableNumber = findViewById<EditText>(R.id.enterNumberOfTables)
        val idSaveButton = findViewById<Button>(R.id.Save)

        tables.tableNumber = 16
        findViewById<TextView>(R.id.table1).isVisible = false
        findViewById<TextView>(R.id.table2).isVisible = false
        findViewById<TextView>(R.id.table3).isVisible = false
        findViewById<TextView>(R.id.table4).isVisible = false
        findViewById<TextView>(R.id.table5).isVisible = false
        findViewById<TextView>(R.id.table6).isVisible = false
        findViewById<TextView>(R.id.table7).isVisible = false
        findViewById<TextView>(R.id.table8).isVisible = false
        findViewById<TextView>(R.id.table9).isVisible = false
        findViewById<TextView>(R.id.table10).isVisible = false
        findViewById<TextView>(R.id.table11).isVisible = false
        findViewById<TextView>(R.id.table12).isVisible = false
        findViewById<TextView>(R.id.table13).isVisible = false
        findViewById<TextView>(R.id.table14).isVisible = false
        findViewById<TextView>(R.id.table15).isVisible = false
        findViewById<TextView>(R.id.table16).isVisible = false
        idTableNumber.isEnabled = true
        idSaveButton.isEnabled = true
        deleteTable()

        val sharedPreferences1 = this.getSharedPreferences("com.example.lastdance",Context.MODE_PRIVATE)
        sharedPreferences1.edit().putInt("tableNumber",tables.tableNumber).apply()
    }

    private fun sendDataBase(){
        val customer = "none"
        for (table in 1..tables.tableNumber){
            val urlRegister = URLs.URL_REGISTER
            val stringRequest = object : StringRequest(Request.Method.POST, urlRegister,
                Response.Listener { response ->
                    try {
                        val obj = JSONObject(response)
                        if (!obj.getBoolean("error")) {
                            Toast.makeText(applicationContext, "Tables saved..", Toast.LENGTH_SHORT).show()
                            val userJson = obj.getJSONObject("user")

                            val user = User(
                                userJson.getInt("id"),
                                userJson.getString("table"),
                                userJson.getString("customer")
                            )
                            SharedPrefManager.getInstance(applicationContext).userLogin(user)
                            finish()
                            startActivity(Intent(this, ManageTable::class.java))
                        } else {
                            Toast.makeText(applicationContext, obj.getString("message"), Toast.LENGTH_SHORT).show()
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                },
                Response.ErrorListener { error -> Toast.makeText(applicationContext, error.message, Toast.LENGTH_SHORT).show() }) {
                @Throws(AuthFailureError::class)
                override fun getParams(): Map<String, String> {
                    val params = HashMap<String, String>()
                    params["table"] = table.toString().trim { it <= ' ' }
                    params["customer"] = customer.trim { it <= ' ' }
                    return params
                }
            }
            VolleySingleton.getInstance(this).addToRequestQueue(stringRequest)
        }
    }

    private fun deleteTable(){
        for (table in 1..16){
            val urlDelete = URLs.URL_DELETE //+ "?table=" + table
            val stringRequest = object : StringRequest(Request.Method.POST, urlDelete,
                Response.Listener { response ->
                    try {
                        //converting response to json object
                        val obj = JSONObject(response)

                        //if no error in response
                        if (!obj.getBoolean("error")) {
                            Toast.makeText(applicationContext, "tables deleted successfully.", Toast.LENGTH_SHORT).show()

                            //getting the user from the response
                            val userJson = obj.getJSONObject("user")

                            //creating a new user object
                            val user = User(
                                userJson.getInt("id"),
                                userJson.getString("table"),
                                userJson.getString("customer")
                            )

                            //storing the user in shared preferences
                            SharedPrefManager.getInstance(applicationContext).userLogin(user)
                            //starting the MainActivity
                            finish()
                        } else {
                            Toast.makeText(applicationContext, obj.getString("message"), Toast.LENGTH_SHORT).show()
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                },
                Response.ErrorListener { error -> Toast.makeText(applicationContext, error.message, Toast.LENGTH_SHORT).show() }) {
                @Throws(AuthFailureError::class)
                override fun getParams(): Map<String, String> {
                    val params = HashMap<String, String>()
                    params["table"] = table.toString()
                    return params
                }
            }
            VolleySingleton.getInstance(this).addToRequestQueue(stringRequest)
        }
    }

    fun goBack(view: View){
        startActivity(Intent(this, MainActivity::class.java))
    }
}