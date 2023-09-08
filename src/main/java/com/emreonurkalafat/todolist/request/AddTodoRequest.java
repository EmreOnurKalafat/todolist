package com.emreonurkalafat.todolist.request;

import java.time.LocalDateTime;

public class AddTodoRequest {
    private String content;
    private LocalDateTime date;

    public AddTodoRequest() {
    }

    public AddTodoRequest(String content, LocalDateTime date) {
        this.content = content;
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
