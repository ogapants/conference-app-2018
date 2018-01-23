package io.github.droidkaigi.confsched2018.presentation.common.view

import android.support.design.widget.TabLayout
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager

class TabReelectedListener(private val viewPager: ViewPager) :
        TabLayout.ViewPagerOnTabSelectedListener(viewPager) {

    override fun onTabReselected(tab: TabLayout.Tab) {
        super.onTabReselected(tab)
        val adapter = viewPager.adapter as FragmentStatePagerAdapter
        val item = adapter.getItem(tab.position)
        if (item is ViewPagerItem) {
            item.getRecyclerView().smoothScrollToPosition(0)
        }
    }
}
