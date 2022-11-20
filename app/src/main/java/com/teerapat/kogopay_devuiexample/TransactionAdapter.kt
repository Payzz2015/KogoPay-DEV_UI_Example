package com.teerapat.kogopay_devuiexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_transaction.view.*

class TransactionAdapter (
    var lists: List<Transaction>
    ): RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {

    inner class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_transaction, parent, false)
        return TransactionViewHolder(view)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        holder.itemView.apply {
            titleList.text = lists[position].title
            costList.text = lists[position].cost
            dateList.text = lists[position].date
            timeList.text = lists[position].time

            holder.itemView.setOnClickListener{
                Toast.makeText(it.context, "${timeList.text}",Toast.LENGTH_SHORT).show()
            }
        }

    }
    override fun getItemCount(): Int {
        return lists.size
    }


}