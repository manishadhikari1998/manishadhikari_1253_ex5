package com.example.experiment4

class ContactDetail(name:String,phone:String,email:String){

    var uname=name
    var uphone=phone
    var uemail=email
    public fun getName(): String {
        return uname
    }
    public fun getPhone():String{
        return uphone
    }
    public fun getEmail():String{
        return uemail
    }


}