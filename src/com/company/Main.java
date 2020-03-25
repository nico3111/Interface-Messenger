package com.company;

public class Main {

    public static void main(String[] args) {

        Slack slack = new Slack(10000);
        slack.sendMessage("Hallo Slack");
        slack.sendMessage("Good morning");

        WhatsApp whatsdepp = new WhatsApp(10);
        whatsdepp.sendMessage("Hello Whatsapp");

        Hotmail hotmail = new Hotmail(50);
        hotmail.sendMessage("Was geht hotmail?");

        Gmail gmail = new Gmail(50);
        gmail.sendMessage("Hello gmail");

        ISendMessage[] messengers = new ISendMessage[10];
        messengers[0] = slack;
        messengers[1] = whatsdepp;
        messengers[2] = hotmail;
        messengers[3] = gmail;

        for (ISendMessage messenger :
                messengers) {
            if (messenger != null) {
                String[] myMessages = messenger.getMessages();

                for (int i = 0; i < myMessages.length; i++) {
                    if (myMessages[i] != null && !myMessages[i].isBlank() && !myMessages[i].isEmpty()) {
                        System.out.println(myMessages[i]);
                    }
                }
            }
        }
    }
}
