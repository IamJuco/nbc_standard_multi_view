package com.example.nbc_standard_multi_view.data

import com.example.nbc_standard_multi_view.model.DataModel

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