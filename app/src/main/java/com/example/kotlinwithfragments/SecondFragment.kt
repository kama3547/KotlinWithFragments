package com.example.kotlinwithfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinwithfragments.databinding.FragmentSecondBinding

class SecondFragment: Fragment(R.layout.fragment_second) {
    private var date: String? = ""
    private var fragmentSecondBinding: FragmentSecondBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentSecondBinding.inflate(inflater,container,false)
        fragmentSecondBinding = binding
        date = arguments?.getString("date")
        binding.textView.text = date
        return binding.root
        }
    }

