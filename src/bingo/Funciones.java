/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bingo;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author gussr
 */
public class Funciones {
Random N = new Random();
int band = 0;
String c ="";
    public String RandNumeroB (){
ArrayList<Integer> arrayB = new <Integer>ArrayList();
    for(int i =0;i<15;i++){
    band =N.nextInt(15 - 1 +1) + 1;
            while (arrayB.contains(band)){
            band = N.nextInt(15 - 1+1) + 1;
            }
    arrayB.add(band);
    }
for(int j=0;j<arrayB.size();j++){
c+=arrayB.get(j)+" ";
}
return c;
}

public String RandNumeroI (){
ArrayList<Integer> arrayB = new <Integer>ArrayList();
    for(int i =0;i<15;i++){
    band =N.nextInt(31 - 16+1) + 16;
            while (arrayB.contains(band)){
            band = N.nextInt(31 - 16+1) + 16;
            }
    arrayB.add(band);
    }
for(int j=0;j<arrayB.size();j++){
c+=arrayB.get(j)+" ";
}
return c;
}

public String RandNumeroN(){
ArrayList<Integer> arrayB = new <Integer>ArrayList();
    for(int i =0;i<15;i++){
    band =N.nextInt(47 - 32+1) + 32;
            while (arrayB.contains(band)){
            band = N.nextInt(47 - 32+1) + 32;
            }
    arrayB.add(band);
    }
for(int j=0;j<arrayB.size();j++){
c+=arrayB.get(j)+" ";
}
return c;
}

public String RandNumeroG(){
ArrayList<Integer> arrayB = new <Integer>ArrayList();
    for(int i =0;i<15;i++){
    band =N.nextInt(62 - 48+1) + 48;
            while (arrayB.contains(band)){
            band = N.nextInt(62 - 48+1) + 48;
            }
    arrayB.add(band);
    }
for(int j=0;j<arrayB.size();j++){
c+=arrayB.get(j)+" ";
}
return c;
}
public String RandNumeroO(){
ArrayList<Integer> arrayB = new <Integer>ArrayList();
    for(int i =0;i<12;i++){
    band =N.nextInt(75 - 63+1) + 63;
            while (arrayB.contains(band)){
            band = N.nextInt(75 - 63+1) + 63;
            }
    arrayB.add(band);
    }
for(int j=0;j<arrayB.size();j++){
c+=arrayB.get(j)+" ";
}
return c;
}
}
