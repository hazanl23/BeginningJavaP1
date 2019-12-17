package com.suarez;

public class SeattleNeedle {
    public static final int Size = 4;

    public static void main(String[] args) {
        lines();
        top();
        bottom();
        lines();
        middle();
        top();
    }

    public static void lines() {
        for (int line = 1; line <= Size; line++) {
            for (int space = 1; space <= Size * 3; space++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void top() {
        for (int line = 1; line <= Size; line++) {
            for (int space = 1; space <= 3 * Size - 3 * line; space++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int colon = 1; colon <= 3 * line - 3; colon++) {
                System.out.print(":");
            }
            System.out.print("||");
            for (int colon = 1; colon <= 3*line- 3; colon++) {
                System.out.print(":");
            }
            System.out.println("\\__");
        }
        System.out.print("|");
        for(int quote = 1; quote<= 6*Size; quote++){
            System.out.print("\"");
        }
        System.out.println("|");

    }

    public static void bottom() {
        for (int line = 1; line <= Size; line++) {
            for (int space = 1; space <= 2*line-2; space++) {
                System.out.print(" ");
            }
            System.out.print("\\_/");
            for (int V = 1; V <= 3*Size- 2*line; V++) {
                System.out.print("\\/");
            }
            System.out.println("\\_/");
        }
    }

        public static void middle () {
            for (int line = 1; line <= 4*Size; line++){
                for(int space = 1; space <= 3*Size-3; space++){
                    System.out.print(" ");
                }
                System.out.println("|%%||%%|");
            }
        }
    }

