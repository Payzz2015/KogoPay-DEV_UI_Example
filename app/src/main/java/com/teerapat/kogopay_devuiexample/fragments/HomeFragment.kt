package com.teerapat.kogopay_devuiexample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.teerapat.kogopay_devuiexample.R
import com.teerapat.kogopay_devuiexample.Transaction
import com.teerapat.kogopay_devuiexample.TransactionAdapter
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

        val adapter = TransactionAdapter(transactionList)
        transactionListRV.adapter = adapter
        transactionListRV.layoutManager = LinearLayoutManager(this.context)

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

        btn_item1.setOnClickListener{
            Toast.makeText(this.context, "Add money", Toast.LENGTH_SHORT).show()
        }

        btn_item2.setOnClickListener{
            Toast.makeText(this.context, "Payment", Toast.LENGTH_SHORT).show()
        }

        btn_item3.setOnClickListener{
            Toast.makeText(this.context, "Request statement", Toast.LENGTH_SHORT).show()
        }

        btn_item4.setOnClickListener{
            Toast.makeText(this.context, "Favorite", Toast.LENGTH_SHORT).show()
        }

        btn_item5.setOnClickListener{
            Toast.makeText(this.context, "History", Toast.LENGTH_SHORT).show()
        }

        btn_item6.setOnClickListener{
            Toast.makeText(this.context, "button text", Toast.LENGTH_SHORT).show()
        }

        btn_item7.setOnClickListener{
            Toast.makeText(this.context, "button text", Toast.LENGTH_SHORT).show()
        }

        btn_item8.setOnClickListener{
            Toast.makeText(this.context, "More services", Toast.LENGTH_SHORT).show()
        }

    }

}