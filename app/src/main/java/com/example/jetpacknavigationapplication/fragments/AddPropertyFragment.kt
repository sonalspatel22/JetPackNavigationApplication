package com.example.jetpacknavigationapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.jetpacknavigationapplication.R
import com.example.jetpacknavigationapplication.model.Properti
import com.example.jetpacknavigationapplication.model.Tenant
import kotlinx.android.synthetic.main.fragment_add_property.*
import kotlinx.android.synthetic.main.fragment_add_tenant.*


class AddPropertyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_property, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addPropertytextView.setOnClickListener {
            val properti = Properti(editTextTextPropertyName.text.toString(),editTextTextPropertyAddress.text.toString())
            val navDirections = AddPropertyFragmentDirections.actionAddPropertyFragmentToPropertyListFragment(properti)
            Navigation.findNavController(it).navigate(navDirections)
        }
    }

}