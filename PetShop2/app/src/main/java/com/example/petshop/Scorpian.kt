package com.example.petshop

class Scorpion(name:String, age: Int): Pet(name,age), Pettable{
    override fun speak(): String{
        return "hiss"
    }
    override fun pet(){
        error("error")
    }
}