package com.example.myapplication14001101

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Legs.newInstance] factory method to
 * create an instance of this fragment.
 */
class Legs : Fragment(R.layout.fragment_legs) {

    var legs = arrayOf(R.drawable.legs1,R.drawable.legs2,R.drawable.legs3,
        R.drawable.legs4,R.drawable.legs5,R.drawable.legs6,
        R.drawable.legs7,R.drawable.legs8,R.drawable.legs9,
        R.drawable.legs10,R.drawable.legs11,R.drawable.legs12,
    )
    private var i=0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myLegs = view.findViewById<ImageView>(R.id.idleg)
        myLegs?.setOnClickListener{
            it as ImageView
            i++
            if (i==12)
                i=0
            it.setImageResource(legs[i])
        }
    }

}