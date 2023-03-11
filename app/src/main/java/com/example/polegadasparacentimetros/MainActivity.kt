package com.example.polegadasparacentimetros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.polegadasparacentimetros.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val inchValue = 2.54
    private lateinit var enterInches: EditText
    private lateinit var convertButton: Button
    private lateinit var textViewConvert: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enterInches = findViewById(R.id.editTextInches)
        convertButton = findViewById(R.id.button_convert)
        textViewConvert = findViewById(R.id.textViewConvert)

        binding.buttonConvert.setOnClickListener {

            val result = enterInches.text.toString().toDouble()*inchValue

            if(!enterInches.text.toString().isEmpty()){

                textViewConvert.text = result.toString()

            }else {
                textViewConvert.text = getString(R.string.text)
            }

        }
    }
}