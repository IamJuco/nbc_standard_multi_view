package com.example.nbc_standard_multi_view.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nbc_standard_multi_view.data.dummyData
import com.example.nbc_standard_multi_view.data.dummyItems
import com.example.nbc_standard_multi_view.data.mainMoneyFormat
import com.example.nbc_standard_multi_view.databinding.ActivityMainBinding
import com.example.nbc_standard_multi_view.ui.CardAdapter

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var cardAdapter : CardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        dummyData()
        setUpRecyclerView()

        binding.tvMainMoney.text = mainMoneyFormat(285856.20F)
    }

    private fun setUpRecyclerView() {
        cardAdapter = CardAdapter(dummyItems)
        binding.rvMain.adapter = cardAdapter
        binding.rvMain.layoutManager = LinearLayoutManager(this)
    }
}