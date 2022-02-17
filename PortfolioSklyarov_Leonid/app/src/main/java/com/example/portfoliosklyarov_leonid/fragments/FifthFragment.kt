package com.example.portfoliosklyarov_leonid.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.portfoliosklyarov_leonid.R
import com.example.portfoliosklyarov_leonid.databinding.FragmentFifthBinding
import android.content.Intent
import android.net.Uri


class FifthFragment : Fragment(R.layout.fragment_fifth) {

    private lateinit var binding: FragmentFifthBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFifthBinding.bind(view)

        binding.gmailLogo.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:lenyasklyarov@gmail.com"))
            startActivity(browserIntent)
        }

        binding.vkLogo.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/id145895032"))
            startActivity(browserIntent)
        }

        binding.igLogo.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/leopold_the_cat.0_0/"))
            startActivity(browserIntent)
        }
    }


}