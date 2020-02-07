package com.vlad.databindingtest.databinding

import android.view.View
import com.vlad.databindingtest.databinding.models.Car

interface CarScreenHandler {

    // first way to call onClick. Pass View as in OnClickListener
    fun onRandomPressed(view: View)

    fun onFindPressed(car: Car)

    fun onShowWin(check: Boolean, car: Car)

}