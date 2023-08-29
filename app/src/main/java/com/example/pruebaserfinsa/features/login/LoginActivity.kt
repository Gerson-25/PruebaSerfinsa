package com.example.pruebaserfinsa.features.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.pruebaserfinsa.R
import com.example.pruebaserfinsa.databinding.ActivityLoginBinding
import com.example.pruebaserfinsa.features.home.HomeActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.Scopes
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.Scope

class LoginActivity : AppCompatActivity() {
    var googleSignInClient:  GoogleSignInClient? = null
    lateinit var binding: ActivityLoginBinding

    private val googleSignIn = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        val data  = it.data
        val task = GoogleSignIn.getSignedInAccountFromIntent(data)
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken("849889886981-teec7fd8d5o28eb3vq5s18np4l057omq.apps.googleusercontent.com")
            .requestScopes(Scope(Scopes.PROFILE))
            .requestScopes(Scope(Scopes.PLUS_ME))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(this, gso)

        binding.signIn.setOnClickListener {
            val intent = googleSignInClient?.signInIntent
            googleSignIn.launch(intent)
        }

    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {


        return super.onCreateView(name, context, attrs)

    }
}