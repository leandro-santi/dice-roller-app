package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // It does not need anymore views id reference when using View Binding
    /*
    private lateinit var btRoll: Button
    private lateinit var diceImage: ImageView
    private lateinit var diceValue: TextView
    */

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // View Binding
        setContentView(binding.root)

        // setViews() -> We don't need while using View Binding
        setListeners()

    }

    // It does not need anymore views id reference when using View Binding
    /*
    private fun setViews() {

        btRoll = findViewById(R.id.bt_roll)
        diceImage = findViewById(R.id.iv_dice)
        diceValue = findViewById(R.id.tv_dice_value)

    }
    */

    private fun setListeners() {

        binding.btRoll.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {

        val randomNumber = Random.nextInt(1, 7)

        when (randomNumber) {
            1 -> binding.ivDice.setImageResource(R.drawable.dice_1)
            2 -> binding.ivDice.setImageResource(R.drawable.dice_2)
            3 -> binding.ivDice.setImageResource(R.drawable.dice_3)
            4 -> binding.ivDice.setImageResource(R.drawable.dice_4)
            5 -> binding.ivDice.setImageResource(R.drawable.dice_5)
            6 -> binding.ivDice.setImageResource(R.drawable.dice_6)
        }

        val textResult = "$randomNumber!"

        binding.tvDiceValue.text = textResult

    }

}