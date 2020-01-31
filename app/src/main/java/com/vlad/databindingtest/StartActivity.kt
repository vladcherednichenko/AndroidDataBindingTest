package com.vlad.databindingtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        findViewById<Button>(R.id.btn_start_databinding).setOnClickListener{startDataBindingActivity()}
        findViewById<Button>(R.id.btn_start_viewmodel).setOnClickListener{startViewModelActivity()}

    }


    fun startDataBindingActivity(){

        val intent = Intent(this, DataBindingActivity::class.java)
        startActivity(intent)

    }

    fun startViewModelActivity(){

        val intent = Intent(this, ViewModelActivity::class.java)
        startActivity(intent)

    }

}
