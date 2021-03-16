package com.wh.web_hospital.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;

public class Exception {
    private Integer Status;
    private LocalDateTime dateAndTime;
    private String title;
    private List<Field> fields;

        public static class Field {
            private String name;
            private String message;

            public Field(String name, String message){
                super();
                this.name = name;
                this.message = message;
            }

            public String getName(){
                return name;
            }

            public String getMessage(){
                return message;
            }

            public void setName(String name){
                this.name = name;
            }
            public void setMessage(String message){
                this.message = message;
            }

        }

    public Integer getStatus() {
        return this.Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public LocalDateTime getDateAndTime() {
        return this.dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Field> getFields() {
        return this.fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

}
