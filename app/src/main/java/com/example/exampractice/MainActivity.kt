package com.example.exampractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exampractice.fragments.NewsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.container, NewsFragment())
            .commit()
    }
}