package com.example.thoughtshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.thoughtshare.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var mBinding :ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        initListener()
    }

    private fun initListener() {

        mBinding?.buttonSignup?.setOnClickListener {
            Toast.makeText(this,"signup", Toast.LENGTH_SHORT).show()
        }

    }
}