package dev.codecraft.gram_swaraz.data.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.FirebaseFirestore

class SocialSectorViewModel:ViewModel() {
    private lateinit var db: FirebaseFirestore
    var title = ""
    var description = "";
}