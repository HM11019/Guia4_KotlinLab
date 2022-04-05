package com.example.guia4_kotlinlab.ui.check_box

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.guia4_kotlinlab.R

class CheckBoxFragment : Fragment() {

    companion object {
        fun newInstance() = CheckBoxFragment()
    }

    private lateinit var viewModel: CheckBoxViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.check_box_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CheckBoxViewModel::class.java)
        // TODO: Use the ViewModel
    }

}