package com.example.nbc_standard_multi_view.Util

import com.example.nbc_standard_multi_view.DataModel
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat

val dummyItems = mutableListOf<DataModel>()

fun dummyData() {

    dummyItems.add(
        DataModel(
            "Anderson",
            "2423 3581 9503 2412",
            "21 / 24",
            3100.30F,
            1
        )
    )

    dummyItems.add(
        DataModel(
            "Anderson",
            "2423 3581 9503 2412",
            "12 / 25",
            3100.30F,
            2
        )
    )

    dummyItems.add(
        DataModel(
            "Anderson",
            "2423 3581 9503 2412",
            "21 / 24",
            3100.30F,
            3
        )
    )
}

fun moneyFormat(formatItem: Float): String {
    val bigDecimal = BigDecimal(formatItem.toString())
    val decimalFormat = DecimalFormat("$#,##0.00")
    return decimalFormat.format(bigDecimal)
}

fun mainMoneyFormat(formatItem: Float) : String {
    val bigDecimal = BigDecimal(formatItem.toString())
    val decimalFormat = DecimalFormat("$#,##,##0.00")
    return decimalFormat.format(bigDecimal)
}