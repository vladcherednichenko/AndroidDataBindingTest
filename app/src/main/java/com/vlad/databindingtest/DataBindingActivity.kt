package com.vlad.databindingtest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.vlad.databindingtest.databinding.ActivityDatabindingBinding
import com.vlad.databindingtest.handlers.CarScreenHandler
import com.vlad.databindingtest.models.Car

import kotlin.random.Random

class DataBindingActivity : AppCompatActivity(),
    CarScreenHandler {

    private var text = "halo, text to bind"

    private val muscleCarList = arrayListOf(

        Car(1, "Chevrolet Camaro", 12000, 23000, "214hg432hjg23"),
        Car(2, "Dodge Charger", 16000, 50000, "98dfsfhdjsfhkw"),
        Car(3, "Ford Mustang", 17800, 7000, "37bbdsfj09238fh"),
        Car(4, "Pontiac", 15000, 12000, "0921bllsAS")

    )

    private val carScreenBinding : ActivityDatabindingBinding by lazy{DataBindingUtil.setContentView<ActivityDatabindingBinding>(this, R.layout.activity_databinding)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        openRandomCar()
        carScreenBinding.handler = this

    }

    override fun onRandomPressed(view: View) {

        openRandomCar()

    }

    override fun onFindPressed(car: Car) {

        toastAndLog("find pressed", this)

    }

    override fun onShowWin(check: Boolean, car: Car) {

        toastAndLog("show win $check", this)

    }


    private fun openRandomCar(){

        carScreenBinding.carModel = muscleCarList.get(Random.nextInt((muscleCarList.size)))

    }

    // UTILS
    private fun toastAndLog (text: String, context: Context){

            Toast.makeText(context, text, Toast.LENGTH_LONG).show()
            Log.d("Custom log", text)

    }



}
