/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessagegenerator;

/**
 *
 * @author Josh
 */
public class Startup {

    public static void main(String[] args) {
        RandomMessageGenerator m = new RandomMessageGenerator();
                
        m.addMessage("Cat");
        m.addMessage("Dog");
        m.addMessage("Bird");
        m.addMessage("Snake");
        m.addMessage("Elephant");
        m.addMessage("Hamster");
        m.addMessage("Cat");
        
//        System.out.println("List with dupes:");
//        m.displayList();
//        
//        m.removeDupes();
//        System.out.println("List w/o dupes:");
//        m.displayList();
        
//        System.out.println(m.getRandomMessage());
        
        m.removeMessage("Dog");
        m.displayList();
        
    }
    
}
