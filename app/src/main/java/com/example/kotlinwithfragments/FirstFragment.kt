package com.example.kotlinwithfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kotlinwithfragments.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    private lateinit var comm: Communicator
    private var fragmentFirstBinding: FragmentFirstBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentFirstBinding.inflate(inflater,container,false)
        fragmentFirstBinding = binding
        comm = requireActivity() as Communicator
        binding.btnB.setOnClickListener {
            if (binding.editTxt.text.trim().toString().isEmpty()
            ) {
                Toast.makeText(requireContext(), "EditText не может быть пустым", Toast.LENGTH_SHORT).show()
            }else
            comm.passDataCom(binding.editTxt.text.toString())
        }
        return binding.root
    }
}