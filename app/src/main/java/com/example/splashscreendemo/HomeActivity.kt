package com.example.splashscreendemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.splashscreendemo.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
//step 2
        lateinit var binding:ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //step 3
        binding=ActivityHomeBinding.inflate(layoutInflater)

        //step 4
        setContentView(binding.root)

        binding.btnipllist.setOnClickListener {
val i= Intent(this,ListActivity::class.java)
            startActivity(i)

        }
    }
}