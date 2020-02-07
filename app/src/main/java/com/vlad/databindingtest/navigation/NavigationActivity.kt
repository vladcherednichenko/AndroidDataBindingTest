package com.vlad.databindingtest.navigation

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.vlad.databindingtest.R

class NavigationActivity : AppCompatActivity(), NavigationActivityView {

    lateinit var navController : NavController
    // really weird shit
    lateinit var viewModel : NavigationViewModel


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        viewModel = ViewModelProviders.of(this).get((NavigationViewModel::class.java))
        if(viewModel.presenter ==  null) {

            viewModel.presenter = Presenter()
            viewModel.presenter

        }



    }

    override fun getActivityContext(): Context {

        return applicationContext

    }
}
