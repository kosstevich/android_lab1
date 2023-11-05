package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val genButton: Button = findViewById(R.id.button1)
        val calcButton: Button = findViewById(R.id.button2)
        val vecA: TextView = findViewById(R.id.TextView1)
        val vecB: TextView = findViewById(R.id.TextView2)
        val sum: TextView = findViewById(R.id.TextView3)
        val len: EditText = findViewById(R.id.editTextText)

        genButton.setOnClickListener{
            val vectorA: ArrayList<Int>
            val vectorB: ArrayList<Int>

            if(len.text.isEmpty()){
                val length = Random.nextInt(1,10)
                vectorA = generateVector(length)
                vectorB = generateVector(length)

                len.setText(length.toString())
                vecA.setText(vectorA.toString())
                vecB.setText(vectorB.toString())
            }else{
                vectorA = generateVector(len.text.toString().toInt())
                vectorB = generateVector(len.text.toString().toInt())

                vecA.setText(vectorA.toString())
                vecB.setText(vectorB.toString())
            }

            calcButton.setOnClickListener {
                sum.setText(calculate(vectorA, vectorB).toString())
            }
        }

        calcButton.setOnClickListener {
            Toast.makeText(this, "Пожалуйста, сгенерируйте векторы",Toast.LENGTH_SHORT).show()
        }

    }
}