package dev.codecraft.gram_swaraz.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.codecraft.gram_swaraz.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityLoginBinding.inflate(layoutInflater)
      setContentView(binding.root)
        binding.cardViewLoginWithGoogle.setOnClickListener{

        }
    }
}