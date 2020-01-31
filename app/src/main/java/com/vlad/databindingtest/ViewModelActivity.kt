package com.vlad.databindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.vlad.databindingtest.handlers.VMScreenHandler

class ViewModelActivity : AppCompatActivity(), VMScreenHandler {

    var savedData = "oops, no text saved here"

    val inputText : EditText by lazy {findViewById<EditText>(R.id.txt_input)}

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

    }

    override fun onSavePressed(text: String) {

        saveText(text)

    }

    override fun onRestorePressed() {

        restoreText()

    }

    fun saveText (text: String){

        savedData = text
        Utils.toastAndLog("text saved", this)

    }

    fun restoreText(){

        inputText.setText(savedData)
        Utils.toastAndLog("text restored", this)

    }



}
