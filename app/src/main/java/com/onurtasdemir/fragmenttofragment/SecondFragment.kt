package com.onurtasdemir.fragmenttofragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class SecondFragment : Fragment(){
    private lateinit var textView: TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_second,container,false)

        textView = view.findViewById(R.id.secondFragmentTv)

        return view
    }
    fun setMessage(message: String){
        textView.text = message
    }
}