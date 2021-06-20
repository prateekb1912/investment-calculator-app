package com.criclytica.investmentcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var etAge: EditText? = null;
    var etAgeRet: EditText? = null;
    var etSIP: EditText? = null;
    var etInf: EditText? = null;
    var etRet: EditText? = null;

    fun calcReturns() {
        var currAge: String = etAge.text.toString()
        var retAge: String = etAgeRet.text.toString()
        var sipAmt: String = etSIP.text.toString()
        var inflation: String = etSIP.text.toString()
        var annRet: String = etRet.text.toString()
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

    }
}