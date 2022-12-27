package com.teerapat.kogopay_devuiexample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.teerapat.kogopay_devuiexample.*
import kotlinx.android.synthetic.main.activity_tutorial.*
import kotlinx.android.synthetic.main.fragment_account.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.iconHide
import kotlinx.android.synthetic.main.fragment_home.iconNotification
import kotlinx.android.synthetic.main.fragment_home.valueHeader


class AccountFragment : Fragment() {

    private lateinit var coinList: List<Coin>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        coinList = mutableListOf(
            Coin(R.drawable.ic_icon24,"KOGO Coin","KOGO","£28,727.00","1.46%"),
            Coin(R.drawable.ic_icon24,"KOGO Coin 1","KOGO 1","£28,000.00","1.30%"),
            Coin(R.drawable.ic_icon24,"KOGO Coin 2","KOGO 2","£20,000.00","1.15%"),
            Coin(R.drawable.ic_icon24,"KOGO Coin 3","KOGO 3","£15,000.00","1.00%"),
            Coin(R.drawable.ic_icon24,"KOGO Coin 4","KOGO 4","£10,000.00","0.46%"),
        )

        val adapterCoin = CoinAdapter(coinList)
        view_coin.adapter = adapterCoin

        TabLayoutMediator(tabCoin, view_coin, { tab, position ->
        }).attach()

        var newsList = listOf(
            News("KOGO Coin air drop", R.drawable.news_image_1),
            News("Lorem ipsum dolor sit amet, consectetur adipiscin.", R.drawable.news_image_2),
            News("Lorem ipsum dolor sit amet, consectetur adipiscin.", R.drawable.news_image_3)
        )

        val adapter = NewsAdapter(newsList)
        newsListRV.adapter = adapter
        newsListRV.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

        iconNotification.setOnClickListener{
            Toast.makeText(this.context, "Notification", Toast.LENGTH_SHORT).show()
        }

        iconHide.setOnClickListener{
            if (valueHeader.isVisible){
                valueHeader.visibility = View.INVISIBLE
                iconHide.setBackgroundResource(R.drawable.ic_show)
            }
            else{
                valueHeader.visibility = View.VISIBLE
                iconHide.setBackgroundResource(R.drawable.ic_hide)
            }

        }

        newsAll.setOnClickListener {
            Toast.makeText(this.context, "ทั้งหมด", Toast.LENGTH_SHORT).show()
        }

        var shortcutList1 = mutableListOf(
            Shortcut("Add money", R.drawable.ic_addmoney),
            Shortcut("Payment", R.drawable.ic_payment),
            Shortcut("Request\nstatement", R.drawable.ic_reqstate),
            Shortcut("Favorite", R.drawable.ic_fav),

            Shortcut("History", R.drawable.ic_history),
            Shortcut("button text", R.drawable.ic_addmoney),
            Shortcut("button text", R.drawable.ic_addmoney),
            Shortcut("More\nservices", R.drawable.ic_moreservices),

            Shortcut("เติมเงิน", R.drawable.ic_topup),
            Shortcut("ส่งเงิน", R.drawable.ic_send),
            Shortcut("ร้องขอเงิน", R.drawable.ic_req),
            Shortcut("ที่ชื่นชอบ", R.drawable.ic_fav),

            Shortcut("ประวัติ", R.drawable.ic_history),
            Shortcut("แลกเปลี่ยน", R.drawable.ic_exchange),
            Shortcut("อัตราแลกเปลี่ยน", R.drawable.ic_exchangerate),
            Shortcut("บริการอื่นๆ", R.drawable.ic_moreservices),
        )

        val adapter1 = ShortcutAdapter(shortcutList1)
        shortcutListRV3.adapter = adapter1
        shortcutListRV3.layoutManager = GridLayoutManager(this.context, 2,LinearLayoutManager.HORIZONTAL, false)

    }

}