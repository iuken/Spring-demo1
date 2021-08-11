package com.yet.spring.core.beans;

import java.text.DateFormat;

import java.time.LocalTime;
import java.util.Date;

public class Event {
    private DateFormat df;
    private int id;
    private int uniqueId = 0;
    private String msg;
    private Date data;

    public Event(int id, Date data, String msg) {
        this.id = id;
        this.msg = msg;
        this.data = data;
    }

    public Event(Date data, DateFormat df) {
        this.id = getUniqueId();
        this.data = data;
        this.df = df;
    }

    private int getUniqueId() {
        return uniqueId++;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                ", id=" + id +
                ", data=" + df.format(data) +
                ", msg='" + msg + '\'' +
                '}';
    }

    public static boolean isDay(){
        return (LocalTime.now().getHour() < 17 && LocalTime.now().getHour()  > 8);
    }
}
