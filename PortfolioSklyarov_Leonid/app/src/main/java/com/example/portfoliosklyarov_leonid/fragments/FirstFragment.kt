package com.example.portfoliosklyarov_leonid.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import com.example.portfoliosklyarov_leonid.MainActivity
import com.example.portfoliosklyarov_leonid.R
import com.example.portfoliosklyarov_leonid.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)


        binding.greetingButton.setOnClickListener{
            Toast.makeText(context, "\uD83D\uDC4B \uD83D\uDE03", Toast.LENGTH_SHORT).show()

        }
    }


}