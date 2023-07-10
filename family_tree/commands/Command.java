package family_tree.commands;

import family_tree.Console

public abstract class Command implements Option {
     private Console console;

    public Command(Console console) {
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }
}
