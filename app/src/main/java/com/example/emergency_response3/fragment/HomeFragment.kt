package com.example.emergency_response3.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.emergency_response3.R
import com.example.emergency_response3.SOSActivity
import com.example.emergency_response3.Vending
import com.example.emergency_response3.VendingMachine2
import com.example.emergency_response3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!! // Safe getter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up Image Slider
        val imageList = arrayListOf(
            SlideModel(R.drawable.banner7, ScaleTypes.FIT),
            SlideModel(R.drawable.banner2, ScaleTypes.FIT),
            SlideModel(R.drawable.banner3, ScaleTypes.FIT)
        )
        binding.imageSlider.setImageList(imageList)

        // Set up Click Listeners
        binding.imageButton2.setOnClickListener {
            startActivity(Intent(requireContext(), Vending::class.java))
        }

        binding.imageButton.setOnClickListener {
            startActivity(Intent(requireContext(), SOSActivity::class.java))
        }

        binding.imageButton4.setOnClickListener {
            startActivity(Intent(requireContext(), VendingMachine2::class.java))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Prevent memory leaks
    }
}
