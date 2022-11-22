package com.teerapat.kogopay_devuiexample
import androidx.annotation.DrawableRes

data class Shortcut(
    val title: String,
    @DrawableRes
    var imageDrawableRes: Int = R.drawable.ic_addmoney
)