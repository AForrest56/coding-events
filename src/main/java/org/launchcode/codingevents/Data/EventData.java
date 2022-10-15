package org.launchcode.codingevents.Data;

import org.launchcode.codingevents.Models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //need a place to put events
    private static final Map<Integer, Event> events = new HashMap<>();
    //behaviors
        // get all events
    public static Collection<Event> getAll(){
        return events.values();
    }
        // get 1 event
    public static Event getById(int id){
        return events.get(id);
    }
        // add event
    public static void add(Event event){
        events.put(event.getId(), event);
    }
        //remove event
    public static void remove(int id){
        events.remove(id);
    }
}
