package com.example.fragmentproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentproject.databinding.FragmentCreateAccountBinding


class CreateAccount : Fragment() {

    private var binding: FragmentCreateAccountBinding?=null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentCreateAccountBinding.inflate(inflater,container,false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding?.sign?.setOnClickListener {
            val email = binding?.emailtext?.text.toString()
            val password = binding?.passwordtext?.text.toString()

            val bundle = Bundle()
            bundle.putString("EMAIL", email)
            bundle.putString("PASSWORD", password)




            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, AccountCreated::class.java,bundle)
                .addToBackStack(CreateAccount::class.simpleName).commit()


        }
        binding?.fb?.setOnClickListener{
            val fb="Facebook"
            val bundle = Bundle().apply {
                putString("social", fb)

            }

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Social::class.java,bundle)
                .addToBackStack(CreateAccount::class.simpleName).commit()
        }

        binding?.apple?.setOnClickListener{
            val apple="Apple"
            val bundle = Bundle().apply {
                putString("social", apple)

            }

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Social::class.java,bundle)
                .addToBackStack(CreateAccount::class.simpleName).commit()
        }

        binding?.google?.setOnClickListener{
            val google="Google"
            val bundle = Bundle().apply {
                putString("social", google)

            }

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Social::class.java,bundle)
                .addToBackStack(CreateAccount::class.simpleName).commit()
        }



    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }}