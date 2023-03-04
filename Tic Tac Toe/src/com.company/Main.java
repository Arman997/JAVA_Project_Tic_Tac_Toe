package com.company;
import javax.swing.*;
import java.awt.*;
import static java.awt.SystemColor.window;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start the Game");
       JFrame window = new JFrame("Tic Tac Toe");//mer glxavor patuhan@
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // es vor karoxananq pakel pacvac patuhan@
        window.setSize(400,400); //chapser@
        window.setLayout(new BorderLayout()); // sranov karavarelu enq dasavorvacutyun@
        window.setLocationRelativeTo(null); // vor bacvox patuhan@ lini ekrani mechtexum
        window.setVisible(true); // sranovel nencenq anum vor patuhan@ tesaneli lini
        TicTacToe game = new TicTacToe();
        window.add(game);
        System.out.println("Game over");

        
    }
}