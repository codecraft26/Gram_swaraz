package dev.codecraft.gram_swaraz.ui.schemes.ecomomic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.codecraft.gram_swaraz.R
import dev.codecraft.gram_swaraz.databinding.FragmentEconomicSectorBinding


class EconomicSectorFragment : Fragment() {
    private lateinit var binding:FragmentEconomicSectorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding= FragmentEconomicSectorBinding.inflate(inflater,container,false)
        return binding.root

    }


}