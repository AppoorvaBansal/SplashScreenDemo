package com.example.splashscreendemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.splashscreendemo.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

lateinit var binding:ActivityListBinding
var arrname:ArrayList<String>?=null
    var arrdesg:ArrayList<String>?=null
    var arrimg:ArrayList<Int>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //10imgaes
        //10NAmes
        //10Desg

       arrname= ArrayList<String>()
        arrdesg=ArrayList<String>()
        arrimg=ArrayList<Int>()

        arrname!!.add("PULKIT")
        arrname!!.add("Vishu")
        arrname!!.add("Ankit")
        arrname!!.add("PAWan")
        arrname!!.add("Anu")
        arrname!!.add("Amit")

        arrdesg!!.add("AP")
        arrdesg!!.add("AP")
        arrdesg!!.add("AP")
        arrdesg!!.add("AP")
        arrdesg!!.add("AP")
        arrdesg!!.add("AP")

        arrimg!!.add(R.drawable.a2)
        arrimg!!.add(R.drawable.a2)
        arrimg!!.add(R.drawable.a4)
        arrimg!!.add(R.drawable.a5)
        arrimg!!.add(R.drawable.a6)
        arrimg!!.add(R.drawable.a7)


val obj:MyListViewAdapter=MyListViewAdapter(this,arrname!!,arrdesg!!,arrimg!!)
        binding.listIPL.adapter=obj


    }
}