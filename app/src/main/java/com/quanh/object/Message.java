/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quanh.object;


/**
 *
 * @author The
 */
public class Message {
    int messageId;
    String sender;
    String receiver;
    String content;
    int status;

    public Message() {
    }

    public Message(int messageId, String sender, String receiver, String content, int status) {
        this.messageId = messageId;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.status = status;
    }

    public int getMessageId() {
        return messageId;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public int getStatus() {
        return status;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    
    
}
