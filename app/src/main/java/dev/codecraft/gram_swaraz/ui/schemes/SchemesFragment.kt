package dev.codecraft.gram_swaraz.ui.schemes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.codecraft.gram_swaraz.R
import dev.codecraft.gram_swaraz.databinding.FragmentSchemesBinding


class SchemesFragment : Fragment() {

   private lateinit var  binding: FragmentSchemesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSchemesBinding.inflate(inflater, container, false)
        return binding.root
    }
}