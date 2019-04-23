package com.amisoft.training.controller;

import com.amisoft.training.dao.AttendeeDao;
import com.amisoft.training.entity.Attendee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/attendee")
public class AttendeeController {

    @Autowired
    AttendeeDao attendeeDao;



    @GetMapping("/")
    public String index() {

           return "Attendee Service";

    }

    @PostMapping("/addAttendee")
    public String addAttendee(@RequestBody Attendee attendee) {

        attendeeDao.save(attendee);

        return "Attendee saved successfully :" + attendee.getFirstName();

    }

    @GetMapping("/findAllAttendee")
    public List<Attendee> fetchAllAttendee() {

        List<Attendee> attendeeList = (List<Attendee>) attendeeDao.findAll();
        return attendeeList;

    }

    @DeleteMapping("/deleteAllAttendee")
    public String deleteAllAttendee() {

        attendeeDao.deleteAll();

        return "All attendee have been deleted :";

    }

}
