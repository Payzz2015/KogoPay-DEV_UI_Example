package com.teerapat.kogopay_devuiexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_tutorial.*

class TutorialActivity : AppCompatActivity(){

    private lateinit var tutorialList: List<Tutorial>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        tutorialList = listOf(
            Tutorial(R.drawable.tuen01_v2),
            Tutorial(R.drawable.tuen02_v2),
            Tutorial(R.drawable.tuen03_v2),
            Tutorial(R.drawable.tuen04_v2),
            Tutorial(R.drawable.tuen05_v2),
            Tutorial(R.drawable.tuen06_v2),
        )

        val adapterA = TutorialAdapter(tutorialList)
        view_pager.adapter = adapterA
        view_pager.layoutDirection = ViewPager2.LAYOUT_DIRECTION_LTR

        TabLayoutMediator(tabDots, view_pager, { tab, position ->
        }).attach()
        TabLayoutMediator(tabDots1, view_pager, { tab, position ->
        }).attach()

        view_pager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if(position == 0){
                    view_pager.currentItem = 0
                    im_back.isGone = true
                    tv_title.isGone = true
                    tv_or_skip.isGone = true
                }
                else if(position == 4 || position == 3){
                    tv_title.setText("Before you start!")
                    btn_get_start.isGone = true
                    im_back.isGone = true
                    tv_below_01.isGone = true
                    tv_below_02.isGone = true
                    tv_below_03.isGone = true
                    im_back01.isVisible = true
                    tv_title.isVisible = true
                    tv_title_02.isVisible = true
                    tv_or_skip.isVisible = true
                    tabDots.isInvisible = true
                    tabDots1.isVisible = true
                }
                else if (position != 5){
                    im_back.isVisible = true
                    tv_or_skip.isGone = true
                    tv_below_01.isVisible = true
                    tv_below_02.isVisible = true
                    tv_below_03.isVisible = true
                    im_back01.isGone = true
                    tv_title.isGone = true
                    tv_title_02.isGone = true
                    btn_get_start.isGone = true
                    tabDots.isVisible = true
                    tabDots1.isInvisible = true
                }
                else if (position == 5){
                    tv_title.setText("That’s all, folks!")
                    tv_title_02.isGone = true
                    tv_or_skip.isGone = true
                    im_back.isGone = true
                    tv_below_01.isGone = true
                    tv_below_02.isGone = true
                    tv_below_03.isGone = true
                    im_back01.isVisible = true
                    tv_title.isVisible = true
                    tv_title_02.isGone = true
                    btn_get_start.isVisible = true
                    tabDots.isInvisible = true
                    tabDots1.isInvisible = true
                }else{}
            }
        })

        im_back.setOnClickListener {
            view_pager.currentItem = view_pager.currentItem - 1
        }
        im_back01.setOnClickListener {
            view_pager.currentItem = view_pager.currentItem - 1
        }

        tv_below_03.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        tv_or_skip.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btn_get_start.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        tv_or_skip.paint?.isUnderlineText = true
        tv_below_03.paint?.isUnderlineText = true

    }
}