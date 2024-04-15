package com.example.nbc_standard_multi_view.Util

import com.example.nbc_standard_multi_view.DataModel

val dummyItems = mutableListOf<DataModel>()

fun dummyData() {

    dummyItems.add(
        DataModel(
            "Anderson",
            "2423 3581 9503 2412",
            21_24,
            3100.30F,
            1
        )
    )

    dummyItems.add(
        DataModel(
            "Anderson",
            "2423 3581 9503 2412",
            12_25,
            3100.30F,
            2
        )
    )

    dummyItems.add(
        DataModel(
            "Anderson",
            "2423 3581 9503 2412",
            21_24,
            3100.30F,
            3
        )
    )
}