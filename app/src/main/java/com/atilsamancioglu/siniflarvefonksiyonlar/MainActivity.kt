package com.atilsamancioglu.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var j = -10

        if (j == 0) {
            ilkFonksiyon()
        } else {
            ikinciFonksiyon()
        }

        cikarma(500,20)
        var x = toplama(10,20)
        textView.text = "Sonuç : ${x}"


        button.setOnClickListener {
            val toplamaSonucu = toplama(10,50)
            textView.text = "Sonuç: ${toplamaSonucu}"
        }

        sinifCalismasi()
        nullGuvenligi()


    }

    fun ilkFonksiyon() {
        println("ilk fonksiyon çalıştırıldı")
    }

    fun ikinciFonksiyon() {
        println("ikinci fonksiyon çalıştırıldı")
    }

    //Girdi Almak

    fun cikarma(x: Int, y:Int){
        textView.text = "Sonuç: ${x-y}"
    }

    //Çıktı Vermek -> Döndürmek (Return)

    fun toplama(a: Int, b:Int) : Int {
        return a + b
    }

    /*
    fun degistir(view : View){
        val toplamaSonucu = toplama(10,50)
        textView.text = "Sonuç: ${toplamaSonucu}"
    }

     */

    fun sinifCalismasi(){

        var superman = Superkahraman("Superman",50,"Gazeteci")
        textView.text = "Yaş: ${superman.yas}"
        superman.testFonksiyonu()
        println(superman.sacRenginiAl())
    }

    fun nullGuvenligi(){
        //Null, Nullability, Null Safety

        //Tanımlama, Definening
        var benimString : String?

        //Initialization
        benimString = "Atıl"

        var benimYasim : Int? = null
        println(benimYasim)

        //benimYasim = 2

        //1
        if (benimYasim != null){
            println(benimYasim * 2)
        } else {
            println("null geldi")
        }

        //2
        // !! -> null olmayacak, ? -> null olabilir
        println(benimYasim?.minus(2))

        //3
        //elvis operatörü

        //benimYasim = 10
        val sonuc = benimYasim?.minus(2) ?: 10
        println(sonuc)

        //4
        //let
        //benimYasim = 5
        benimYasim?.let {
            println(it * 5)
        }

    }


}