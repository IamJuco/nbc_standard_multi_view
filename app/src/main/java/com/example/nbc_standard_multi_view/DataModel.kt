package com.example.nbc_standard_multi_view

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataModel(
    val name: String, val cardNumber: String, val period: String, val money: Float, val type: Int
) : Parcelable