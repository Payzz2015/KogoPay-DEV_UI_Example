package com.teerapat.kogopay_devuiexample

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.teerapat.kogopay_devuiexample.databinding.ActivityMainBinding
import com.teerapat.kogopay_devuiexample.fragments.AccountFragment
import com.teerapat.kogopay_devuiexample.fragments.HomeFragment
import com.teerapat.kogopay_devuiexample.fragments.MoreFragment
import com.teerapat.kogopay_devuiexample.fragments.ScanFragment

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val accountFragment = AccountFragment()
    private val scanFragment = ScanFragment()
    private val moreFragment = MoreFragment()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(homeFragment)

        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> replaceFragment(homeFragment)
                R.id.ic_account -> replaceFragment(accountFragment)
                R.id.ic_scan -> replaceFragment(scanFragment)
                R.id.ic_more -> replaceFragment(moreFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transition = supportFragmentManager.beginTransaction()
            transition.replace(R.id.fragment_container, fragment)
            transition.commit()
        }
    }
}