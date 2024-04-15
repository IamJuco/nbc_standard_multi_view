package com.example.nbc_standard_multi_view

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataModel (
    val name: String,
    val cardNumber: Long,
    val period: Int,
    val money: Int,
    val type: Int
) : Parcelable