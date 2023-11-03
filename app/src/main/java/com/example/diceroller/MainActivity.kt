package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.graphics.drawable.toDrawable
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var btRoll: Button
    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViews()
        setListeners()

    }

    private fun setViews() {

        btRoll = findViewById(R.id.bt_roll)
        diceImage = findViewById(R.id.iv_dice)

    }

    private fun setListeners() {

        btRoll.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {

        when (Random.nextInt(1, 7)) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }

    }

}