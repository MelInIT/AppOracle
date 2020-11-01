package com.example.apporacle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_menu.*

class MenuFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        optionWord.setOnClickListener {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, WordFragment())
                ?.addToBackStack(null)
                ?.commit()

        }

        optionOracle.setOnClickListener {
            fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragmentContainer, OracleFragment())
                    ?.addToBackStack(null)
                    ?.commit()


        }

    }
}