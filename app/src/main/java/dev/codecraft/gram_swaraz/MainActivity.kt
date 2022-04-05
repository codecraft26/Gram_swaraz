package dev.codecraft.gram_swaraz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import dev.codecraft.gram_swaraz.ui.account.ProfileFragment
import dev.codecraft.gram_swaraz.ui.organicfarming.OrganicFragment
import dev.codecraft.gram_swaraz.ui.schemes.SchemesFragment

class MainActivity : AppCompatActivity() {
    private lateinit var currentFragment : Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,
            SchemesFragment()
        ).commit()
        val bottomNav : BottomNavigationView = findViewById(R.id.bottom_navView)
        bottomNav.setOnNavigationItemSelectedListener(bottomListener)

    }

    val bottomListener = BottomNavigationView.OnNavigationItemSelectedListener {
        // switch between ids of menu
        when(it.itemId){
            R.id.schemesFragment -> {
                currentFragment = SchemesFragment()
            }
            R.id.organicFragment -> {
                currentFragment = OrganicFragment()
            }
            R.id.profileFragment-> {
                currentFragment = ProfileFragment()
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,currentFragment).commit()
        true
    }
}