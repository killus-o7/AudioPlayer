package com.example.audioplayer.ui

import com.example.audioplayer.R
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MenuItemHandler (
    bottomAppBar: BottomAppBar,
    private val floatingActionButton: FloatingActionButton
) {
    init {
        bottomAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.loop -> {
                    menuItem.isChecked = true
                    true
                }
                R.id.next -> {
                    // Handle rotation icon press
                    true
                }
                else -> false
            }
        }
    }
}