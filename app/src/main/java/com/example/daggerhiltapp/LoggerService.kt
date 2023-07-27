package com.example.hilt

import android.util.Log
import javax.inject.Inject


const val TAG = "LoggerService"
class LoggerService @Inject constructor(){
    fun log(message : String){
        Log.d(TAG, message)
        
    }
}