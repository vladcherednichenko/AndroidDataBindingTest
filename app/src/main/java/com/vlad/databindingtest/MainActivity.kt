package com.vlad.databindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.vlad.databindingtest.models.Car
import com.vlad.databindingtest.databinding.ActivityMainBinding
import com.vlad.databindingtest.models.CarScreenHandler
import kotlin.random.Random

class MainActivity : AppCompatActivity(), CarScreenHandler {

    private var text = "halo, text to bind"

    private val muscleCarList = arrayListOf(

        Car(1, "Chevrolet Camaro", 12000, 23000),
        Car(2, "Dodge Charger", 16000, 50000),
        Car(3, "Ford Mustang", 17800, 7000),
        Car(4, "Pontiac", 15000, 12000)

    )

    private val carScreenBinding : ActivityMainBinding by lazy{DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        openRandomCar()

    }

    override fun onRandomPressed() {

        openRandomCar()

    }

    private fun openRandomCar(){

        carScreenBinding.carModel = muscleCarList.get(Random.nextInt((muscleCarList.size-1)))

    }



}
