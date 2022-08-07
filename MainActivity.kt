package com.example.vatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vatapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //object
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.btnCalculateVat.setOnClickListener{
            calculateVat()
        }
    }// End onCreate
    private fun calculateVat() {
        //
    }
}//End main