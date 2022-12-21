package com.example.recipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.databinding.SecondActivityBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: SecondActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        binding=SecondActivityBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        val intent= intent
        binding.detailTitle.text=intent.getStringExtra("title")
        binding.detailContent.text=intent.getStringExtra("content")
    }
}