package com.example.jetpacknavigationapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.example.jetpacknavigationapplication.R
import com.example.jetpacknavigationapplication.model.Tenant
import kotlinx.android.synthetic.main.fragment_add_tenant.*


class AddTenantFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_tenant, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addTenantTextView.setOnClickListener {
            val tenant = Tenant(editTextTextTenantName.text.toString(),editTextTextMobiletNumber.text.toString())
            val navDirections = AddTenantFragmentDirections.actionAddTenantFragmentToTenantListFragment(tenant)
            Navigation.findNavController(it).navigate(navDirections)
        }
    }
    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) = AddTenantFragment()
    }
}