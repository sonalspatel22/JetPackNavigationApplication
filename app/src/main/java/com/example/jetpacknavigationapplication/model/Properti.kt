package com.example.jetpacknavigationapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Properti( var name:String,
                     var address:String,): Parcelable
