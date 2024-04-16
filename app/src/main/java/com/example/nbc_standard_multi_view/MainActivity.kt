package com.example.nbc_standard_multi_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nbc_standard_multi_view.Util.dummyData
import com.example.nbc_standard_multi_view.Util.dummyItems
import com.example.nbc_standard_multi_view.Util.mainMoneyFormat
import com.example.nbc_standard_multi_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        dummyData()

        binding.rvMain.adapter = CardAdapter(dummyItems)
        binding.rvMain.layoutManager = LinearLayoutManager(this)

        binding.tvMainMoney.text = mainMoneyFormat(285856.20F)
    }
}