package com.example.emergency_response3.fragment

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.emergency_response3.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val usernameEditText = view.findViewById<EditText>(R.id.profileName)

        // Retrieving the username from SharedPreferences
        val sharedPreferences: SharedPreferences = requireActivity().getSharedPreferences("UserPrefs", MODE_PRIVATE)
        val storedUserName = sharedPreferences.getString("username", "Guest")

        usernameEditText.setText(storedUserName)

        return view
    }
}
