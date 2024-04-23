package com.example.nbc_standard_multi_view.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nbc_standard_multi_view.data.mainMoneyFormat
import com.example.nbc_standard_multi_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel: MainViewModel by viewModels()

    private lateinit var cardAdapter : CardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setUpRecyclerView()
        setUpObserver()

        binding.tvMainMoney.text = mainMoneyFormat(285856.20F)
    }

    private fun setUpRecyclerView() {
        cardAdapter = CardAdapter(emptyList())
        binding.rvMain.adapter = cardAdapter
        binding.rvMain.layoutManager = LinearLayoutManager(this)
    }

    private fun setUpObserver() {
        viewModel.mainData.observe(this) {
            cardAdapter.updateData(it)
        }
    }
}