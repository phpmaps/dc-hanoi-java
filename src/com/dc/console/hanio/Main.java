package com.dc.console.hanio;

import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int moves = 0;
        char startPeg = 'A';
        char endPeg = 'C';
        char tempPeg = 'B';

        Scanner input = new Scanner(System.in);
        out.print("Enter number of disks : ");

        int totalDisks = input.nextInt();
        System.out.println("Processing " + totalDisks + " disks.");

        solve(totalDisks, startPeg, endPeg, tempPeg);
        System.out.println("Total number of moves: " + Math.round((Math.pow(2, totalDisks) - 1)));
    }

    private static void solve(int n, char startPeg, char endPeg, char tempPeg) {
        if (n > 0) {
            solve(n - 1, startPeg, tempPeg, endPeg);
            System.out.printf("Move disk from %c to %c\n", startPeg, endPeg);
            solve(n - 1, tempPeg, endPeg, startPeg);
        }
    }
}
