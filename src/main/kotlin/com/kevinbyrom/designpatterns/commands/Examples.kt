package com.kevinbyrom.designpatterns.commands


fun commandExample(args: Array<String>) {
    var cmd : Command

    cmd = HelloCommand()
    cmd.execute()

    cmd = FuncCommand({ println("Hello from FuncCommand!")})
    cmd.execute()
}
