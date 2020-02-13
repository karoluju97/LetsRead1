package ie.wit.main

import android.app.Application
import android.util.Log
import ie.wit.models.ReadItMemStore
import ie.wit.models.ReaditStore

class ReaditApp: Application() {

    lateinit var readitStore01: ReaditStore

    override fun onCreate(){
        super.onCreate()
        readitStore01 = ReadItMemStore()
        Log.v("Readit","Readir App started")
    }


}