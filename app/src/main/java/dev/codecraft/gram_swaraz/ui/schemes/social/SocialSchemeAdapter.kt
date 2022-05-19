package dev.codecraft.gram_swaraz.ui.schemes.social

import android.content.Context
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import dev.codecraft.gram_swaraz.R
import dev.codecraft.gram_swaraz.data.model.Scheme

class SocialSchemeAdapter(private val SocialList:ArrayList<Scheme>):RecyclerView.Adapter<SocialSchemeAdapter.SocialViewHolder>(){
    class SocialViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val title:TextView= itemView.findViewById(R.id.scheme_title)
        


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SocialViewHolder {

        val itemView=View.inflate(parent.context, R.layout.card_for_fragments, null)
        return SocialViewHolder(itemView)

    }


    override fun onBindViewHolder(holder: SocialViewHolder, position: Int) {
        val social=SocialList[position]
        holder.title.text=social.title
        holder.itemView.setOnClickListener{
            Toast.makeText(,"this is toast message",Toast.LENGTH_SHORT).show()
        }


    }

    override fun getItemCount(): Int {
       return SocialList.size
    }


}

