package com.brainfuck;

public class SignMore extends Command {

    char command = '>';

    public char getCommand() {
        return command;
    }

    @Override
    public void implementation() {
        int index = getIndex();
        if (index == ((getArray().length) - 1)) {
            setIndex(0);
        } else {
            setIndex(++index);
        }
        increaseLineIndex();
    }
}
