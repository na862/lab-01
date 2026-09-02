package com.example.petshop

class Sad(date:String): Mood(date){
    override fun whichMood():String{
        return "Sad"
    }
}