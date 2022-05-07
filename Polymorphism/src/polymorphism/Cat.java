/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author ASUS
 */
public class Cat extends Animal {
    String Nm;
    public void speak(String Name) {
        Nm = Name;
        System.out.println(Name + " says Meaouwwww");
    }
}
