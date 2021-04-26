package com.example.recyclerviewhttprequests.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewhttprequests.R
import com.example.recyclerviewhttprequests.fragments.F1
import com.example.recyclerviewhttprequests.fragments.F2
import com.example.recyclerviewhttprequests.fragments.F3
import com.example.recyclerviewhttprequests.interfaces.ActivityFragmentCommunication
import com.example.recyclerviewhttprequests.models.User

class MainActivity : AppCompatActivity(), ActivityFragmentCommunication {
    val users: ArrayList<User> = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFirstFragmentFragment()

    }

    private fun addFirstFragmentFragment() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val firstFragment = F1.newInstance("", "")
        val tag = F1::class.java.name

        val addTransaction = transaction.add(
            R.id.frame_layout, firstFragment, tag
        )

        //addTransaction.addToBackStack(tag)
        addTransaction.commit()

    }
    override fun replaceWithF2() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F1::class.java.name

        val replaceTransaction = transaction.add(
            R.id.frame_layout, F2.newInstance("", ""), tag
        )
        replaceTransaction.addToBackStack(tag)

        replaceTransaction.commit()
    }
    override fun replaceWithF3() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F2::class.java.name

        val replaceTransaction = transaction.add(
            R.id.frame_layout, F3.newInstance("", ""), tag
        )
        replaceTransaction.addToBackStack(tag)

        replaceTransaction.commit()
    }

}