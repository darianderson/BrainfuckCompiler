package com.brainfuck;

public class SquareBracketOff extends Command {

    char command = ']';

    public char getCommand() {
        return command;
    }

    @Override
    public void implementation() {
        String s = getLine();
        int c = getCell();
        byte[] array = getArray();
        int index = getIndex();
        int lineIndex = getLineIndex();

        if (array[index] != 0) {
            lineIndex--;
            while (c > 0 || s.charAt(lineIndex) != '[') {
                if (s.charAt(lineIndex) == ']') {
                    c++;
                } else if (s.charAt(lineIndex) == '[')
                    c--;
                lineIndex--;
            }
            lineIndex--;
        }
        setLineIndex(lineIndex);
        setCell(c);
    }
}
