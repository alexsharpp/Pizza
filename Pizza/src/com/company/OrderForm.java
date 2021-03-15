package com.company;

import javax.swing.*;

public class OrderForm {
    JFrame Order;

    static public void SignUpWindow(){
        OrderForm Form= new OrderForm();

    }
    public void Form(){
        Order = new JFrame();
        Order.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Order.setSize(600, 600);
        Order.setVisible(true);
        Order.setLayout(null);
        EnterNewUser();

    }

    public void EnterNewUser(){

        JLabel User = new JLabel("What would you like your username to be?");
        User.setBounds(50, 50, 300, 30);
        JTextField User2 = new JTextField("Enter here:");
        User2.setBounds(50, 100, 480, 30);
        JLabel Pass = new JLabel("What would you like your password to be?");
        Pass.setBounds(50, 150, 300, 30);
        JTextField Pass2 = new JTextField("Enter here:");
        Pass2.setBounds(50, 200, 480, 30);
        JButton Create = new JButton("Create account");
        Create.setBounds(50,250,480,50);

        signUp.add(User);
        signUp.add(User2);
        signUp.add(Pass);
        signUp.add(Pass2);
        signUp.add(Create);
    }

}

