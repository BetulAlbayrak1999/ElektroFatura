package com.example.elektrofatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_gece.*
import kotlinx.android.synthetic.main.activity_gece.edittxtSaat
import kotlinx.android.synthetic.main.activity_gece.edittxtWatt
import kotlinx.android.synthetic.main.activity_gece.hesaplaWattSaat
import kotlinx.android.synthetic.main.activity_puant.*
import kotlin.math.round

class Puant : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_puant)
        try {
            hesaplaWattSaat.setOnClickListener {
                val fiyat = 1.0567
                val wattResult = edittxtWatt.text.toString().toInt()
                val saatResult = edittxtSaat.text.toString().toInt()

                var result = Math.round(wattResult * saatResult * fiyat)

                Toast.makeText(
                    this,
                    "Tükettiğiniz Elektrik Faturanız : " + result.toString() + " TL",
                    Toast.LENGTH_LONG
                ).show()
            }
        } catch (ex: Exception) {
            System.out.println("you made a mistake")
        }
    }
}

