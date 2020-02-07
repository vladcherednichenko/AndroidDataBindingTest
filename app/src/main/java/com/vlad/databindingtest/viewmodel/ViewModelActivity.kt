package com.vlad.databindingtest.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.vlad.databindingtest.R
import com.vlad.databindingtest.Utils
import com.vlad.databindingtest.databinding.ActivityViewModelBinding

class ViewModelActivity : AppCompatActivity(),
    VMScreenHandler {

    // Object remains in memory while activity is alive
    // remains alive when screen rotates

    private lateinit var viewModel : MyViewModel
    private val binding : ActivityViewModelBinding by lazy {

        DataBindingUtil.setContentView<ActivityViewModelBinding>(this,
            R.layout.activity_view_model
        )

    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        binding.handler = this
        binding.screenModel = viewModel.bindingModel
        binding.invalidateAll()


    }

    override fun onSavePressed() {

        saveText(binding.txtInput.text.toString())

    }

    override fun onRestorePressed() {

        restoreText()

    }

    private fun saveText (text: String){

        viewModel.bindingModel.savedText = text
        Utils.toastAndLog("text saved", this)

    }

    private fun restoreText(){

        binding.invalidateAll()
        Utils.toastAndLog("text restored", this)

    }



}
