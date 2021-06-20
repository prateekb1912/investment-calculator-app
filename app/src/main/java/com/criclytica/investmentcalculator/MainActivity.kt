package com.criclytica.investmentcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    var etAge: EditText? = null;
    var etAgeRet: EditText? = null;
    var etSIP: EditText? = null;
    var etInf: EditText? = null;
    var etRet: EditText? = null;
    var tvTotAmt: TextView? = null;

    fun calcReturns() {
        var currAge: Int = etAge?.text.toString().toInt()
        var retAge: Int = etAgeRet?.text.toString().toInt()
        var sipAmt: Int = etSIP?.text.toString().toInt()
        var inflation: Int = etSIP?.text.toString().toInt()
        var annRet: Int = etRet?.text.toString().toInt()

        var numYears: Int = retAge - currAge
        var rate: Double = annRet.toDouble()/1200
        var totAmt: String =  (sipAmt * ((1 + rate).pow(numYears.toDouble()) - 1)* (1+rate)).toString()

        tvTotAmt?.setText(totAmt)

    }

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

    }
}