package polymorphism;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Animal {
   String Nm;
    public void speak() {
        System.out.println("Animal is barking");
    }
    public void speak(String Name) {
        Nm = Name;
        System.out.println(Name + " says barking");
    }
}
