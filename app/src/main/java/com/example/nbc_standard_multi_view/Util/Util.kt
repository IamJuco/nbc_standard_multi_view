package com.example.nbc_standard_multi_view.Util

import com.example.nbc_standard_multi_view.DataModel

val dummyItems = mutableListOf<DataModel>()

fun dummyData() {

    dummyItems.add(
        DataModel(
            "Anderson",
            2423_3581_9503_2412,
            21_24,
            3_100_30,
            1
        )
    )

    dummyItems.add(
        DataModel(
            "Anderson",
            2423_3581_9503_2412,
            12_25,
            3_100_30,
            2
        )
    )

    dummyItems.add(
        DataModel(
            "Anderson",
            2423_3581_9503_2412,
            21_24,
            3_100_30,
            3
        )
    )
}