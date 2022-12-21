package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        val recyclerview=binding.recyclerView
        recyclerview.layoutManager=LinearLayoutManager(this)
        val data=ArrayList<ItemsViewModel>()
        data.add(
            ItemsViewModel("Pasta","This pasta will make your day",
                "If you’ve never had fresh pasta before, you’re in for a treat! Its chewy, bouncy texture and rich flavor make it so much better than the dried pasta at the store. In fact, these noodles are so good that we usually serve them really simply. They’re fantastic with marinara sauce, pesto, homemade Alfredo sauce, or olive oil and vegan Parmesan or Parmesan cheese.")
        )
        data.add(
            ItemsViewModel("Pizza","This pizza will make your day",
                "If you’ve never had fresh pasta before, you’re in for a treat! Its chewy, bouncy texture and rich flavor make it so much better than the dried pasta at the store. In fact, these noodles are so good that we usually serve them really simply. They’re fantastic with marinara sauce, pesto, homemade Alfredo sauce, or olive oil and vegan Parmesan or Parmesan cheese.")
        )
        data.add(
            ItemsViewModel("Calzone","This calzone will make your day",
                "If you’ve never had fresh pasta before, you’re in for a treat! Its chewy, bouncy texture and rich flavor make it so much better than the dried pasta at the store. In fact, these noodles are so good that we usually serve them really simply. They’re fantastic with marinara sauce, pesto, homemade Alfredo sauce, or olive oil and vegan Parmesan or Parmesan cheese.")
        )
        val adapter=CustomAdapter(data)
        recyclerview.adapter=adapter
    }

}