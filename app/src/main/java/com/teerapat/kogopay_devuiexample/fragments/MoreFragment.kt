package com.teerapat.kogopay_devuiexample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.teerapat.kogopay_devuiexample.R
import kotlinx.android.synthetic.main.fragment_more.*


class MoreFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_more, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        iconNotification.setOnClickListener {
            Toast.makeText(this.context, "Notification", Toast.LENGTH_SHORT).show()
        }

        profileDetail.setOnClickListener {
            Toast.makeText(this.context, "Profile Page", Toast.LENGTH_SHORT).show()
        }

        btn_verify.setOnClickListener {
            Toast.makeText(this.context, "VERIFY", Toast.LENGTH_SHORT).show()
        }

        languageView.setOnClickListener {
            Toast.makeText(this.context, "Languages PAGE", Toast.LENGTH_SHORT).show()
        }

        pinView.setOnClickListener {
            Toast.makeText(this.context, "PIN PAGE", Toast.LENGTH_SHORT).show()
        }

        btn_face.setOnClickListener {
            if(btn_face.isChecked){
                Toast.makeText(this.context, "Fingerprint & FaceID ON", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this.context, "Fingerprint & FaceID OFF", Toast.LENGTH_SHORT).show()
            }
        }

        aboutView.setOnClickListener {
            Toast.makeText(this.context, "About us PAGE", Toast.LENGTH_SHORT).show()
        }

        termView.setOnClickListener {
            Toast.makeText(this.context, "Terms & Conditions PAGE", Toast.LENGTH_SHORT).show()
        }

        faqView.setOnClickListener {
            Toast.makeText(this.context, "FAQ PAGE", Toast.LENGTH_SHORT).show()
        }

        logoutView.setOnClickListener {
            Toast.makeText(this.context, "Logout", Toast.LENGTH_SHORT).show()
        }
    }

}