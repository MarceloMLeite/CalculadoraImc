package com.example.imcapplication30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import com.google.android.material.textfield.TextInputLayout
import java.text.DecimalFormat

class imcActivity : AppCompatActivity() {

    private lateinit var editTextPeso: EditText
    private lateinit var editTextAltura: EditText
    private lateinit var buttonCalcular: Button
    private lateinit var resultado: EditText
    private lateinit var text_input_layout_peso: TextInputLayout
    private lateinit var text_input_layout_altura: TextInputLayout




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)



        editTextPeso = findViewById(R.id.edit_text_peso)
        editTextAltura = findViewById(R.id.edit_text_altura)
        buttonCalcular = findViewById(R.id.buttom_calcular)





        val spinnerSexo = findViewById<Spinner>(R.id.spinner_sexo)


        //*** Lista que serácarregada no spinner
        val options = arrayOf("Não informar", "Feminino", "Masculino")

        //*** Configurar o spinner
        spinnerSexo.adapter = ArrayAdapter<String>(this, R.layout.spinner_item, options)

        //*** Testar se o formulário está preenchido corretamente
        buttonCalcular.setOnClickListener {
            validaForm()
        }


    }

    private fun validaForm(): Boolean {

        var error = false


        if (editTextPeso.text.isEmpty()) {
            editTextPeso.error = "Digite seu peso!"
            error = true
        }

        if (editTextAltura.text.isEmpty()) {
            editTextAltura.error = "Digite sua altura!"
            error = true    }


            return error
        }




    }








