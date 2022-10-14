package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

   // private static List<String> events = new ArrayList<>();
    private static HashMap<String, String> events = new HashMap<String, String>();

    @GetMapping
    public String displayAllEvents(Model model) {
        events.put("Coders Unite", "A meet up for those coders who consider themselves the best.");
        events.put("Java, JavaScript and Java", "A gathering of coders with coffee included.");
        events.put("Where are they now?", "An event where you can learn about where the coders of the past have gone.");

        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

//    @PostMapping("create")
//    public String processCreateEventForm(@RequestParam String eventName) {
//        events.add(eventName);
//        return "redirect:";
//    }

}