package dev.codecraft.gram_swaraz.ui.account

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.codecraft.gram_swaraz.R
import dev.codecraft.gram_swaraz.databinding.FragmentProfileBinding
import dev.codecraft.gram_swaraz.databinding.FragmentSchemesBinding

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }
}