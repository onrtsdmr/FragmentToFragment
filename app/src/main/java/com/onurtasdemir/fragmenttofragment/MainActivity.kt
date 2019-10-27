package com.onurtasdemir.fragmenttofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FirstFragmentListener {


    private var firstFragment : FirstFragment? = null
    private var secondFragment : SecondFragment?  = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstFragment = FirstFragment()
        secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.firstContainer,firstFragment!!)
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.secondContainer,secondFragment!!)
            .commit()


    }
    override fun messageFromFirst(message: String) {
        secondFragment?.setMessage(message)
    }

}
