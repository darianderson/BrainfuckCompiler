package com.brainfuck;

public class SignLess extends Command {

    char command = '<';

    public char getCommand() {
        return command;
    }

    @Override
    public void implementation() {
        int index = getIndex();
        if (index == 0) {
            setIndex(getArray().length - 1);
        } else {
            setIndex(--index);
        }
        increaseLineIndex();
    }
}
