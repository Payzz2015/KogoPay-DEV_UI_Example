package com.teerapat.kogopay_devuiexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_shortcut.view.*
import kotlinx.android.synthetic.main.list_transaction.view.*

class ShortcutAdapter (
    var shortcuts: List<Shortcut>
): RecyclerView.Adapter<ShortcutAdapter.ShortcutViewHolder>() {

    inner class ShortcutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShortcutViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_shortcut, parent, false)
        return ShortcutViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShortcutViewHolder, position: Int) {
        holder.itemView.apply {
            shortcutText.text = shortcuts[position].title
            shortcutImage.setImageDrawable(getResources().getDrawable(shortcuts[position].imageDrawableRes))

            holder.itemView.setOnClickListener{
                Toast.makeText(it.context, "${shortcutText.text}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return shortcuts.size
    }
}