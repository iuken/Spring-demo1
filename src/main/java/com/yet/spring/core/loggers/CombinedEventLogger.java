package com.yet.spring.core.loggers;

import com.yet.spring.core.beans.Event;

import java.util.List;

public class CombinedEventLogger implements EventLogger{
    private List<EventLogger> loggers;

    public CombinedEventLogger(List<EventLogger> loggers) {
        this.loggers = loggers;
    }

    @Override
    public void logEvent(Event event) {
        for (EventLogger eventLogger : loggers) {
            eventLogger.logEvent(event);
        }
    }
}
