package com.example.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragmentsapp.fragments.CategoryFragment
import com.example.fragmentsapp.fragments.CheckListFragment
import com.example.fragmentsapp.fragments.HomeFragment
import com.example.fragmentsapp.fragments.ReloadFreagment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavbar : BottomNavigationView
    private var MainActivityTag = "MENU_ITEM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavbar = findViewById(R.id.bottom_nav_menu)
        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, homeFragment).commit()

        bottomNavbar.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.home_menu -> {
                    Log.i(MainActivityTag, "Home seleccionado")
                    val homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,homeFragment).commit()
                }
                R.id.category_menu -> {
                    Log.i(MainActivityTag, "Category seleccionado")
                    val categoryFragment = CategoryFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, categoryFragment).commit()
                }
                R.id.reload_menu -> {
                    Log.i(MainActivityTag, "Reload seleccionado")
                    val reloadFragment = ReloadFreagment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, reloadFragment).commit()
                }
                R.id.check_list_menu -> {
                    Log.i(MainActivityTag, "Check List seleccionado")
                    val checkListFragmentFragment = CheckListFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, checkListFragmentFragment).commit()
                }
            }
            true
        }
    }
}