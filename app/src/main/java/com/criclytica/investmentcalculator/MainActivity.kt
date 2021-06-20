package com.criclytica.investmentcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var etAge: EditText? = null;
    var etAgeRet: EditText? = null;
    var etSIP: EditText? = null;
    var etInf: EditText? = null;
    var etRet: EditText? = null;

    fun calcReturns() {
        Log.i("IC", "App runs successfully")
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