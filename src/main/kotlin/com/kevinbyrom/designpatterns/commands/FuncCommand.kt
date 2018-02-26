package com.kevinbyrom.designpatterns.commands


class FuncCommand(f : () -> Unit) : Command {
    val executeFn = f

    override fun execute(){
        this.executeFn()
    }
}