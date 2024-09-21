package com.example.viewmodel

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewmodel.databinding.ActivityMainBinding
import com.example.viewmodel.viewmodel.CounterViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
  private val counterViewModel: CounterViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
binding.countTxt.text = counterViewModel.counter.toString()

        binding.countBtn.setOnClickListener {
counterViewModel.incrementCounter()
            binding.countTxt.text = (binding.countTxt.text.toString().toInt() + 1).toString()

        }


    }
}