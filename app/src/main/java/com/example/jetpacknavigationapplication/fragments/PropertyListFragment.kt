package com.example.jetpacknavigationapplication.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.jetpacknavigationapplication.R
import com.example.jetpacknavigationapplication.model.Properti


class PropertyListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_property_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
           val properti =  PropertyListFragmentArgs.fromBundle(bundle = it).propertyModel
            Log.i("Property",""+properti)
            Toast.makeText(activity,""+properti, Toast.LENGTH_LONG)
        }
    }
}