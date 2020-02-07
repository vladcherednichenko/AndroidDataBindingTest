package com.vlad.databindingtest.navigation

import com.vlad.databindingtest.Utils

class Presenter (var view: NavigationActivityView) :
    Fragment1.Fragment1Listener,
    Fragment2.Fragment2Listener,
    Fragment3.Fragment3Listener{



    // Fragment 1
    override fun onFragment1NextPressed() {

        Utils.toastAndLog("next", view.getActivityContext())

    }

    override fun onFragment1BackPlessed() {

        Utils.toastAndLog("back", view.getActivityContext())

    }

    // Fragment 2
    override fun onFragment2NextPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragment2BackPlessed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // Fragment 3
    override fun onFragment3NextPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragment3BackPlessed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}