package dev.codecraft.gram_swaraz.ui.organicfarming

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.codecraft.gram_swaraz.R
import dev.codecraft.gram_swaraz.databinding.FragmentOrganicBinding
import dev.codecraft.gram_swaraz.databinding.FragmentProfileBinding


class OrganicFragment : Fragment() {
    private lateinit var binding: FragmentOrganicBinding
    // Inflate the layout for this fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrganicBinding.inflate(inflater, container, false)
        return binding.root
    }
}