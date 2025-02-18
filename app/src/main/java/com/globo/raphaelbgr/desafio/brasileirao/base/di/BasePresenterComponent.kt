package com.globo.raphaelbgr.desafio.brasileirao.base.di

import com.globo.raphaelbgr.desafio.brasileirao.application.di.CoroutineModule
import com.globo.raphaelbgr.desafio.brasileirao.base.BasePresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CoroutineModule::class])
interface BasePresenterComponent {

    fun inject(basePresenter: BasePresenter)
}