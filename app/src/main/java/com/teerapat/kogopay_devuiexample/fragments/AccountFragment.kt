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
import kotlinx.android.synthetic.main.fragment_home.btn_item1
import kotlinx.android.synthetic.main.fragment_home.btn_item2
import kotlinx.android.synthetic.main.fragment_home.btn_item3
import kotlinx.android.synthetic.main.fragment_home.btn_item4
import kotlinx.android.synthetic.main.fragment_home.btn_item5
import kotlinx.android.synthetic.main.fragment_home.btn_item6
import kotlinx.android.synthetic.main.fragment_home.btn_item7
import kotlinx.android.synthetic.main.fragment_home.btn_item8
import kotlinx.android.synthetic.main.fragment_home.iconHide
import kotlinx.android.synthetic.main.fragment_home.iconNotification
import kotlinx.android.synthetic.main.fragment_home.transactionListRV
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


        btn_item1.setOnClickListener{
            Toast.makeText(this.context, "เติมเงิน", Toast.LENGTH_SHORT).show()
        }

        btn_item2.setOnClickListener{
            Toast.makeText(this.context, "ส่งเงิน", Toast.LENGTH_SHORT).show()
        }

        btn_item3.setOnClickListener{
            Toast.makeText(this.context, "ร้องขอเงิน", Toast.LENGTH_SHORT).show()
        }

        btn_item4.setOnClickListener{
            Toast.makeText(this.context, "ที่ชื่นชอบ", Toast.LENGTH_SHORT).show()
        }

        btn_item5.setOnClickListener{
            Toast.makeText(this.context, "ประวัติ", Toast.LENGTH_SHORT).show()
        }

        btn_item6.setOnClickListener{
            Toast.makeText(this.context, "แลกเปลี่ยน", Toast.LENGTH_SHORT).show()
        }

        btn_item7.setOnClickListener{
            Toast.makeText(this.context, "อัตราแลกเปลี่ยน", Toast.LENGTH_SHORT).show()
        }

        btn_item8.setOnClickListener{
            Toast.makeText(this.context, "บริการอื่นๆ", Toast.LENGTH_SHORT).show()
        }

    }

}