package com.example.nbc_standard_multi_view

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nbc_standard_multi_view.Util.moneyFormat
import com.example.nbc_standard_multi_view.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    private val dataModel by lazy {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("CardData", DataModel::class.java)
        } else {
            intent.getParcelableExtra("CardData")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        dataModel?.let {
            binding.tvDetailName.text = it.name
            binding.tvDetailCardNumber.text = it.cardNumber
            binding.tvDetailCardPeriod.text = it.period
            binding.tvDetailCardMoney.text = moneyFormat(it.money)
        }
    }
}