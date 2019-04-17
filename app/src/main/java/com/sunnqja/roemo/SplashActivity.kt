package com.sunnqja.roemo

import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, LoginActivity::class.java)
        intent.putExtra("state", "launch")
        startActivity(intent)
        finish()
    }
}