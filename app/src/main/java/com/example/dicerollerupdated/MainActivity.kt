package com.example.dicerollerupdated

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dicerollerupdated.R
import kotlin.random.Random

var x: Int = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button_roll)
        val textView: TextView = findViewById(R.id.text_view_number)
        val diceImage1: ImageView = findViewById(R.id.dice_image_1)
        val diceImage2: ImageView = findViewById(R.id.dice_image_2)


        button.setOnClickListener {
            for (i in 1..1000){
                val str1 = rollDice1()
                val str2 = rollDice2()
                compare(str1, str2)
            }
            textView.text = "${x/1000.toDouble()}"
        }
    }
}

fun rollDice1(): String {

    return when (Random.nextInt(6) + 1) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        else -> "six"
    }
}

fun rollDice2(): String {

    return when (Random.nextInt(6) + 1) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        else -> "six"
    }
}

fun compare(firstInput: String, secondInput: String): Unit {
    if (firstInput == secondInput){
        x++
    }
}

