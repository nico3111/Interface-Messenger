package com.company;

public class WhatsApp implements ISendMessage{
    String[] messages;
    int counter = 0;
    public WhatsApp(int countOfMessages){
        messages = new String[countOfMessages];
    }

    @Override
    public void sendMessage(String message) {
        messages[counter] = "WhatsApp: " + message;
        counter++;
    }

    @Override
    public String[] getMessages() {
        return messages;
    }
}
