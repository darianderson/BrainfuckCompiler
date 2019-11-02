package com.brainfuck;

public abstract class Command {

    private static int index;
    private static byte[] array = new byte[65535];
    private static String line;
    private static int lineIndex;
    private static int cell;


    public static int getCell() {
        return cell;
    }
    public static void setCell(int cell) {
        Command.cell = cell;
    }

    public static int getLineIndex(){
        return lineIndex;
    }
    public static void setLineIndex(int i){
        lineIndex = i;
    }

    public int getIndex() {
        return index;
    }
    public static void setIndex(int i) {
        index = i;
    }

    public static String getLine(){
        return line;
    }
    public static void setLine(String l){
        line = l;
    }

    public static void setElement(byte element){
        array[index] = element;
    }

    public static byte[] getArray() {
        return array;
    }

    public static void increaseLineIndex(){
        ++lineIndex;
    }

    public abstract void implementation();

}
