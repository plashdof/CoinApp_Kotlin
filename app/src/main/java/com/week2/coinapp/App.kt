package com.week2.coinapp

import android.app.Application
import android.content.Context
import timber.log.Timber

class App : Application() {


    // ㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅ
    init{
        instance=this
    }

    // ㅅㅅㅅㅅㅅㅅㅅㅅㅅ
    companion object{
        private var instance : App? = null

        fun context() : Context {
            return instance!!.applicationContext
        }
    }
    //
    //////// ㅅㅅㅅㅅㅅㅅ
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
    // 작업환경입니다

    // 작업환경입니다


    // 작업환경입니다

    // 작업환경입니다

    // 머지한거입니다


    // 머지한거입니다



}