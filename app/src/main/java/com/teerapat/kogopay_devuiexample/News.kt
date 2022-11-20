package com.teerapat.kogopay_devuiexample

import androidx.annotation.DrawableRes

data class News(
    val title: String,
    @DrawableRes
    var imageDrawableRes: Int = R.drawable.news_image_1
)