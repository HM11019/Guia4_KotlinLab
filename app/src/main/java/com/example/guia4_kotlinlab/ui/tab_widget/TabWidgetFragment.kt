package com.example.guia4_kotlinlab.ui.tab_widget

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.guia4_kotlinlab.R

class TabWidgetFragment : Fragment() {

    companion object {
        fun newInstance() = TabWidgetFragment()
    }

    private lateinit var viewModel: TabWidgetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tab_widget_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TabWidgetViewModel::class.java)
        // TODO: Use the ViewModel
    }

}