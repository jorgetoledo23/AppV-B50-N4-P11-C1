package com.example.FirstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.FirstApp.Model.User
import com.example.FirstApp.Model.User2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declarar Variables
        var nombreUsuario:String
        nombreUsuario = "jorge.toledo11@inacapmail.cl"
        var passUsuario:String = "123456"
        var edadUsuario:Int = 30
        // Inferir el Tipo
        var edadUsuarioInacap = 25
        var edadUsuarioInacap2 = 30
        var concat:String = nombreUsuario + "Texto Concatenado"

        //public void sumDosNumeros
        fun sumDosNumeros(x:Int, y:Int){
            Log.i("INFO CLASE", (x + y).toString())
        }
        sumDosNumeros(10,20)
        //public Integer sumDosNumeros2()
        fun sumDosNumeros2(x:Int, y:Int):Int{
            return x + y
        }

        fun sumDosNumeros3(x:Int = 10, y:Int = 10):Int{
            return x + y
        }

        Log.i("INFO CLASE", sumDosNumeros2(10,10).toString())
        Log.i("INFO CLASE", sumDosNumeros3(100).toString())

        //User nuevoUsuario = new User()
        var nuevoUsuario = User()
        nuevoUsuario.apellido = "Test"
        nuevoUsuario.nombre = "Test"
        nuevoUsuario.nombreUsuario = "Test@test.cl"
        nuevoUsuario.password = "123456"

        var nuevoUsuario2 = User2("test@test.cl", "123456","Jorge", "Toledo")
        
    }
}