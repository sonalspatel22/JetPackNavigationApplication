package com.example.jetpacknavigationapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Tenant(var name: String,
                  var mobileNumber: String):Parcelable
