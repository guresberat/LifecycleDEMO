package com.guresberat.lifecycledemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    private val tag = "ActivityLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(tag, "onCreate() called.")
    }

    override fun onStart() {
        super.onStart()
        Log.e(tag, "onCreate() called.")
    }

    override fun onResume() {
        super.onResume()
        Log.e(tag, "onResume() called.")
    }

    override fun onStop() {
        super.onStop()
        Log.e(tag, "onStop() called.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(tag, "onRestart() called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag, "onDestroy() called.")
    }
}
