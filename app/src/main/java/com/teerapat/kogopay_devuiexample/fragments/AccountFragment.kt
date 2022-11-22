package com.teerapat.kogopay_devuiexample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.teerapat.kogopay_devuiexample.*
import kotlinx.android.synthetic.main.fragment_account.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.iconHide
import kotlinx.android.synthetic.main.fragment_home.iconNotification
import kotlinx.android.synthetic.main.fragment_home.valueHeader


class AccountFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var newsList = mutableListOf(
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
        )

        var shortcutList2 = mutableListOf(
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
        shortcutListRV3.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

        val adapter2 = ShortcutAdapter(shortcutList2)
        shortcutListRV4.adapter = adapter2
        shortcutListRV4.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

    }

}