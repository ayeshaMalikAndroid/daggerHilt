package com.example.daggerhiltapp.work

import com.example.daggerhiltapp.FireBaseRepository
import com.example.daggerhiltapp.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    @Provides
     fun provideUserRepository() : UserRepository {
         return FireBaseRepository()
     }
}