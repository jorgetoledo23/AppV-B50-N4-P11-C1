package com.example.FirstApp.Model

class UserProvider {

    private val listaUsuarios = listOf<User>(
        User(User = "test@inacapmail.cl", Pass = "123456"),
        User(User = "alumno@inacapmail.cl", Pass = "123456"),
        User(User = "profesor@inacapmail.cl", Pass = "123456"),
        User(User = "guardia@inacapmail.cl", Pass = "123456"),
        User(User = "director@inacapmail.cl", Pass = "123456"),
        User(User = "asistente@inacapmail.cl", Pass = "123456")
    )

    fun getAllUsers(): List<User>{
        return this.listaUsuarios
    }

    fun userExists(Username:String):Boolean{
        return listaUsuarios.any { it.Username == Username }
    }

    fun validatePass(Username: String, Pass:String):Boolean {
        return listaUsuarios.any { it.Username == Username && it.Password == Pass }
    }

    fun getUser(Username: String):User?{
        return listaUsuarios.find { it.Username == Username }
    }

}