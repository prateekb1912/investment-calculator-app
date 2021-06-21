package com.criclytica.investmentcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    var etAge: EditText? = null;
    var etAgeRet: EditText? = null;
    var etSIP: EditText? = null;
    var etInf: EditText? = null;
    var etRet: EditText? = null;
    var tvTotAmt: TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalc = findViewById<Button>(R.id.buttonCalc)
        etAge = findViewById(R.id.etAge)
        etAgeRet = findViewById(R.id.etAgeRet)
        etSIP = findViewById(R.id.etSIP)
        etInf = findViewById(R.id.etInf)
        etRet = findViewById(R.id.etRet)
        tvTotAmt = findViewById(R.id.tvTotAmt)

        btnCalc.setOnClickListener(View.OnClickListener {
            val currAge: Int = etAge?.text.toString().toInt()
            val retAge: Int = etAgeRet?.text.toString().toInt()
            val sipAmt: Int = etSIP?.text.toString().toInt()
            val inflation: Int = etSIP?.text.toString().toInt()
            val annRet: Int = etRet?.text.toString().toInt()

            val numMonths: Int = (retAge - currAge)*12
            val rate: Double = annRet.toDouble()/1200
            val totAmt: Double =  (sipAmt * ((1 + rate).pow(numMonths.toDouble()) - 1)/rate * (1+rate))

            val dec = DecimalFormat("#,##,##,###")

            tvTotAmt?.setText("Rs. $dec.format(totAmt)")
            Log.i("IC", "Total Amount == $totAmt")
        })

    }
}