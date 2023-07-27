package com.example.daggerhiltapp.data.repository

import android.app.Application
import com.example.daggerhiltapp.R
import com.example.daggerhiltapp.data.remote.MyApi
import com.example.daggerhiltapp.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }
}