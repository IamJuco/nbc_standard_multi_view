package com.example.nbc_standard_multi_view.data

import java.math.BigDecimal
import java.text.DecimalFormat

fun moneyFormat(formatItem: Float): String {
    val bigDecimal = BigDecimal(formatItem.toString())
    val decimalFormat = DecimalFormat("$#,##0.00")
    return decimalFormat.format(bigDecimal)
}

fun mainMoneyFormat(formatItem: Float): String {
    val bigDecimal = BigDecimal(formatItem.toString())
    val decimalFormat = DecimalFormat("$#,##,##0.00")
    return decimalFormat.format(bigDecimal)
}