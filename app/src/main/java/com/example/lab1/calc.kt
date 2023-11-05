package com.example.lab1

import kotlin.random.Random

fun generateVector(len:Int):ArrayList<Int>{
    val vector : ArrayList<Int> = ArrayList()
    for(it in 0..len-1){
        vector.add(Random.nextInt(-10,10))
    }
    return vector
}

fun calculate(vectorA: ArrayList<Int>, vectorB: ArrayList<Int>):Int{
    var sum:Int = 0;

    for(it in 0..vectorA.size-1){
        sum+=vectorA[it] * vectorB[it]
    }

    return sum
}

