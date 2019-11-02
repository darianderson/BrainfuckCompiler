package com.brainfuck;

import java.util.HashMap;
import java.util.Scanner;

public class Compiler {

    private static Scanner ob = new Scanner(System.in);
    private static HashMap<Character, Command> commands = new HashMap<>();

    static {
        commands.put('>', new SignMore());
        commands.put('<', new SignLess());
        commands.put('+', new Plus());
        commands.put('-', new Minus());
        commands.put('.', new Point());
        commands.put(',', new Comma());
        commands.put('[', new SquareBracketOn());
        commands.put(']', new SquareBracketOff());
    }

    public static void main(String[] args) {
        System.out.println("Enter code: ");
        String command = ob.nextLine();
        System.out.println("Output: ");
        interpret(command);
    }

    public static void interpret(String command) {

        Command.setLine(command);
        int i = 0;
        for (; i < command.length(); i = Command.getLineIndex()) {
            for (Character key : commands.keySet()) {
                if (command.charAt(i) == key) {
                    commands.get(key).implementation();
                    break;
                }
            }
        }
    }
}
