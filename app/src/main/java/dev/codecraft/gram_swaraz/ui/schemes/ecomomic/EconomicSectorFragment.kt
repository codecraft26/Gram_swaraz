package dev.codecraft.gram_swaraz.ui.schemes.ecomomic

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.FirebaseFirestore
import dev.codecraft.gram_swaraz.R
import dev.codecraft.gram_swaraz.data.model.Scheme
import dev.codecraft.gram_swaraz.databinding.FragmentEconomicSectorBinding
import dev.codecraft.gram_swaraz.databinding.FragmentSkillSectorBinding
import dev.codecraft.gram_swaraz.ui.schemes.social.SocialSchemeAdapter


class EconomicSectorFragment : Fragment() {
    private lateinit var binding:FragmentEconomicSectorBinding
    private lateinit var mAdapter: SocialSchemeAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var socialList:ArrayList<Scheme>
    private lateinit var db: FirebaseFirestore

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView=binding.economicSectorBinding
        recyclerView.layoutManager= LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)
        socialList=ArrayList()
        mAdapter= SocialSchemeAdapter(socialList)
        recyclerView.adapter=mAdapter
        EvenChangeList()
    }

    private fun EvenChangeList() {
        db = FirebaseFirestore.getInstance()
        db.collection("EconomicScheme").addSnapshotListener { value, error ->


            if(error!=null) {
                Log.e("firebase error", error.message.toString())
                return@addSnapshotListener
            }
            for(dc: DocumentChange in value!!.documentChanges){
                if(dc.type== DocumentChange.Type.ADDED){
                    val inquire=dc.document.toObject(Scheme::class.java)
                    socialList.add(inquire)
                    mAdapter.notifyDataSetChanged()
                }
            }
        }
    }


}