package jp.techacademy.daichi.miyuki.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    //
    override fun onCreate(savedInstanceState: Bundle?) {
        //        
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("太郎", 10,"")
        human.say()
        Log.d("kotlintest", "私の名前は" + human.name + "です。"+"年は"+ human.age+"です。")

        val human2= Human("梨花", 11,"")
        human.say()
        Log.d("kotlintest", "私の名前は" + human2.name + "です。"+"年は"+ human2.age+"です。")


        val hobby =Human("",0,"プログラミング")
        hobby.think()

        val hobby2 =Human("",0,"kotlin")
        hobby2.think()
     }
}