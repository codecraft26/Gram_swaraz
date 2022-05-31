package dev.codecraft.gram_swaraz.ui.schemes.social

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import dev.codecraft.gram_swaraz.R
import dev.codecraft.gram_swaraz.data.model.Scheme
import dev.codecraft.gram_swaraz.databinding.CardForFragmentsBinding
import dev.codecraft.gram_swaraz.ui.schemes.SchemesFragmentDirections

class SocialSchemeAdapter(private val SocialList:ArrayList<Scheme>):RecyclerView.Adapter<SocialSchemeAdapter.SocialViewHolder>(){
    class SocialViewHolder(private val binding:CardForFragmentsBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(scheme: Scheme){
            binding.schemeTitle.text=scheme.title
            binding.schemeTitle.setOnClickListener{
                val action= SchemesFragmentDirections.actionSchemesFragmentToDescriptonFragment(scheme.title)
                it.findNavController().navigate(action)
            }
        }

        


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SocialViewHolder {

        val itemView=View.inflate(parent.context, R.layout.card_for_fragments, null)
        return SocialViewHolder(

            CardForFragmentsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }


    override fun onBindViewHolder(holder: SocialViewHolder, position: Int) {
        val social=SocialList[position]
        holder.bind(social)



    }

    override fun getItemCount(): Int {
       return SocialList.size
    }


}

