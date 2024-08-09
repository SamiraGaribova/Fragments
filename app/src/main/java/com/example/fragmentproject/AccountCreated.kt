package com.example.fragmentproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentproject.databinding.FragmentAccountCreatedBinding




class AccountCreated : Fragment() {
    private var binding: FragmentAccountCreatedBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAccountCreatedBinding.inflate(inflater,container,false)

        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val email=arguments?.getString("EMAIL")
        val password=arguments?.getString("PASSWORD")
        binding?.emailTextView?.text = "Email: $email\nPassword: $password"


        binding?.back?.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}