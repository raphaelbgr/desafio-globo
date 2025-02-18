package com.globo.raphaelbgr.desafio.brasileirao.base.di

import android.content.Context
import com.globo.raphaelbgr.desafio.brasileirao.util.NavigatorUtil
import dagger.Module
import dagger.Provides

@Module
open class BaseActivityModule(private val context: Context) {

    @Provides
    fun provideAppNavigatorUtil(): NavigatorUtil {
        return NavigatorUtil(context)
    }
}