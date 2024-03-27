package com.creativeitlimited.quizapp

data class Quiz(val question:String,
                val option:List<String>,
                val correctAnswerIndex:Int) {

}