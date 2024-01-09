package com.example.android.treasureHunt

import android.app.Application
import android.content.Context




class HuntApp: Application() {

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object{
        var context: Context? = null
    }
}