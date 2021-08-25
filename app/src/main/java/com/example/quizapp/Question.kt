package com.example.quizapp

data class Question (
    //Not specific function, just data information feature
    val id: Int,
    val question: String,
    val img: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int

)