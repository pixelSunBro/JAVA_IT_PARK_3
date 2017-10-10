package com.company;

import java.util.Scanner;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        /*String channels[][] = new String[5][];
        channels[0] = new String[4];
        channels[1] = new String[4];
        channels[2] = new String[4];
        channels[3] = new String[4];
        channels[4] = new String[4];*/
        String program[] = new String[6];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            RemoteController.showChannels();
            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    for (int i = 0; i < program.length; i++) {

                    }
                }
            }
        }
    }
}
