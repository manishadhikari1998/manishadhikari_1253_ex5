package com.example.experiment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import com.example.experiment4.adapter.ContactAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var addName:EditText
    private lateinit var addPhone:EditText
    private lateinit var addEmail:EditText
    private lateinit var addBtn:Button
    private lateinit var listview:ListView
    private var arrayList:ArrayList<ContactDetail> =ArrayList()
    private var adapter:ContactAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addName=findViewById(R.id.add_name)
        addPhone=findViewById(R.id.add_phone)
        addEmail=findViewById(R.id.add_email)
        addBtn=findViewById(R.id.add_btn)
        listview=findViewById(R.id.list_view)
        addBtn.setOnClickListener {
            val n=addName.text.toString()
            val p=addPhone.text.toString()
            val e=addEmail.text.toString()
            if(TextUtils.isEmpty(n) || TextUtils.isEmpty(p) || TextUtils.isEmpty(e)){
                return@setOnClickListener
            }
            arrayList.add(ContactDetail(n,p,e))
            adapter= ContactAdapter(this,arrayList)
            listview.adapter=adapter

        }
    }
}