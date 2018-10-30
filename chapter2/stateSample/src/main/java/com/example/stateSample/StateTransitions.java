package com.example.stateSample;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateTransitions {
    Map<State, Set<State>> allowed;

    {
        allowed = new HashMap<>();

        allowed.put(State.review, EnumSet.of(State.accept, State.passback));
        allowed.put(State.passback, EnumSet.of(State.review, State.finish));
        allowed.put(State.accept, EnumSet.of(State.doing, State.finish));
        allowed.put(State.doing, EnumSet.of(State.cancel, State.finish));
        allowed.put(State.cancel, EnumSet.of(State.doing, State.finish));
    }

    public boolean canTransit(State from, State to){
        Set<State> allowedStates = allowed.get(from);
        return allowedStates.contains(to);
    }
}