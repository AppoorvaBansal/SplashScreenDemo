package com.example.splashscreendemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListViewAdapter(applicationContext: Context,arrname:ArrayList<String>,arrdes:ArrayList<String>,arrimg:ArrayList<Int>)
    : BaseAdapter()
{
    val inflater=LayoutInflater.from(applicationContext)
    val arrname=arrname
    val arrdes=arrdes
    val arrimg=arrimg




    override fun getCount(): Int {
       return arrdes.size
    }

    override fun getItem(p0: Int): Any {
        return arrname[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val lay=inflater.inflate(R.layout.mylist,p2,false)

        val img=lay.findViewById<ImageView>(R.id.imglist)
        val txtname=lay.findViewById<TextView>(R.id.txtname)
        val txtdesg=lay.findViewById<TextView>(R.id.txtdesg)


        txtname.text=arrname[p0]
        txtdesg.text=arrdes[p0]
        img.setImageResource(arrimg[p0])



       return lay

    }


}