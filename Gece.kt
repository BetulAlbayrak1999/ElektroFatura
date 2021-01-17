package com.example.elektrofatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_gece.*
import kotlin.math.round
class Gece : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_gece)
        try {
            hesaplaWattSaat.setOnClickListener() {
                val fiyat = 0.4498
                var saatResult = edittxtWatt.text.toString().toInt()
                var wattResult = edittxtSaat.text.toString().toInt()

                var result = Math.round(saatResult * wattResult * fiyat)
                Toast.makeText(
                    this,
                    "Tükettiğiniz Elektrik Faturanız : " + result.toString() + "TL",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    catch(ex:Exception){
        System.out.println("you made a mistake")
    }

    }
}

