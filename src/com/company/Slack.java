package com.company;

public class Slack implements ISendMessage {
    String[] messages;
    int counter = 0;
    public Slack(int countOfMessages){
        messages = new String[countOfMessages];
    }

    @Override
    public void sendMessage(String message) {
        messages[counter] = "Slack: \t" + message;
        counter++;
    }

    @Override
    public String[] getMessages() {
        return messages;
    }
}
