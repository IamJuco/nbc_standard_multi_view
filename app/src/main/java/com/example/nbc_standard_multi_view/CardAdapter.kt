package com.example.nbc_standard_multi_view

import android.content.Intent
import android.view.LayoutInflater.*
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nbc_standard_multi_view.util.MULTI_TYPE_1
import com.example.nbc_standard_multi_view.util.MULTI_TYPE_2
import com.example.nbc_standard_multi_view.util.MULTI_TYPE_3
import com.example.nbc_standard_multi_view.util.moneyFormat
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

            MULTI_TYPE_3 -> {
                val binding = RvThirdItemBinding.inflate(from(parent.context), parent, false)
                MultiViewHolder3(binding)
            }
            else -> throw Exception("Type Error")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(items[position].type) {
            MULTI_TYPE_1 -> {
                (holder as MultiViewHolder1).bind(items[position])
                holder.setIsRecyclable(false)
            }
            MULTI_TYPE_2 -> {
                (holder as MultiViewHolder2).bind(items[position])
                holder.setIsRecyclable(false)
            }
            MULTI_TYPE_3 -> {
                (holder as MultiViewHolder3).bind(items[position])
                holder.setIsRecyclable(false)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MultiViewHolder1(private val binding: RvFirstItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item: DataModel) {
            val context = binding.root.context

            binding.apply {
                tvName.text = item.name
                tvCardNumber.text = item.cardNumber
                tvCardPeriod.text = item.period
                tvCardMoney.text = moneyFormat(item.money)

                cvFirst.setOnClickListener {
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra("CardData", item)
                    context.startActivity(intent)
                }
            }
        }
    }
    class MultiViewHolder2(private val binding: RvSecondItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: DataModel) {
            val context = binding.root.context

            binding.apply {
                tvName.text = item.name
                tvCardNumber.text = item.cardNumber
                tvCardPeriod.text = item.period
                tvCardMoney.text = moneyFormat(item.money)

                cvSecond.setOnClickListener {
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra("CardData", item)
                    context.startActivity(intent)
                }
            }
        }
    }
    class MultiViewHolder3(private val binding: RvThirdItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: DataModel) {
            val context = binding.root.context

            binding.apply {
                tvName.text = item.name
                tvCardNumber.text = item.cardNumber
                tvCardPeriod.text = item.period
                tvCardMoney.text = moneyFormat(item.money)

                cvThird.setOnClickListener {
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra("CardData", item)
                    context.startActivity(intent)
                }
            }
        }
    }
}