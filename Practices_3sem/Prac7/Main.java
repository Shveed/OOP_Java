package com.company;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> deck = new ArrayList<>();
        int n = 10, k = 0;
        for (int i = 0; i < n; i++){ deck.add(i); }
        Collections.shuffle(deck);
        System.out.println(deck);
        ArrayDeque<Integer> p1 = new ArrayDeque<>();
        ArrayDeque<Integer> p2 = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            if (i % 2 == 0){ p1.add(deck.get(i)); }
            else { p2.add(deck.get(i)); }
        }
        System.out.println();
        System.out.println(p1);
        System.out.println(p2);
        while(!p1.isEmpty() && !p2.isEmpty()) {
            if (k < 106) {
                k++;
                if (p1.getFirst() > p2.getFirst() && !zero_nine(p1.getFirst(), p2.getFirst())) {
                    p2.addLast(p1.pollFirst());
                } else { p1.addLast(p2.pollFirst()); }
                System.out.println("Step #" + k);
                System.out.println("Current Deck of Player 1: " + p1);
                System.out.println("Current Deck of Player 2: " + p2);
            }
            else{
                System.out.println("bolda");
                break;
            }
        }
        System.out.println();
        if(p1.isEmpty()){ System.out.println("Player 1 won the game!"); }
        else{ System.out.println("Player 2 won the game!"); }
    }
    public static boolean zero_nine(int e1, int e2){
        if((e1 == 0) && (e2 == 9)){ return true; }
        else { return false; }
    }
}
