package com.example.interactivetelecomhistory;

public class HistoricalEvent {
    private final int year;
    private final String title;
    private final String description;

    public HistoricalEvent(int year, String title, String description) {
        this.year = year;
        this.title = title;
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
