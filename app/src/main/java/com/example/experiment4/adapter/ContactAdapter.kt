package com.example.experiment4.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import com.example.experiment4.ContactDetail
import com.example.experiment4.R
import android.widget.Toast

import androidx.core.content.ContextCompat.startActivity

import android.content.Intent
import android.net.Uri
import androidx.core.content.ContextCompat


class ContactAdapter(val context:Context,val arrayList:ArrayList<ContactDetail>):BaseAdapter() {
    private lateinit var name:TextView
    private lateinit var phone:TextView
    private lateinit var email:TextView
    private lateinit var btn:Button
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView=convertView
        convertView=LayoutInflater.from(context).inflate(R.layout.list_adapter_view,parent,false)
        name=convertView.findViewById(R.id.list_name)
        email=convertView.findViewById(R.id.list_email)
        phone=convertView.findViewById(R.id.list_phone)
        btn=convertView.findViewById(R.id.list_call_button)
        name.text=arrayList[position].getName()
        email.text=arrayList[position].getEmail()
        phone.text=arrayList[position].getPhone()
        btn.setOnClickListener {
            // stored in u.
            // stored in u.
            val u: Uri = Uri.parse("tel:" + arrayList[position].getPhone())

            // Create the intent and set the data for the
            // intent as the phone number.

            // Create the intent and set the data for the
            // intent as the phone number.
            val i:Intent = Intent(Intent.ACTION_DIAL, u)

            try {
                convertView.context.startActivity(i)
            } catch (s: SecurityException) {
                // show() method display the toast with
                // exception message.

            }
        }
        return convertView
    }
}