package com.teerapat.kogopay_devuiexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_image.view.*
import kotlinx.android.synthetic.main.list_transaction.view.*

class NewsAdapter (
    var news: List<News>
): RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_image, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.itemView.apply {
            imageTitle.text = news[position].title
            imageNews.setBackgroundDrawable(getResources().getDrawable(news[position].imageDrawableRes))

        }

    }
    override fun getItemCount(): Int {
        return news.size
    }


}