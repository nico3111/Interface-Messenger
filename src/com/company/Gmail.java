package com.company;

public class Gmail implements ISendMessage{
    String[] messages;
    int counter = 0;
    public Gmail(int countOfMessages){
        messages = new String[countOfMessages];
    }

    @Override
    public void sendMessage(String message) {
        messages[counter] = "Gmail: \t" + message;
        counter++;
    }

    @Override
    public String[] getMessages() {
        return messages;
    }
}