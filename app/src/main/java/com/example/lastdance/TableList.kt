package com.example.lastdance

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import org.json.JSONException
import org.json.JSONObject
import java.util.HashMap

class TableList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_list)

        loginDataBase()
    }

    fun tableStatusUpdate(){
        for(i in 1..16){
            when (i){
                1 -> {
                    if(ManageTable.tables.tables[0] == 1){
                        findViewById<TextView>(R.id.table1).isVisible = true
                        findViewById<TextView>(R.id.table1).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[0] == 2){
                        findViewById<TextView>(R.id.table1).isVisible = true
                        findViewById<TextView>(R.id.table1).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table1).isVisible = false
                    }
                }
                2 -> {
                    if(ManageTable.tables.tables[1] == 1){
                        findViewById<TextView>(R.id.table2).isVisible = true
                        findViewById<TextView>(R.id.table2).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[1] == 2){
                        findViewById<TextView>(R.id.table2).isVisible = true
                        findViewById<TextView>(R.id.table2).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table2).isVisible = false
                    }
                }
                3 -> {
                    if(ManageTable.tables.tables[2] == 1){
                        findViewById<TextView>(R.id.table3).isVisible = true
                        findViewById<TextView>(R.id.table3).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[2] == 2){
                        findViewById<TextView>(R.id.table3).isVisible = true
                        findViewById<TextView>(R.id.table3).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table3).isVisible = false
                    }
                }
                4 -> {
                    if(ManageTable.tables.tables[3] == 1){
                        findViewById<TextView>(R.id.table4).isVisible = true
                        findViewById<TextView>(R.id.table4).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[3] == 2){
                        findViewById<TextView>(R.id.table4).isVisible = true
                        findViewById<TextView>(R.id.table4).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table4).isVisible = false
                    }
                }
                5 -> {
                    if(ManageTable.tables.tables[4] == 1){
                        findViewById<TextView>(R.id.table5).isVisible = true
                        findViewById<TextView>(R.id.table5).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[4] == 2){
                        findViewById<TextView>(R.id.table5).isVisible = true
                        findViewById<TextView>(R.id.table5).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table5).isVisible = false
                    }
                }
                6 -> {
                    if(ManageTable.tables.tables[5] == 1){
                        findViewById<TextView>(R.id.table6).isVisible = true
                        findViewById<TextView>(R.id.table6).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[5] == 2){
                        findViewById<TextView>(R.id.table6).isVisible = true
                        findViewById<TextView>(R.id.table6).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table6).isVisible = false
                    }
                }
                7 -> {
                    if(ManageTable.tables.tables[6] == 1){
                        findViewById<TextView>(R.id.table7).isVisible = true
                        findViewById<TextView>(R.id.table7).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[6] == 2){
                        findViewById<TextView>(R.id.table7).isVisible = true
                        findViewById<TextView>(R.id.table7).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table7).isVisible = false
                    }
                }
                8 -> {
                    if(ManageTable.tables.tables[7] == 1){
                        findViewById<TextView>(R.id.table8).isVisible = true
                        findViewById<TextView>(R.id.table8).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[7] == 2){
                        findViewById<TextView>(R.id.table8).isVisible = true
                        findViewById<TextView>(R.id.table8).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table8).isVisible = false
                    }
                }
                9 -> {
                    if(ManageTable.tables.tables[8] == 1){
                        findViewById<TextView>(R.id.table9).isVisible = true
                        findViewById<TextView>(R.id.table9).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[8] == 2){
                        findViewById<TextView>(R.id.table9).isVisible = true
                        findViewById<TextView>(R.id.table9).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table9).isVisible = false
                    }
                }
                10 -> {
                    if(ManageTable.tables.tables[9] == 1){
                        findViewById<TextView>(R.id.table10).isVisible = true
                        findViewById<TextView>(R.id.table10).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[9] == 2){
                        findViewById<TextView>(R.id.table10).isVisible = true
                        findViewById<TextView>(R.id.table10).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table10).isVisible = false
                    }
                }
                11 -> {
                    if(ManageTable.tables.tables[10] == 1){
                        findViewById<TextView>(R.id.table11).isVisible = true
                        findViewById<TextView>(R.id.table11).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[10] == 2){
                        findViewById<TextView>(R.id.table11).isVisible = true
                        findViewById<TextView>(R.id.table11).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table11).isVisible = false
                    }
                }
                12 -> {
                    if(ManageTable.tables.tables[11] == 1){
                        findViewById<TextView>(R.id.table12).isVisible = true
                        findViewById<TextView>(R.id.table12).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[11] == 2){
                        findViewById<TextView>(R.id.table12).isVisible = true
                        findViewById<TextView>(R.id.table12).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table12).isVisible = false
                    }
                }
                13 -> {
                    if(ManageTable.tables.tables[12] == 1){
                        findViewById<TextView>(R.id.table13).isVisible = true
                        findViewById<TextView>(R.id.table13).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[12] == 2){
                        findViewById<TextView>(R.id.table13).isVisible = true
                        findViewById<TextView>(R.id.table13).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table13).isVisible = false
                    }
                }
                14 -> {
                    if(ManageTable.tables.tables[13] == 1){
                        findViewById<TextView>(R.id.table14).isVisible = true
                        findViewById<TextView>(R.id.table14).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[13] == 2){
                        findViewById<TextView>(R.id.table14).isVisible = true
                        findViewById<TextView>(R.id.table14).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table14).isVisible = false
                    }
                }
                15 -> {
                    if(ManageTable.tables.tables[14] == 1){
                        findViewById<TextView>(R.id.table15).isVisible = true
                        findViewById<TextView>(R.id.table15).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[14] == 2){
                        findViewById<TextView>(R.id.table15).isVisible = true
                        findViewById<TextView>(R.id.table15).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table15).isVisible = false
                    }
                }
                16 -> {
                    if(ManageTable.tables.tables[15] == 1){
                        findViewById<TextView>(R.id.table16).isVisible = true
                        findViewById<TextView>(R.id.table16).setBackgroundColor(-16711936)
                    }
                    else if(ManageTable.tables.tables[15] == 2){
                        findViewById<TextView>(R.id.table16).isVisible = true
                        findViewById<TextView>(R.id.table16).setBackgroundColor(-65536)
                    }
                    else{
                        findViewById<TextView>(R.id.table16).isVisible = false
                    }
                }
            }
        }
    }

    fun apply(view: View){
        findViewById<Button>(R.id.Apply).isEnabled = false
        val selectedTableId = findViewById<EditText>(R.id.SelectedTable)
        val selectedTable = selectedTableId.text.toString().toInt()
        if(selectedTable <= ManageTable.tables.tableNumber && selectedTable > 0){
            deleteTable()
            Thread.sleep(5_00)
            sendDataBase()
            Thread.sleep(5_00)
            loginDataBase()
            // changeDataBase()
            selectedTableId.isEnabled = false
        }
    }

    fun loginDataBase(){
        for (table in 1..16){
            val urlLogin = URLs.URL_LOGIN //+ "?table=" + table
            val stringRequest = object : StringRequest(
                Request.Method.POST, urlLogin,
                Response.Listener { response ->
                    try {
                        //converting response to json object
                        val obj = JSONObject(response)

                        //if no error in response
                        if (!obj.getBoolean("error")) {

                            //getting the user from the response
                            val userJson = obj.getJSONObject("user")

                            //creating a new user object
                            val user = User(
                                userJson.getInt("id"),
                                userJson.getString("table"),
                                userJson.getString("customer")
                            )

                            if(userJson.getString("customer") == "none"){
                                ManageTable.tables.tables[table-1] = 1
                            }
                            else if(userJson.getString("customer") != "none"){
                                ManageTable.tables.tables[table-1] = 2
                            }
                            else{
                                ManageTable.tables.tables[table-1] = 3
                            }

                            //storing the user in shared preferences
                            SharedPrefManager.getInstance(applicationContext).userLogin(user)
                            tableStatusUpdate()
                            //starting the MainActivity
                            //finish(
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

    /*fun changeDataBase(){
        val table = findViewById<EditText>(R.id.SelectedTable).text.toString().trim { it <= ' ' }
        val customer = MakingReservation.takeName.reservationName.trim { it <= ' ' }

        val urlUpdate = URLs.URL_UPDATE //+ "?table=" + table + "&customer=" + customer
        val stringRequest = object : StringRequest(Request.Method.POST, urlUpdate,
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
                params["table"] = table
                params["customer"] = customer
                return params
            }
        }
        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest)
    }*/

    private fun sendDataBase(){
        val table = findViewById<EditText>(R.id.SelectedTable).text.toString().trim { it <= ' ' }
        val customer = MakingReservation.takeName.reservationName.trim { it <= ' ' }

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
                        //finish()
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
                params["table"] = table.trim { it <= ' ' }
                params["customer"] = customer.trim { it <= ' ' }
                return params
            }
        }
        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest)
    }

    private fun deleteTable(){
        val table = findViewById<EditText>(R.id.SelectedTable).text.toString().trim { it <= ' ' }

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
                        //finish()
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
                params["table"] = table
                return params
            }
        }
        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest)
    }

    fun goBack(view: View){
        startActivity(Intent(this, MainActivity::class.java))
    }

    fun goReservation(view: View){
        startActivity(Intent(this,Validation::class.java))
    }
}