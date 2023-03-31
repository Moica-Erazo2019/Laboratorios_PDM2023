package com.erazoquinteros.labo3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var Fivecent: ImageView
    private lateinit var Tencent: ImageView
    private lateinit var Cora: ImageView
    private lateinit var Dolar: ImageView
    private lateinit var Total: TextView
    private var Contador = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        addListener()


    }
    private fun bind (){
        Fivecent = findViewById( R.id.Fivecent_img)
        Tencent = findViewById( R.id.Tencent_img)
        Cora = findViewById( R.id.Cora_img)
        Dolar = findViewById( R.id.Dolar_img)
        Total = findViewById( R.id.Total_Text)
    }

    private fun addListener(){
        Fivecent.setOnClickListener {
            Contador += 0.05
            Total.text = "$ %.2f".format(Contador)

        }
        Tencent.setOnClickListener {
            Contador += 0.10
            Total.text = "$ %.2f".format(Contador)
        }
        Cora.setOnClickListener {
            Contador += 0.25
            Total.text = "$ %.2f".format(Contador)
        }
        Dolar.setOnClickListener {
            Contador += 1.0
            Total.text = "$ %.2f".format(Contador)
        }
    }
}