package com.example.daggerhiltapp.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}