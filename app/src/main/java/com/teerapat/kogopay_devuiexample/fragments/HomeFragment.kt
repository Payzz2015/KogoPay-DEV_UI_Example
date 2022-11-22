package com.teerapat.kogopay_devuiexample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.teerapat.kogopay_devuiexample.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var transactionList = mutableListOf(
                Transaction("Transfer","- 20.00 GBP","14 FEB 2022","10:35 am"),
                Transaction("Transfer","- 20.00 GBP","14 FEB 2022","10:00 am"),
                Transaction("Transfer","- 20.00 GBP","14 FEB 2022","09:50 am"),
                Transaction("Transfer","- 20.00 GBP","14 FEB 2022","09:40 am"),
                Transaction("Transfer","- 20.00 GBP","14 FEB 2022","09:00 am"),
                Transaction("Transfer","- 20.00 GBP","13 FEB 2022","09:00 am"),
                Transaction("Transfer","- 20.00 GBP","13 FEB 2022","09:00 am"),
                Transaction("Transfer","- 20.00 GBP","13 FEB 2022","09:00 am"),
            )

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

        val adapter = TransactionAdapter(transactionList)
        transactionListRV.adapter = adapter
        transactionListRV.layoutManager = LinearLayoutManager(this.context)


        val adapter1 = ShortcutAdapter(shortcutList1)
        shortcutListRV1.adapter = adapter1
        shortcutListRV1.layoutManager = GridLayoutManager(this.context, 2,LinearLayoutManager.HORIZONTAL, false)


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

        transactionAll.setOnClickListener {
            Toast.makeText(this.context, "See all", Toast.LENGTH_SHORT).show()
        }
    }

}