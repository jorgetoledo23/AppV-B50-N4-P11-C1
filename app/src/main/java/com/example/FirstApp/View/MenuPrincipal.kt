package com.example.FirstApp.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.FirstApp.Model.User
import com.example.FirstApp.R
import com.example.FirstApp.databinding.ActivityMenuPrincipalBinding

class MenuPrincipal : AppCompatActivity() {

    private lateinit var binding:ActivityMenuPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_menu_principal)
        binding = ActivityMenuPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val User: User = bundle?.getSerializable("User") as User

        binding.tvUsername.text = User.Username
        binding.btnBack.setOnClickListener{ onBackPressed() }
    }
}