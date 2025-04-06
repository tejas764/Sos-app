package com.example.emergency_response3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import com.google.android.gms.auth.api.signin.GoogleSignIn
//import com.google.android.gms.auth.api.signin.GoogleSignInAccount
//import com.google.android.gms.auth.api.signin.GoogleSignInClient
//import com.google.android.gms.auth.api.signin.GoogleSignInOptions
//import com.google.android.gms.common.api.ApiException
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.auth.GoogleAuthProvider

class MainActivity : AppCompatActivity() {

//    private lateinit var googleSignInClient: GoogleSignInClient
//    private lateinit var auth: FirebaseAuth
//    private val RC_SIGN_IN = 1001
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//
//        auth = FirebaseAuth.getInstance()
//
//        // Configure Google Sign-In
//        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//            .requestIdToken(getString(R.string.default_web_client_id)) // Add this in `strings.xml`
//            .requestEmail()
//            .build()
//
//        googleSignInClient = GoogleSignIn.getClient(this, gso)


        val loginButton = findViewById<Button>(R.id.button)
        loginButton.setOnClickListener {
            startActivity(Intent(this, logIn::class.java))
        }

        val signupButton = findViewById<Button>(R.id.button2)
        signupButton.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }

        val nextButton = findViewById<Button>(R.id.button5)
        nextButton.setOnClickListener {
            startActivity(Intent(this, MainApp::class.java))
        }

        // Google Sign-In Button (button3)
        val googleSignInButton = findViewById<Button>(R.id.button3)
//        googleSignInButton.setOnClickListener {
//            signInWithGoogle()
//        }
    }

//    private fun signInWithGoogle() {
//        val signInIntent = googleSignInClient.signInIntent
//        startActivityForResult(signInIntent, RC_SIGN_IN)
//    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if (requestCode == RC_SIGN_IN) {
//            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
//            try {
//                val account = task.getResult(ApiException::class.java)!!
//                firebaseAuthWithGoogle(account)
//            } catch (e: ApiException) {
//                Toast.makeText(this, "Google Sign-In failed: ${e.message}", Toast.LENGTH_SHORT).show()
//                Log.e("GoogleSignIn", "Error: ${e.message}")
//            }
//        }
//    }
//
//    private fun firebaseAuthWithGoogle(account: GoogleSignInAccount) {
//        val credential = GoogleAuthProvider.getCredential(account.idToken, null)
//        auth.signInWithCredential(credential)
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//                    Toast.makeText(this, "Sign-In Successful!", Toast.LENGTH_SHORT).show()
//                    startActivity(Intent(this, MainActivity::class.java))
//                    finish()
//                } else {
//                    Toast.makeText(this, "Sign-In Failed", Toast.LENGTH_SHORT).show()
//                }
//            }
    }

