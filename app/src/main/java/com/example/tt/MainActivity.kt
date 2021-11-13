package com.example.tt

import android.R.id
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.EditText
import android.R.id.input
import android.text.TextUtils.split


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


       // val numList:List<Integer> = num.split()

        val btn = findViewById<Button>(R.id.btn)

        val editText = findViewById<EditText>(R.id.editText)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener{

            //get the value from textfield
            val num  = editText.text

           // val enteredData: num<Integer> = editText.text.toString()
            //instead of empty check for nullorempty
            if (num.isNullOrEmpty()) {
                Toast.makeText(applicationContext, "Please Enter Values", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val yourArray:Array<Integer> = num.split(",").sort().show()

                //ex 1,3,2,5,66,75 split this by , and it'll be an array when you split it. then call the sort function. finally display it
               // num.sort()
                //num.forEach{println("${it}")}
                //val SortedArray : Array<Int> = num.sortedArray().show()
                //Toast.makeText(applicationContext, enteredData, Toast.LENGTH_SHORT).show()
            }
        }

    }

}
















