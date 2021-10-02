package com.example.imcapplication30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNcd = findViewById<Button>(R.id.button_ncd)
        val buttonImc = findViewById<Button>(R.id.button_imc)

        buttonImc.setOnClickListener {
            val abrirImc = Intent (this, imcActivity::class.java)
            startActivity(abrirImc)
        }

        buttonNcd.setOnClickListener {
            val abrirNcd = Intent(this, NecessidadeCaloricaActivity::class.java)
            startActivity(abrirNcd)


        }
    }
}