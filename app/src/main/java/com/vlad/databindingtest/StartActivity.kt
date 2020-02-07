package com.vlad.databindingtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.vlad.databindingtest.databinding.ActivityStartBinding
import com.vlad.databindingtest.databinding.DataBindingActivity
import com.vlad.databindingtest.navigation.NavigationActivity
import com.vlad.databindingtest.viewmodel.ViewModelActivity

class StartActivity : AppCompatActivity(), StartActivityHandler{

    lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_start)

        binding.handler = this

    }

    override fun onNavigationPressed() {

        val intent = Intent(this, NavigationActivity::class.java)
        startActivity(intent)

    }

    override fun onViewModelPressed() {

        val intent = Intent(this, ViewModelActivity::class.java)
        startActivity(intent)

    }

    override fun onDatabindingPressed() {

        val intent = Intent(this, DataBindingActivity::class.java)
        startActivity(intent)

    }

}
