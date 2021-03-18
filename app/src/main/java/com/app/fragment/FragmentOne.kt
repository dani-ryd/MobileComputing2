package com.app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentOne : Fragment() {

    private lateinit var goToButton: Button

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_blank, container, false)
        goToButton = rootView.findViewById(R.id.gotoButton)

        goToButton.setOnClickListener{
            val fm = fragmentManager

            fm!!.beginTransaction().replace(R.id.fragmentContainer,FragmentTwo(),"FragmentTwo").addToBackStack(null).commit()
            //fm!!.beginTransaction().remove(FragmentOne()).commit()

        }

        return rootView
    }
}