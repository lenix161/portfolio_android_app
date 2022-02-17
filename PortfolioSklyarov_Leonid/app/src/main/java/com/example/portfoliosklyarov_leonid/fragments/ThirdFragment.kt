package com.example.portfoliosklyarov_leonid.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.portfoliosklyarov_leonid.R
import com.example.portfoliosklyarov_leonid.databinding.FragmentThirdBinding
import com.squareup.picasso.Picasso


class ThirdFragment : Fragment(R.layout.fragment_third) {

    private lateinit var binding: FragmentThirdBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentThirdBinding.bind(view)

        Picasso.get()
            .load("https://catherineasquithgallery.com/uploads/posts/2021-03/1614674173_64-p-fon-nastolnii-tennis-76.jpg")
            .into(binding.tennisImage)

        Picasso.get()
            .load("https://cdn-cyclingtips.pressidium.com/wp-content/uploads/2016/09/AU6T3048.jpeg")
            .into(binding.bicycleImage)

        Picasso.get()
            .load("https://wordpress-network.prod.aws.skyscnr.com/wp-content/uploads/2018/05/GettyImages-184811082.jpg")
            .into(binding.skiImage)

        Picasso.get()
            .load("https://skupix.ru/wp-content/uploads/snoubord-2.jpg")
            .into(binding.snowboardImage)

        Picasso.get()
            .load("https://lmarkt.com/media/filer_public/7d/28/7d28a6b7-25fc-4ba5-8b77-d1d1efd129a6/57c2ca59-2c8a-11e5-b094-001e67103b78_57c2ca61-2c8a-11e5-b094-001e67103b78.jpeg")
            .into(binding.synthImage)
    }


}