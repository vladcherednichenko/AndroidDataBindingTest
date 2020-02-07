package com.vlad.databindingtest.navigation

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.vlad.databindingtest.R

class Fragment1 : Fragment(){

    lateinit var listener: Fragment1Listener

    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(uri: Uri)
    }

    interface Fragment1Listener{

        fun onFragment1NextPressed()
        fun onFragment1BackPlessed()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_fragment1, container, false)

        var model = ViewModelProviders.of(this).get((NavigationViewModel::class.java)).presenter

        

        view.findViewById<Button>(R.id.btn_next).setOnClickListener {  }

        return view

    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onDetach() {
        super.onDetach()

    }

}