package com.brainfuck;

import java.util.Scanner;

public class Compiler {

    private static Scanner ob = new Scanner(System.in);

    private static Command[] commands = {new SignMore(), new SignLess(), new Plus(), new Minus(),
            new Point(), new Comma(), new SquareBracketOn(), new SquareBracketOff()};

    public static void main(String[] args) {
        System.out.println("Enter code: ");
        String command = ob.nextLine();
        System.out.println("Output: ");
        interpret(command);
    }

    public static void interpret(String command){
        int index = 0;

        Command.setLine(command);
        Command.setIndex(index);

        for (int i = 0; i < command.length(); i++) {

            switch (command.charAt(i)) {

                case '>':
                    commands[0].implementation();
                    break;
                case '<':
                    commands[1].implementation();
                    break;
                case '+':
                    commands[2].implementation();
                    break;
                case '-':
                    commands[3].implementation();
                    break;
                case '.':
                    commands[4].implementation();
                    break;
                case ',':
                    commands[5].implementation();
                    break;
                case '[':
                    Command.setLineIndex(i);
                    commands[6].implementation();
                    i = Command.getLineIndex();
                    break;
                case ']':
                    Command.setLineIndex(i);
                    commands[7].implementation();
                    i = Command.getLineIndex();
                    break;
            }
        }
    }

}
