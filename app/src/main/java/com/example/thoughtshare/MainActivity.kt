package com.example.thoughtshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.thoughtshare.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        initListener()
    }

    private fun initListener() {

        mBinding?.buttonLogin?.setOnClickListener {
            Toast.makeText(this,"login",Toast.LENGTH_SHORT).show()
        }

    }
}