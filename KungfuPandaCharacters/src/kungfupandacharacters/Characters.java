/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kungfupandacharacters;

/**
 *
 * @author ASUS
 */
public class Characters {
    /*Defining Attributes*/
    String name = "Animal";
    String species;
    String eyeColor;
    int height;
    int weight;
    int age;
    
    void printStates(){
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("height: " + height + " cm" + "\t Weight: " + weight + " lbs" +"\t age: " + age);
    }
}
