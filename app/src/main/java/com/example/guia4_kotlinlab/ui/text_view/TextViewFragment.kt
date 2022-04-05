package com.example.guia4_kotlinlab.ui.text_view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.guia4_kotlinlab.R
import com.example.guia4_kotlinlab.databinding.EditTextFragmentBinding
import com.example.guia4_kotlinlab.databinding.TextViewFragmentBinding
import com.example.guia4_kotlinlab.ui.edit_text.EditTextViewModel

class TextViewFragment : Fragment() {
    private lateinit var textViewViewModel: TextViewViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        textViewViewModel = ViewModelProvider(activity ?: this).get(TextViewViewModel::class.java)
        val binding = TextViewFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.vm = textViewViewModel
        return binding.root
    }
}

