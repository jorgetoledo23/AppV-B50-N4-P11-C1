package com.example.FirstApp.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.FirstApp.Model.UserProvider
import com.example.FirstApp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    public lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        var btnLogin = findViewById<Button>(R.id.btnLogin)
        var txtUsername = findViewById<TextInputLayout>(R.id.txtUsername) */

        binding.btnLogin.setOnClickListener{ LoginIn() }

    }

    fun LoginIn(){
        //Toast.makeText(this, "Has Clickeado el btnLogin", Toast.LENGTH_SHORT).show()

        var userProvider = UserProvider()

        val Username:String = binding.txtUsername.editText?.text.toString()
        val Pass:String = binding.txtPassword.editText?.text.toString()

        if(Username.isNotBlank() && Pass.isNotBlank()){
            //OK Validar si existe ek Usuario
            if (userProvider.userExists(Username)){
                //Usuario efectivamente Existe
                if(userProvider.validatePass(Username, Pass)){
                    //TODO Navegar a la otra Actividad
                    // Intent
                    val intent = Intent(this, MenuPrincipal::class.java)
                    intent.putExtra("User", userProvider.getUser(Username))
                    intent.putExtra("Saludo", "Hola Mundo!")
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "La Password ingresada es incorrecta", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Usuario NO Encontrado", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this, "Todos los campos son necesarios!", Toast.LENGTH_SHORT).show()
        }
    }
}