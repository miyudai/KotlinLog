package jp.techacademy.daichi.miyuki.kotlinlog
import android.util.Log

open class Human:Animal,Thinkable {

    constructor(name: String, age: Int): super(name, age) {

    }

   override fun say(){
        Log.d("kotlintest", "私の名前は" + this.name + "です。"+"年は"+ this.age+"です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は"+this.name+"について考える。")
    }

}