package dev.codecraft.gram_swaraz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import dev.codecraft.gram_swaraz.ui.login.LoginActivity

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        Handler().postDelayed({
            startActivity(Intent(this@LaunchActivity, LoginActivity::class.java))
            finish()
        },2000)
    }
}