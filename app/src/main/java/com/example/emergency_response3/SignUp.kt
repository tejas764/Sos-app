package com.example.emergency_response3

import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val usernameEditText = findViewById<EditText>(R.id.Name)
        val passwordEditText = findViewById<EditText>(R.id.PassText21)
        val signupButton = findViewById<Button>(R.id.button6)


        val sharedPreferences: SharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        signupButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Store data in SharedPreferences
                editor.putString(username, password)
                editor.apply()

                Toast.makeText(this, "Signup Successful!", Toast.LENGTH_SHORT).show()

                // Navigate to LoginActivity
                val intent = Intent(this, logIn::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
