package com.example.portfoliosklyarov_leonid.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.portfoliosklyarov_leonid.R
import com.example.portfoliosklyarov_leonid.databinding.FragmentFourthBinding
import com.squareup.picasso.Picasso


class FourthFragment : Fragment(R.layout.fragment_fourth) {

    private lateinit var binding: FragmentFourthBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFourthBinding.bind(view)

        Picasso.get()
            .load("https://personaspb.com/assets/images/novosti/1_19.jpg")
            .into(binding.logoFirst)

        Picasso.get()
            .load("https://www.itsdelta.ru/upload/iblock/0e8/0e82211935f7a4362de04c3a9c7b568a.png")
            .into(binding.logoSecond)

        Picasso.get()
            .load("https://financialit.net/sites/default/files/sver.png")
            .into(binding.logoThird)

        Picasso.get()
            .load("https://iite.unesco.org/wp-content/uploads/2020/03/Mail.ru_logo-2048x659.png")
            .into(binding.logoFourth)
    }


}