package dev.codecraft.gram_swaraz.ui.schemes.skill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.codecraft.gram_swaraz.R
import dev.codecraft.gram_swaraz.databinding.FragmentSkillSectorBinding


class SkillSectorFragment : Fragment() {
    private lateinit var binding: FragmentSkillSectorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentSkillSectorBinding.inflate(inflater, container, false)
        return binding.root

    }
}
