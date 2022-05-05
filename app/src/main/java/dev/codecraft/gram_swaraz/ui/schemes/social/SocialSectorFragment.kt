package dev.codecraft.gram_swaraz.ui.schemes.social

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import dev.codecraft.gram_swaraz.R
import dev.codecraft.gram_swaraz.databinding.FragmentSocialSectorBinding
import dev.codecraft.gram_swaraz.ui.data.DataSource

class SocialSectorFragment : Fragment() {

    private lateinit var binding:FragmentSocialSectorBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSocialSectorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myDataset = DataSource().getData()
        binding.schemeRecyclerview.layoutManager = LinearLayoutManager(context)
        binding.schemeRecyclerview.adapter = SocialSchemeAdapter(this,myDataset)
        binding.schemeRecyclerview.setHasFixedSize(true)
        binding.schemeRecyclerview.setOnClickListener {

        }
        }

}