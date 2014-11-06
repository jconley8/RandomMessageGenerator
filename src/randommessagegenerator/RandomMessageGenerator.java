/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessagegenerator;

import java.util.*;

/**
 *
 * @author Josh
 */
public class RandomMessageGenerator {

    private List<String> messageList;

    public RandomMessageGenerator() {
        messageList = new ArrayList<>();
    }

    public void displayList() {
        for (String s : messageList) {
            System.out.println(s);
        }
    }

    public String getRandomMessage() {
        Random rnd = new Random(System.nanoTime());
        int num = rnd.nextInt(messageList.size());
        return messageList.get(num);
    }

    public void removeDupes() {
        Set<String> dupes = new HashSet<>(messageList);
        messageList = new ArrayList<>(dupes);
    }

    public void addMessage(String message) {
        messageList.add(message);
        removeDupes();
    }

    public void removeMessage(String message) {
        messageList.remove(message);
    }

    public List<String> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<String> messageList) {
        this.messageList = messageList;
    }

}
