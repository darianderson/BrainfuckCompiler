package com.brainfuck;

public class SquareBracketOn extends Command {

    char command = '[';

    public char getCommand() {
        return command;
    }


    @Override
    public void implementation() {
        int lineIndex = getLineIndex();
        String s = getLine();
        int c = getCell();
        int index = getIndex();
        byte[] array = getArray();

        if (array[index] == 0) {
            lineIndex++;
            while (c > 0 || s.charAt(lineIndex) != ']') {
                if (s.charAt(lineIndex) == '[') {
                    c++;
                }
                else if (s.charAt(lineIndex) == ']') {
                    c--;
                }
                lineIndex++;
            }
        }
        setLineIndex(lineIndex);
        setCell(c);
    }
}
