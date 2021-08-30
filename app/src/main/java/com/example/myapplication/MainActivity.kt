package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var buttonA: Button
    private lateinit var buttonB: Button
    private lateinit var buttonC: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonA = findViewById(R.id.buttonA)
        buttonB = findViewById(R.id.buttonB)
        buttonC = findViewById(R.id.buttonC)
        val task = Task()

        buttonA.setOnClickListener {
            Toast.makeText(this@MainActivity, task.type+" "+task.number, Toast.LENGTH_SHORT).show()
        }

        buttonB.setOnClickListener {
            Toast.makeText(this@MainActivity, Repository.newCopy.type+" "+Repository.newCopy.number, Toast.LENGTH_SHORT).show()
        }

        buttonC.setOnClickListener {
            for(i in 1..10) {
                Toast.makeText(this@MainActivity, "значение из первого цикла: $i", Toast.LENGTH_SHORT).show()
            }
            for(i in 11 until 21) {
                Toast.makeText(this@MainActivity, "значение из второго цикла: $i", Toast.LENGTH_SHORT).show()
            }
            for(i in 20..100 step 10) {
                Toast.makeText(this@MainActivity, "значение из третьего цикла: $i", Toast.LENGTH_SHORT).show()
            }
        }
    }
}