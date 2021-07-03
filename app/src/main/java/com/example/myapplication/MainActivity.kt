package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.*
import kotlin.math.log
import java.util.*
import java.util.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.apply {
            // Hide both the navigation bar and the status bar.
            // SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
            // a general rule, you should design your app to hide the status bar whenever you
            // hide the navigation bar.
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        setContentView(R.layout.activity_main)

        val verdades= arrayListOf<String>()
        // Definición de las verdades
        verdades.add("Esto es una prueba")
        verdades.add("")
        verdades.add("")
        verdades.add("")

        val retos= arrayListOf<String>()
        // Definición de los retos
        retos.add("Da un beso en la mejilla al jugador de la derecha")
        retos.add("Da un beso en la mejilla al jugador de la izquierda")
        retos.add("Da un beso en la mejilla al 2º jugador de la derecha")
        retos.add("Da un beso en la mejilla al 2º jugador de la izquierda")
        retos.add("Da un beso en la mejilla al jugador frente a tí, si sois impares, a los dos")
        retos.add("Da un beso en la mejilla a los jugadores en diagonal a tí")

        retos.add("Da un abrazo al jugador de la derecha")
        retos.add("Da un abrazo al jugador de la izquierda")
        retos.add("Da un abrazo al 2º jugador de la derecha")
        retos.add("Da un abrazo al 2º jugador de la izquierda")
        retos.add("Da un abrazo al jugador frente a tí, si sois impares, a los dos")
        retos.add("Da un abrazo a los jugadores en diagonal a tí")

        retos.add("Da un pico al jugador de la derecha")
        retos.add("Da un pico al jugador de la izquierda")
        retos.add("Da un pico al 2º jugador de la derecha")
        retos.add("Da un pico al 2º jugador de la izquierda")
        retos.add("Da un pico al jugador frente a tí, si sois impares, a los dos")
        retos.add("Da un pico a los jugadores en diagonal a tí")

        retos.add("Lame el cuello del jugador de la derecha")
        retos.add("Lame el cuello del jugador de la izquierda")
        retos.add("Lame el cuello del 2º jugador de la derecha")
        retos.add("Lame el cuello del jugador de la izquierda")
        retos.add("Lame el cuello del jugador frente a tí, si sois impares, a los dos")
        retos.add("Lame el cuello de los jugadores en diagonal a tí")

        retos.add("Todos los jugadores se ponen de pie, cierran los ojos y se ponen a dar vueltas, tras 10 segundos girando tienen que chupar el cuello de la persona que estén mirando, si no hay nadie delante, tiene que lamer el pezón de un jugador elegido por el grupo")

        retos.add("El jugador que el grupo elija tiene que quitarte una prenda")
        retos.add("El jugador que el grupo elija tiene que quitarte dos prendas")

        retos.add("Deja que un jugador del sexo opuesto elegido por el grupo te haga un chupetón en el cuello")

        retos.add("Tumbate en la entrepierta del jugador de la derecha durante una ronda")
        retos.add("Tumbate en la entrepierta del jugador de la izquierda durante una ronda")
        retos.add("Tumbate en la entrepierta del 2º jugador de la derecha durante una ronda")
        retos.add("Tumbate en la entrepierta del jugador de la izquierda durante una ronda")
        retos.add("Tumbate en la entrepierta del jugador frente a tí durante una ronda, si sois impares, elige el grupo cual de los dos")
        retos.add("Tumbate en la entrepierta del jugador en diagonal a tí durante una ronda, elige el grupo cual de los dos")

        retos.add("Lame la espalda del jugador de la derecha de forma sendual por debajo de la ropa")
        retos.add("Lame la espalda del jugador de la izquierda de forma sendual por debajo de la ropa")
        retos.add("Lame la espalda del 2º jugador de la derecha de forma sendual por debajo de la ropa")
        retos.add("Lame la espalda del jugador de la izquierda de forma sendual por debajo de la ropa")
        retos.add("Lame la espalda del jugador frente a tí de forma sendual por debajo de la ropa, si sois impares, elige el grupo cual de los dos")
        retos.add("Lame la espalda del jugador en diagonal a tí de forma sendual por debajo de la ropa, elige el grupo cual de los dos")

        retos.add("Junto a la persona que está frente a tí, debeís idear un reto para el resto de los jugadores")

        retos.add("Todos los jugadores cambian de sitio")




        fun numRand(rango: Int): Int{
            //Sirve para elegir un número random dentro de un rango, se usa para elegir la prueba
            val randNum = Random()
            val num = randNum.nextInt(rango)
            return num
        }

        fun addNuevo(reto: String) {
            // Modifica el texto que aparece en el cuadro de result

            val editText = findViewById<EditText>(R.id.prueba)
            val resultado = findViewById<TextView>(R.id.result)

            // Aquí hay que meter el valor que quieres que se muestro por pantalla
            resultado.text = reto
        }

        println(retos.count())
        println(verdades.count())
        val nuevo_reto = findViewById<Button>(R.id.btn_reto)
        nuevo_reto.setOnClickListener {
            val reto = retos[numRand(retos.count())]

            addNuevo(reto)

        }

        val nuevo_verdad = findViewById<Button>(R.id.btn_verdad)
        nuevo_verdad.setOnClickListener {
            val verdad = verdades[numRand(verdades.count())]

            addNuevo(verdad)

        }


    }
}