/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kungfupandacharacters;

/**
 * Kungfu Panda Characters  
 * @author Mutya Qurratu'ayuni Mustafa
 */
public class KungfuPandaCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Characters character1 = new Characters();
        Characters character2 = new Characters();
        
        character1.name = "Po";
        character1.species = "Giant Panda";
        character1.eyeColor = "Green";
        character1.age = 20;
        character1.height = 157;
        character1.weight = 260;
        character1.printStates();
        
        character2.name = "Shifu";
        character2.species = "Red Panda";
        character2.eyeColor = "Blue";
        character2.age = 60;
        character2.printStates();
    }
    
}
