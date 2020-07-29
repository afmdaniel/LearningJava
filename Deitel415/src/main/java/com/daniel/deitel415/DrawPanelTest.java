package com.daniel.deitel415;

import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args){
        // Cria um painel que contém nosso desenho
        DrawPanel panel = new DrawPanel();
        
        // Cria um novo quadro para armazenas o painel
        JFrame application = new JFrame();
        
        // Configura o fram para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel); // adiciona o painel ao frame
        application.setSize(500, 250); // configura o tamanho do frame
        application.setVisible(true); // torna o frame visivel
        
    }
    
}
