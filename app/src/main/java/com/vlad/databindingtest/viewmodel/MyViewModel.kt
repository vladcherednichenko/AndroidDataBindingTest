package com.vlad.databindingtest.viewmodel

import androidx.lifecycle.ViewModel
import com.vlad.databindingtest.viewmodel.models.VMScreenModel

class MyViewModel  : ViewModel() {

    var bindingModel: VMScreenModel = VMScreenModel("default text")

}