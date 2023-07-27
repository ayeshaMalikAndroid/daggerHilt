package com.example.daggerhiltapp

import android.util.Log
import javax.inject.Inject

const val TAG = "UserRepository"

interface UserRepository{
    fun saveUserInfo(email:String , password:String )
}
class SQLRepository @Inject constructor() : UserRepository{

    override fun saveUserInfo(email:String, password:String ){
        Log.d(TAG, "saveUserInfo: save user data..")
    }

}
class FireBaseRepository : UserRepository{
    override fun saveUserInfo(email: String, password: String) {
        Log.d(TAG, "saveUserInfo: data saved in firebase..")
    }

}