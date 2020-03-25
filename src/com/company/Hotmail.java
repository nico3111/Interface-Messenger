package com.company;

public class Hotmail implements ISendMessage{
    String[] messages;
    int counter = 0;
    public Hotmail(int countOfMessages){
        messages = new String[countOfMessages];
    }

    @Override
    public void sendMessage(String message) {
        messages[counter] = "Hotmail: " + message;
        counter++;
    }

    @Override
    public String[] getMessages() {
        return messages;
    }
}
