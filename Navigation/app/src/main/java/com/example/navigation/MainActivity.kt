package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.Navigation.setOnItemSelectedListener { menuItem ->
            if (menuItem.itemId == R.id.Home)
            {
                inflateFragment(HomeFragment.newInstance())
            }
            else if(menuItem.itemId == R.id.Shorts){
                inflateFragment(ShortsFragment.newInstance())
            }
            else if(menuItem.itemId == R.id.Add){
                inflateFragment(AddFragment.newInstance())

            }
            else if(menuItem.itemId == R.id.Subscription){
                inflateFragment(SubscriptionFragment.newInstance())
            }
            else if(menuItem.itemId == R.id.library){
                inflateFragment(LibraryFragment.newInstance())

            }
                true
        }

    }



    private fun inflateFragment(newInstance:Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, newInstance)
        transaction.commit()
    }

}