package com.teerapat.kogopay_devuiexample

data class Coin(
    var logo: Int  = R.drawable.ic_icon24,
    val title: String,
    val coin: String,
    val cost: String,
    val percent: String
)