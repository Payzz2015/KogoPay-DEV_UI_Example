package com.teerapat.kogopay_devuiexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_page.view.*


class TutorialAdapter(
    private val tutorialList: List<Tutorial>
): RecyclerView.Adapter<TutorialAdapter.TutorialHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TutorialAdapter.TutorialHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false)
        return TutorialHolder(view)
    }

    override fun onBindViewHolder(holder: TutorialHolder, position: Int) {
        holder.bind(tutorialList[position])
    }

    override fun getItemCount(): Int {
        return tutorialList.size
    }

    inner class TutorialHolder(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        private val backgroundImg = itemView.img_view1

        fun bind(tutorial: Tutorial) = with(itemView){
            backgroundImg.setImageResource(tutorial.imgBG)
        }
    }
   /* var toturailArray = arrayListOf<IntArray>(
        intArrayOf(android.R.color.background_light, R.drawable.tuen01_v2),
        intArrayOf(android.R.color.holo_blue_light, R.drawable.tuen02_v2),
        intArrayOf(android.R.color.darker_gray, R.drawable.tuen03_v2),
        intArrayOf(android.R.color.holo_green_dark, R.drawable.tuen04_v2),
        intArrayOf(android.R.color.holo_green_dark, R.drawable.tuen05_v2),
        intArrayOf(android.R.color.holo_green_dark, R.drawable.tuen06_v2)
    )

    class TutorialHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img_view1: ImageView
        var container1: RelativeLayout

        init {
            img_view1 = itemView.findViewById(R.id.img_view1) as ImageView
            container1 = itemView.findViewById(R.id.container1) as RelativeLayout
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutorialHolder {
        return TutorialHolder(
            LayoutInflater.from(context).inflate(R.layout.item_page, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TutorialHolder, position: Int) {
        holder.img_view1.setImageResource(toturailArray[position][1])
        holder.container1.setBackgroundResource(toturailArray[position][0])
    }

    override fun getItemCount(): Int {
        return toturailArray.size
    }*/


}