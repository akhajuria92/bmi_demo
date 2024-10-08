package com.app.bmicalculator.view.activity

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.app.bmicalculator.R
import com.app.bmicalculator.base.BaseActivity
import com.app.bmicalculator.databinding.ActivityBmiMainBinding
import com.app.bmicalculator.utils.extensions.replaceFragmentWithoutStack
import com.app.bmicalculator.view.fragmets.CalculateBmiFragment
import com.app.bmicalculator.view.fragmets.HomeFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BmiMainActivity : BaseActivity() {

    private var binding: ActivityBmiMainBinding? = null
    override fun showTitleBar() = true


    private val onBackPressedCallBack = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            val fragment = supportFragmentManager.findFragmentById(R.id.frameContainerFL)

            when {
                supportFragmentManager.backStackEntryCount > 0 -> {
                    supportFragmentManager.popBackStack()
                }

                else -> {
                    finish()
                }
            }
        }

    }

    private fun gotoHomeScreen() {
        replaceFragmentWithoutStack(CalculateBmiFragment())

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_bmi_main)
        ViewCompat.setOnApplyWindowInsetsListener(binding!!.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        hideKeyBoard(this.currentFocus)
        updateStatusBarColor(R.color.colorPrimary, false)
        initUI()
    }

    private fun initUI() {
        onBackPressedDispatcher.addCallback(this, onBackPressedCallBack)
        gotoHomeScreen()

    }
}