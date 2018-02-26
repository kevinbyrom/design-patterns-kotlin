package com.kevinbyrom.designpatterns.commands

class HelloCommand : Command {
    override fun execute(){
        println("Hello from the HelloCommand!")
    }
}