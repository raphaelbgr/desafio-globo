package com.globo.raphaelbgr.desafio.brasileirao.application.di

import android.content.Context
import androidx.room.Room
import com.globo.raphaelbgr.desafio.data.local.AppDatabase
import dagger.Module
import dagger.Provides

@Module
open class ApplicationModule(private val context: Context) {

    @Provides
    open fun provideAppDatabase(): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "brasileirao.db")
            .build()
    }
}