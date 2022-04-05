package com.example.guia4_kotlinlab.ui.spinner

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.guia4_kotlinlab.R

class SpinnerFragment : Fragment() {

    companion object {
        fun newInstance() = SpinnerFragment()
    }

    private lateinit var viewModel: SpinnerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.spinner_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SpinnerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}