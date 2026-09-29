/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kfcmenu;

import javax.swing.*;
/**
 *
 * @author acer
 */
public class KFCFoods extends JFrame{
    
    private JLabel hdrKFC, lblchicken, lblburger, lblfries, lblsoda, lblpotato;
    private JButton btnaddchicken, btnminuschicken, btnaddburger, btnminusburger, btnaddfries, 
                    btnminusfries, btnaddsoda, btnminussoda, btnaddpotato, btnminuspotato;
    private JComboBox<String> cmbchicken, cmbburger, cmbfries, cmbsoda, cmbpotato;
    private JTextArea txtSummary;
    
    
KFCFoods(){
    setSize(600, 600);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    hdrKFC = new JLabel("KFC MENU");
    hdrKFC.setBounds(250, 50, 100, 30);
    add(hdrKFC);
    
    lblchicken = new JLabel("Chicken");
    lblchicken.setBounds(100, 100, 100, 30);
    add(lblchicken);
    
    lblburger = new JLabel("Burger");
    lblburger.setBounds(100, 100, 120, 30);
    add(lblburger);
    
    
    
    }
}
