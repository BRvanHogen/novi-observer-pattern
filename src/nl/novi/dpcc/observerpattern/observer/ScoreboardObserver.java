package nl.novi.dpcc.observerpattern.observer;

import nl.novi.dpcc.observerpattern.domain.MatchStatistics;
import nl.novi.dpcc.observerpattern.domain.Message;

import java.util.LinkedHashMap;
import java.util.Map;

public class ScoreboardObserver implements Observer {

    private final Map<String, MatchStatistics> teams = new LinkedHashMap<>();


    @Override
    public void update(Message message) {

    }
}
