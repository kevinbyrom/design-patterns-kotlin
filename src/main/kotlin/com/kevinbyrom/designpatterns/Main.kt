package com.kevinbyrom.designpatterns


import com.kevinbyrom.designpatterns.commands.*
import com.kevinbyrom.designpatterns.decorators.*


typealias MainFunc = (args: Array<String>) -> Unit


fun main(args: Array<String>) {
    executeExample(args, commandExample)
    executeExample(args, decoratorExample)
    println("Execution finished")
}


fun executeExample(args: Array<String>, fn : (args: Array<String>) -> Unit) {
    println("----------------------")
    fn(args)
}


fun asdf (args: Array<String>, fn : MainFunc) : MainFunc {
    return fun(args: Array<String>) {
        println("----------------------")
        fn(args)
    }
}
