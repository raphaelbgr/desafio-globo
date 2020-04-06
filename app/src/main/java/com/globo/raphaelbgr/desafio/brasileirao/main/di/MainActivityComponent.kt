package com.globo.raphaelbgr.desafio.brasileirao.main.di

import com.globo.raphaelbgr.desafio.brasileirao.main.MainActivity
import com.globo.raphaelbgr.desafio.data.di.DataModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, MainActivityModule::class])
interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)
}