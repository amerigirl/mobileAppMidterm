package com.example.mobileappmidterm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.ImageView


class throwDie2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_throw_die2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val throwButton = findViewById<Button>(R.id.button)
        val imageViewDie1 = findViewById<ImageView>(R.id.imageViewDie1)
        val imageViewDie2 = findViewById<ImageView>(R.id.imageViewDie2)
        val imageViewDie3 = findViewById<ImageView>(R.id.imageViewDie3)

        throwButton.setOnClickListener {
            val diceRoll1 = (1..6).random()
            val diceRoll2 = (1..6).random()
            val diceRoll3 = (1..6).random()

            imageViewDie1.setImageResource(getDiceResource(diceRoll1))
            imageViewDie2.setImageResource(getDiceResource(diceRoll2))
            imageViewDie3.setImageResource(getDiceResource(diceRoll3))
        }
    }

    private fun getDiceResource(roll: Int): Int {
        return when (roll) {
            1 -> R.drawable.die1
            2 -> R.drawable.die2
            3 -> R.drawable.die3
            4 -> R.drawable.die4
            5 -> R.drawable.die5
            6 -> R.drawable.die6
            else -> R.drawable.die1
        }
    }
}