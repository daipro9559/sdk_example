package com.dainv.sdkexample

import android.content.Context

class SharePreferenceUtil(private val context:Context) {
    private val sharedPreferences = context.getSharedPreferences("My SharePrefernce",Context.MODE_PRIVATE)

    fun putString(value:String,key:String){
        sharedPreferences.edit().apply {
            putString(value,key)
            commit()
        }
    }

    fun putInt(value:Int,key:String){
        sharedPreferences.edit().apply {
            putInt(value,key)
            commit()
        }
    }

    fun putBoolean(value:Boolean,key:String){
        sharedPreferences.edit().apply {
            putBoolean(value,key)
            commit()
        }
    }
}