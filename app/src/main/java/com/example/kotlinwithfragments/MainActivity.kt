package com.example.kotlinwithfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.kotlinwithfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Communicator {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val firstFragment = FirstFragment()
        supportFragmentManager.beginTransaction().replace(R.id.content_id,firstFragment).commit()
    }

    override fun passDataCom(edit_txt: String) {
        val bundle = Bundle()
        bundle.putString("date",edit_txt)
        val transaction = this.supportFragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        secondFragment.arguments = bundle

        transaction.replace(R.id.content_id,secondFragment)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }
}