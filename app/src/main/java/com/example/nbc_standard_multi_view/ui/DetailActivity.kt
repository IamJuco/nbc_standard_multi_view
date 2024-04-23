package com.example.nbc_standard_multi_view.ui

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.nbc_standard_multi_view.model.DataModel
import com.example.nbc_standard_multi_view.data.moneyFormat
import com.example.nbc_standard_multi_view.databinding.ActivityDetailBinding
import com.example.nbc_standard_multi_view.util.Constants

class DetailActivity : AppCompatActivity() {

    private val viewModel: DetailViewModel by viewModels()

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    private val dataModel by lazy {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(Constants.KEY_CARD, DataModel::class.java)
        } else {
            intent.getParcelableExtra(Constants.KEY_CARD)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel.detailData.observe(this) {
            updateUI(it)
        }
    }

    private fun updateUI(model: DataModel) {
        dataModel?.let {
            binding.tvDetailName.text = it.name
            binding.tvDetailCardNumber.text = it.cardNumber
            binding.tvDetailCardPeriod.text = it.period
            binding.tvDetailCardMoney.text = moneyFormat(it.money)
        }
    }
}