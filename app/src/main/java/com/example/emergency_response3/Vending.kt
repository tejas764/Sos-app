package com.example.emergency_response3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.emergency_response3.databinding.ActivityVendingBinding

class Vending : AppCompatActivity() {
    private lateinit var binding: ActivityVendingBinding
//    private val medicineList = ArrayList<Medicine>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityVendingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setting up Image Slider
        val imageList = ArrayList<SlideModel>().apply {
            add(SlideModel(R.drawable.banner6, "Be the reason someone survives"))
            add(SlideModel(R.drawable.banner5, "A few seconds of courage can save a lifetime. Act fast."))
            add(SlideModel(R.drawable.banner4, "The 'Golden Hour' Concept: A 10-minute delay in emergency care increases the risk of death by 10% in trauma cases."))
        }
        binding.imageSlider.setImageList(imageList, ScaleTypes.FIT)

        // Populating medicine list dynamically
        val items = listOf("Paracetamol", "Sandwich", "Dettol", "Burger")
        val prices = listOf("5rs", "6rs", "7rs", "8rs")
        val images = listOf(
            R.drawable.icons8_facebook,
            R.drawable.banner4,
            R.drawable.banner6,
            R.drawable.sos
        )

//        for (i in items.indices) {
//            medicineList.add(Medicine(items[i], prices[i], images[i]))
//        }

        // Setting up RecyclerView
//        binding.popularRecycler.apply {
//            layoutManager = LinearLayoutManager(this@Vending)
//            adapter = PopularAdapter(medicineList)
//        }
    }
}

// Data class for medicine items
//data class Medicine(val name: String, val price: String, val image: Int)