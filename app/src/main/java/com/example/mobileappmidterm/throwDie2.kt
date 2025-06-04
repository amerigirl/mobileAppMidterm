package com.example.mobileappmidterm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button


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

        throwButton.setOnClickListener {

            val diceRoll1 = (1..6).random()
            val diceRoll2 = (1..6).random()
            val diceRoll3 = (1..6).random()


            val imageVieDie1 = findViewById<ImageView>(R.id.imageViewDie1)
        }
    }
}
