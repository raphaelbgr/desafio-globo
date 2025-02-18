package com.globo.raphaelbgr.desafio.brasileirao.di

import android.content.Context
import androidx.room.Room
import com.globo.raphaelbgr.desafio.brasileirao.application.di.ApplicationModule
import com.globo.raphaelbgr.desafio.data.local.AppDatabase
import dagger.Module
import dagger.Provides

@Module
class TestApplicationModule(private val context: Context) : ApplicationModule(context) {

    @Provides
    override fun provideAppDatabase(): AppDatabase {
        return Room.inMemoryDatabaseBuilder(context, AppDatabase::class.java).build()
    }
}