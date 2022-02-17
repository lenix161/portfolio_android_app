package com.example.portfoliosklyarov_leonid.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.portfoliosklyarov_leonid.R
import com.example.portfoliosklyarov_leonid.databinding.FragmentSecondBinding
import com.squareup.picasso.Picasso


class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSecondBinding.bind(view)

        Picasso.get().load("https://scientificrussia.ru/images/j/15hj-full.jpg").into(binding.itmo)
    }


}