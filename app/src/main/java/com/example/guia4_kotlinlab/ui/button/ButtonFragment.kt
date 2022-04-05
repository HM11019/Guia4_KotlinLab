package com.example.guia4_kotlinlab.ui.button

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ToggleButton
import com.example.guia4_kotlinlab.R
import com.example.guia4_kotlinlab.databinding.ButtonFragmentBinding

class ButtonFragment : Fragment() {
    private lateinit var viewModel: ButtonViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(activity ?: this).get(ButtonViewModel::class.java)
        val binding = ButtonFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.vm = viewModel
        val toggle: ToggleButton = binding.root.findViewById(R.id.toggleButton)
        toggle.setOnCheckedChangeListener { _, isChecked -> viewModel.toggle(isChecked)}
        return binding.root
    }
}