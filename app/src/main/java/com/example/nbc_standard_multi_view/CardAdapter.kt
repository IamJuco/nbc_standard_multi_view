package com.example.nbc_standard_multi_view

import android.view.LayoutInflater.*
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nbc_standard_multi_view.Util.MULTI_TYPE_1
import com.example.nbc_standard_multi_view.Util.MULTI_TYPE_2
import com.example.nbc_standard_multi_view.databinding.RvFirstItemBinding
import com.example.nbc_standard_multi_view.databinding.RvSecondItemBinding
import com.example.nbc_standard_multi_view.databinding.RvThirdItemBinding

class CardAdapter(private val items: MutableList<DataModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            MULTI_TYPE_1 -> {
                val binding = RvFirstItemBinding.inflate(from(parent.context), parent, false)
                MultiViewHolder1(binding)
            }

            MULTI_TYPE_2 -> {
                val binding = RvSecondItemBinding.inflate(from(parent.context), parent, false)
                MultiViewHolder2(binding)
            }

            else -> {
                val binding = RvThirdItemBinding.inflate(from(parent.context), parent, false)
                MultiViewHolder3(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is MultiViewHolder1 -> holder.bind(items[position])
            is MultiViewHolder2 -> holder.bind(items[position])
            is MultiViewHolder3 -> holder.bind(items[position])
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    inner class MultiViewHolder1(private val binding: RvFirstItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: DataModel) {
            binding.tvName.text = item.name
            binding.tvCardNumber.text = item.number.toString()
            binding.tvCardPeriod.text = item.period.toString()
            binding.tvCardMoney.text = item.money.toString()

            binding.cvFirst.setOnClickListener {

            }
        }
    }
    inner class MultiViewHolder2(private val binding: RvSecondItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: DataModel) {
            binding.tvName.text = item.name
            binding.tvCardNumber.text = item.number.toString()
            binding.tvCardPeriod.text = item.period.toString()
            binding.tvCardMoney.text = item.money.toString()

            binding.cvSecond.setOnClickListener {

            }

        }

    }
    inner class MultiViewHolder3(private val binding: RvThirdItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: DataModel) {
            binding.tvName.text = item.name
            binding.tvCardNumber.text = item.number.toString()
            binding.tvCardPeriod.text = item.period.toString()
            binding.tvCardMoney.text = item.money.toString()

            binding.cvThird.setOnClickListener {

            }

        }

    }
}