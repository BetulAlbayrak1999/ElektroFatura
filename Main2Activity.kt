package com.example.elektrofatura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_main2)

        btnGunduz.setOnClickListener {
            var intent = Intent (this, Gunduz::class.java)
            startActivity(intent)
        }
        btnPuant.setOnClickListener {
            var intent = Intent (this, Puant::class.java)
            startActivity(intent)
        }
        btnGece.setOnClickListener {
            var intent = Intent (this, Gece::class.java)
            startActivity(intent)
        }

    }
}
