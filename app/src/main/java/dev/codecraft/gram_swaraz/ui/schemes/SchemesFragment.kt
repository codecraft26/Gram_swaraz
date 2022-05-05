package dev.codecraft.gram_swaraz.ui.schemes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
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
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        renderContent()
    }

    private fun renderContent() {


        binding.viewpager2TasksFragments.adapter = SchemeFragmentAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewpager2TasksFragments) { tab, position ->
            tab.text = when (position) {
                0 -> "सामाजिक"
                1 -> "आर्थिक"
                2-> "कौशल"
                else -> "NA"
            }
        }.attach()
    }

}