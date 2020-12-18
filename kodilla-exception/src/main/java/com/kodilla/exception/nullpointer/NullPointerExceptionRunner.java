package com.kodilla.exception.nullpointer;

import jdk.swing.interop.SwingInterOpUtils;

public class NullPointerExceptionRunner {

    public static void main (String[] args){
        User user = null;

        MessageSander messageSander = new MessageSander();
        try {
            messageSander.sendMessageTo(user, "Hello");
        } catch (MessageNotSentException e) {
            System.out.println("Message is not send, " + "but my program still running very well1");
        }
        System.out.println("Processing other logic!");
    }
}
