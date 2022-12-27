package com.teerapat.kogopay_devuiexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_coin.view.*

class CoinAdapter(private val coinList: List<Coin>) : RecyclerView.Adapter<CoinAdapter.CoinHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinAdapter.CoinHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_coin, parent, false)
        view.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        return CoinHolder(view)
    }

    override fun onBindViewHolder(holder: CoinHolder, position: Int) {
        holder.bind(coinList[position])
    }

    override fun getItemCount(): Int {
        return coinList.size
    }

    inner class CoinHolder(itemView:View): RecyclerView.ViewHolder(itemView){

        private val logo = itemView.logo_coin
        private val title = itemView.title_coin
        private val coins = itemView.coin
        private val cost = itemView.cost_coin
        private val percent = itemView.percent_coin

        fun bind(coin: Coin) = with(itemView){
            logo.setImageDrawable(getResources().getDrawable(coin.logo))
            title.text = coin.title
            coins.text = coin.coin
            cost.text = coin.cost
            percent.text = coin.percent
        }
    }
}