package org.example.tranajo_clase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.io.IOException;
import java.security.Key;

public class HelloApplication  {


    public static void main(String[] args) {
        try{
            String name [] ={"Mateo","Andrew"};
            String newName = name [2];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("THE INDEX OUT DOESN´T EXIST");
        }

        try{
            int numerador;
            numerador=10;
            int denominador;
            denominador =0;
            int resultado;
            resultado=(numerador/denominador);
            System.out.println("La division es: "+resultado);

        }catch (ArithmeticException e){
          //  System.out.println("LA DIVISION PARA CERO ES INDETERMINADA, ANDREW CHUPALO");
            System.out.println(e.getMessage());

        }

    }

}