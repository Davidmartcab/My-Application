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
  verdades.add("¿Cuando fue la última vez que te acostaste con alguien?")
  verdades.add("¿Eres fiel?")
  verdades.add("¿Alguna vez te has reido de tu pareja estando con tus amigos?")
  verdades.add("¿Estás enamorado ahora mismo?")
  verdades.add("¿Has tenido más de una pareja alguna vez?")
  verdades.add("¿Quién es la persona que te parece más atractiva del grupo?")
  verdades.add("¿Has besado a alguien en las últimas 24h?")
  verdades.add("¿En qué te fijas primero de una persona del sexo opuesto?")
  verdades.add("¿Cuándo fue la última vez que te masturbaste?")
  verdades.add("¿Te emociona la idea de besar a la persona que tienes al lado?")
  verdades.add("¿Alguna vez has pensado en ser infiel en una relación?")
  verdades.add("¿Alguna vez te has enamorado de un/una profesor/profesora?")
  verdades.add("¿Prefieres tener contacto visual mientras besas o no?")
  verdades.add("¿Hasta donde llegarías con alguien de esta habitación?")
  verdades.add("¿Cuántas personas del grupo has visto desnuda?")
  verdades.add("¿Alguna vez tuviste fantasías con personas del mismo sexo?")
  verdades.add("¿Alguna vez has usado ropa interior del sexo opuesto?")
  verdades.add("¿Lo has hecho alguna vez en un lugar público?")
  verdades.add("¿Dónde te pondría muchísimo hacerlo?")
  verdades.add("¿Alguna vez te has enamorado de un/una amig@?")
  verdades.add("¿Qué tendría que hacer alguien para irse a la cama contigo?")
  verdades.add("¿Tienes algun tatuaje?")
  verdades.add("¿Revisas los perfiles de las personas que acabas de conocer?")
  verdades.add("¿Qué es lo que nunca querrías probar en la cama?")
  verdades.add("Cada jugador puede hacerte una pregunta a su elección")
  verdades.add("¿Has usado alguna vez la píldora del día después?")
  verdades.add("¿Alguna vez has enviado fotos picantes a alguien?")
  verdades.add("¿Si solo quedarán dos personas en la Tierra y tu fueras una de ellas, quién elegirías que fuera la otra persona?")
  verdades.add("¿Qué es lo más loco que has hecho desnudo?")
  verdades.add("¿Con que frecuencia ves nopor?")
  verdades.add("¿Has besado alguna vez a alguno de los jugadores presentes?")
  verdades.add("¿Te has acostado con alguno de los jugadores?")
  verdades.add("¿Qué prefieres: dormir o tener sexo?")
  verdades.add("¿Te gusta provocar o que te provoquen?")
  verdades.add("¿Qué es lo más travieso que harías con la persona que elija el grupo?")
  verdades.add("¿Cuál crees que es la peor manera de ligar?")
  verdades.add("¿Qué palabras te excitan?")
  verdades.add("¿Qué idioma te parece más sensual?")
  verdades.add("¿Cuál ha sido tu peor experiencia sexual?")
  verdades.add("¿Quíen crees que la tiene más pequeña del grupo?")
  verdades.add("SOLO para chicos: ¿Qué prefieres: no volver a tener ningún tipo de contacto sexual o que te den por culo 5 tios a la vez?")
  verdades.add("De poder besar a algún jugador del grupo, ¿quíen sería?")
  verdades.add("¿Tuviste sexo en el trabajo?")
  verdades.add("¿Tuviste sexo en el colegio?")
  verdades.add("Página porno favorita")
  verdades.add("¿Cuál es tu categoría porno favorita?")
  verdades.add("¿Te gusta que te agarren del cuello?")
  verdades.add("¿Cuál es tu posición favorita?")
  verdades.add("¿Te pillaron teniendo sexo?")
  verdades.add("Mayor cantidad de orgasmos teniendo sexo")
  verdades.add("¿Te gusta que te escupan?¿Dónde?")
  verdades.add("¿Tuviste sexo en un automóvil?")
  verdades.add("¿A qué edad diste tu primer beso?")
  verdades.add("¿Te pegaron alguna vez teniendo sexo en la cama?¿Te gustó?")
  verdades.add("¿Te han metido algo por el culo, quién, el qué?")
  verdades.add("¿Dominar o que te dominen?")
  verdades.add("¿Has hecho algún trio?¿Con quién del grupo lo harías?")
  verdades.add("¿Tuviste relaciones con una persona del mismo sexo?")
  verdades.add("¿Pagarías por sexo?")
  verdades.add("¿Tuviste sexo al lado de un/una amig@ mientras dormía?")
  verdades.add("¿Tuviste algo con el/la ex de un anmig@?")
  verdades.add("¿Arriba o abajo?")
  verdades.add("¿Qué tienen que hacerte para calentarte?")
  verdades.add("¿Estarías con algún familiar de los presentes?")
  verdades.add("Para ti,¿quién la tiene más grande?")
  verdades.add("¿Con cuanto te has besado del grupo, quienes?")

  val retos= arrayListOf<String>()
  // Definición de los retos
  retos.add("Da un beso en la mejilla al jugador de la derecha")
  retos.add("Da un beso en la mejilla al jugador de la izquierda")
  retos.add("Da un beso en la mejilla al jugador frente a tí, si sois impares, a los dos")
  retos.add("Da un beso en la mejilla al jugador que elija el grupo")

  retos.add("Da un abrazo al jugador de la derecha")
  retos.add("Da un abrazo al jugador de la izquierda")
  retos.add("Da un abrazo al jugador frente a tí, si sois impares, a los dos")
  retos.add("Da un abrazo al jugador que elija el grupo")

  retos.add("Da un beso con lengua al jugador de la derecha")
  retos.add("Da un beso con lengua al jugador de la izquierda")
  retos.add("Da un beso con lengua al jugador frente a tí, si sois impares, a los dos")
  retos.add("Da un beso con lengua al jugador que elija el grupo")

  retos.add("Da un pico al jugador de la derecha")
  retos.add("Da un pico al jugador de la izquierda")
  retos.add("Da un pico al jugador frente a tí, si sois impares, a los dos")
  retos.add("Da un pico al jugador que elija el grupo")

  retos.add("Lame el cuello del jugador de la derecha")
  retos.add("Lame el cuello del jugador de la izquierda")
  retos.add("Lame el cuello del jugador frente a tí, si sois impares, a los dos")
  retos.add("Lame el cuello del jugador que elija el grupo")

  retos.add("Chupa el dedo del jugador de la derecha sensualmente")
  retos.add("Chupa el dedo del jugador de la izquierda sensualmente")
  retos.add("Chupa el dedo del jugador frente a tí sensualmente, si sois impares, a los dos")
  retos.add("Chupa el dedo del jugador que elija el grupo")

  retos.add("Todos los jugadores se ponen de pie, cierran los ojos y se ponen a dar vueltas, tras 10 segundos girando tienen que chupar el cuello de la persona que estén mirando, si no hay nadie delante, tiene que lamer el pezón de un jugador elegido por el grupo")

  retos.add("El jugador que el grupo elija tiene que quitarte una prenda")
  retos.add("El jugador que el grupo elija tiene que quitarte dos prendas")

  retos.add("Deja que un jugador del sexo opuesto elegido por el grupo te haga un chupetón en el cuello")

  retos.add("Tumbate en la entrepierta del jugador de la derecha durante una ronda")
  retos.add("Tumbate en la entrepierta del jugador de la izquierda durante una ronda")
  retos.add("Tumbate en la entrepierta del jugador frente a tí durante una ronda, si sois impares, elige el grupo cual de los dos")
  retos.add("Tumbate en la entrepierta del jugador que elija el grupo durante una ronda, elige el grupo cual de los dos")

  retos.add("Perrea al jugador de la derecha")
  retos.add("Perrea al jugador de la izquierda")
  retos.add("Perrea al jugador frente a tí, si sois impares, elige el grupo cual de los dos")
  retos.add("Perrea al jugador que elija el grupo")

  retos.add("Besa la parte del cuerpo que eliga el grupo al jugador de la derecha")
  retos.add("Besa la parte del cuerpo que eliga el grupo al jugador de la izquierda")
  retos.add("Besa la parte del cuerpo que eliga el grupo al jugador frente a tí, si sois impares, elige el grupo cual de los dos")
  retos.add("Besa la parte del cuerpo que eliga el grupo al jugador que elija el grupo")

  retos.add("Lame la espalda del jugador de la derecha de forma sensual por debajo de la ropa")
  retos.add("Lame la espalda del jugador de la izquierda de forma sensual por debajo de la ropa")
  retos.add("Lame la espalda del jugador frente a tí de forma sensual por debajo de la ropa, si sois impares, elige el grupo cual de los dos")
  retos.add("Lame la espalda del jugador que elija el grupo de forma sensual por debajo de la ropa")

  retos.add("Haz un recorrico de besos sensuales desde el abdomen hasta la ingle al jugador de la derecha")
  retos.add("Haz un recorrico de besos sensuales desde el abdomen hasta la ingle al jugador de la izquierda")
  retos.add("Haz un recorrico de besos sensuales desde el abdomen hasta la ingle al jugador frente a tí, si sois impares, elige el grupo cual de los dos")
  retos.add("Haz un recorrico de besos sensuales desde el abdomen hasta la ingle al jugador que elija el grupo")

  retos.add("Junto a la persona que está frente a tí, debeís idear un reto para el resto de los jugadores")

  retos.add("Todos los jugadores cambian de sitio")

  retos.add("El grupo elige un reto extrmo par tí")

  retos.add("¡Solo! con las manos, pon la piel de gallina a otro jugador del sexo opuesto elegido por el grupo")

  retos.add("Da un masaje a un jugador del sexo opuesto, el cual crees que más lo necesita, durante 5 minutos")

  retos.add("Haz un striptease")

  retos.add("Sientate encima del jugador que el grupo elija dando la espalda al grupo")

  retos.add("Cambia una prenda de ropa a elegir por el grupo con un persona del sexo opuesto, tambíen elegida por el grupo")

  retos.add("Besa a dos jugadores a la vez, elegidos por el grupo")

  retos.add("Elige dos jugadores que deberán besarse")



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
  val help = findViewById<Button>(R.id.btn_help)
  help.setOnClickListener {
   val n_retos = retos.count()
   val n_verdades = verdades.count()
   Toast.makeText(applicationContext, "Retos: $n_retos, Verdades: $n_verdades. \n Si no cumples los retos deberás quitarte una prenda",Toast.LENGTH_LONG).show()

  }

  val btn_alcahueta = findViewById<Button>(R.id.btn_invisible)
  btn_alcahueta.setOnClickListener{
   val reto_alcahueta = "Da un beso con lengua al jugador que elija el grupo"
   addNuevo(reto_alcahueta)
  }


 }
}