package com.kevinbyrom.designpatterns.decorators

import sun.invoke.empty.Empty


typealias Action = () -> Unit


fun decoratorExample(args: Array<String>) {
    var fn : Action

    fn = decorate({ somethingToDecorate() })

    fn()
}


fun decorate(fn : Action) : Action {
    return fun() {
        println("Decorating before...")
        fn()
        println("Decorating after...")
    }
}


fun somethingToDecorate(){
    println("Some plain method")
}
