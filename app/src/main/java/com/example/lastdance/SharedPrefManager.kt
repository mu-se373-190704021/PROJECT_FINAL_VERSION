package com.example.lastdance

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent

class SharedPrefManager private constructor(context: Context) {

    //this method will checker whether user is already logged in or not
    val isLoggedIn: Boolean
        get() {
            val sharedPreferences = ctx?.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
            return sharedPreferences?.getString(KEY_CUSTOMER, null) != null
        }

    //this method will give the logged in user
    val user: User
        get() {
            val sharedPreferences = ctx?.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
            return User(
                sharedPreferences!!.getInt(KEY_ID, -1),
                sharedPreferences.getString(KEY_TABLE, null),
                sharedPreferences.getString(KEY_CUSTOMER, null)
            )
        }

    init {
        ctx = context
    }

    //this method will store the user data in shared preferences
    fun userLogin(user: User) {
        val sharedPreferences = ctx?.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences?.edit()
        editor?.putInt(KEY_ID, user.id)
        user.id++
        editor?.putString(KEY_TABLE, user.table)
        editor?.putString(KEY_CUSTOMER, user.customer)
        editor?.apply()
    }

    fun logout() {
        val sharedPreferences = ctx?.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences?.edit()
        editor?.clear()
        editor?.apply()
        ctx?.startActivity(Intent(ctx, ManageTable::class.java))
    }

    companion object {
        private val SHARED_PREF_NAME = "volleyregisterlogin"
        private val KEY_CUSTOMER = "keycustomer"
        private val KEY_TABLE = "keytable"
        private val KEY_ID = "keyid"
        @SuppressLint("StaticFieldLeak")
        private var mInstance: SharedPrefManager? = null
        @SuppressLint("StaticFieldLeak")
        private var ctx: Context? = null
        @Synchronized
        fun getInstance(context: Context): SharedPrefManager {
            if (mInstance == null) {
                mInstance = SharedPrefManager(context)
            }
            return mInstance as SharedPrefManager
        }
    }
}