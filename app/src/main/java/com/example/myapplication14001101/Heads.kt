package com.example.myapplication14001101

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Heads.newInstance] factory method to
 * create an instance of this fragment.
 */
class Heads : Fragment(R.layout.fragment_heads) {

    var heads = arrayOf(R.drawable.head1,R.drawable.head2,R.drawable.head3,
        R.drawable.head4,R.drawable.head5,R.drawable.head6,
        R.drawable.head7,R.drawable.head8,R.drawable.head9,
        R.drawable.head10,R.drawable.head11,R.drawable.head12,
    )
    private var i=0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myhead = view.findViewById<ImageView>(R.id.idhead)
        myhead?.setOnClickListener{
                it as ImageView
                i++
                if (i==12)
                    i=0
                it.setImageResource(heads[i])
            }
        }
    }

