package dev.codecraft.gram_swaraz.ui.schemes

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import dev.codecraft.gram_swaraz.ui.schemes.social.SocialSectorFragment
import dev.codecraft.gram_swaraz.ui.schemes.ecomomic.EconomicSectorFragment
import dev.codecraft.gram_swaraz.ui.schemes.skill.SkillSectorFragment

class SchemeFragmentAdapter(fragment: Fragment): FragmentStateAdapter(fragment){
    override fun getItemCount() = 3
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SocialSectorFragment()
            1 -> EconomicSectorFragment()
            2-> SkillSectorFragment()
            else -> SocialSectorFragment()
        }
    }

}
