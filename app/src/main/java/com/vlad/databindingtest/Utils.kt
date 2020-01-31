package com.vlad.databindingtest

import android.content.Context
import android.util.Log
import android.widget.Toast

object Utils {

    fun toastAndLog (text: String, context: Context) {

        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
        Log.d("Custom log", text)

    }


}