package com.maximo.douglas.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maximo.douglas.mylibrary.utils.sum

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum(1, 2)
    }
}