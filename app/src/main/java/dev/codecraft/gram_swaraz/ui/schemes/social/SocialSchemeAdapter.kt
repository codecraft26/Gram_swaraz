package dev.codecraft.gram_swaraz.ui.schemes.social

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.codecraft.gram_swaraz.R
import dev.codecraft.gram_swaraz.ui.model.Schemes

class SocialSchemeAdapter(
    private val context: SocialSectorFragment,
    private val dataset: List<Schemes>
): RecyclerView.Adapter<SocialSchemeAdapter.SocialAdapter>()  {



    class SocialAdapter(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.scheme_title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SocialAdapter {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_for_fragments, parent, false)
        return SocialAdapter(adapterLayout)
    }
    override fun onBindViewHolder(holder: SocialAdapter, position: Int) {
        val item = dataset[position]
        holder.textView.text = item.SchemeName

    }
    override fun getItemCount(): Int {
        return dataset.size
    }
    }
