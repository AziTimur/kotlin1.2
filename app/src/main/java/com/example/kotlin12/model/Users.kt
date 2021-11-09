package com.example.kotlin12.model

import android.media.Image
import java.net.URL

/*class Users {
    private lateinit var name: String
    private lateinit var photo:Image
    private lateinit var url:URL
}*/
data class Users (
    private  var name: String?=null,
    private  var photo:String?=null,
    private  var url:String?=null,
)