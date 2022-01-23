package com.example.myapplication14001101

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ImageView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [bodies.newInstance] factory method to
 * create an instance of this fragment.
 */
class Bodies : Fragment(R.layout.fragment_bodies) {
    var bodies = arrayOf(R.drawable.body1,R.drawable.body2,R.drawable.body3,
        R.drawable.body4,R.drawable.body5,R.drawable.body6,
        R.drawable.body7,R.drawable.body8,R.drawable.body9,
        R.drawable.body10,R.drawable.body11,R.drawable.body12,
    )
    private var i=0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mybody = view.findViewById<ImageView>(R.id.idbody)
        mybody?.setOnClickListener{
            it as ImageView
            i++
            if (i==12)
                i=0
            it.setImageResource(bodies[i])
        }
    }
}