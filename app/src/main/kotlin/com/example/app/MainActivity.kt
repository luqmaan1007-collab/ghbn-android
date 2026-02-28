package com.example.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    
    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val tv = findViewById<TextView>(R.id.textView)
        tv.text = stringFromJNI()
    }
    
    external fun stringFromJNI(): String
}