package com.example.vatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vatapp.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root // reference layout file
        setContentView(view) // link layout

        binding.btCalcVAT.setOnClickListener {
            calculateVat()
        } // End setOnClickListener

    } // End onCreate

    private fun calculateVat() {
        val stringVatet = binding.editTxt.text.toString()
        val cost = stringVatet.toDouble()

        // Radio group
        val selectedID = binding.rgVat.checkedRadioButtonId

        val vatPercentage = when(selectedID){
            R.id.rbVat10 -> 0.10
            R.id.rbVat15 -> 0.10
            else -> 0.10
        } // End when

        var vat = vatPercentage * cost
        var total = cost + vat
        // Switch value
        val roundVat = binding.switchRoundUp.isChecked

        if (roundVat){
            total = kotlin.math.ceil(total)
        }

        // Total Formatting
        val formatedTotal = NumberFormat.getCurrencyInstance().format(total)

        binding.txtCostTotal.text = getString(R.string.total_amount, formatedTotal)

    } // End calculatVat() function
} // End Class

   
