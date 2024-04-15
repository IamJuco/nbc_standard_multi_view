package com.example.nbc_standard_multi_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nbc_standard_multi_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val dummyItems = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvMain.adapter = CardAdapter(dummyItems)

    }
}