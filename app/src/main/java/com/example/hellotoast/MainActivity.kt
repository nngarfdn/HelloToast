package com.example.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hellotoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            txtNumber.text = number.toString()
            btnCount.setOnClickListener {
                //increment number and set txtNumber
                number++
                txtNumber.text = number.toString()
            }
            btnToast.setOnClickListener {
                //show toast
                Toast.makeText(this@MainActivity, "Count $number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}