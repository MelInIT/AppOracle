package com.example.apporacle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_oracle.*

class OracleFragment : BaseFragment() {

    override val layoutId: Int
        get() = R.layout.fragment_oracle

    private val possibleRespones = listOf(
            "Yes",
            "No",
            "Maybe",
            "It depends for you"

    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        ask.setOnClickListener {
            oracleResponse.text = possibleRespones.random()
        }
    }
}