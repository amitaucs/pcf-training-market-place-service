package com.amisoft.training.dao;

import com.amisoft.training.entity.Attendee;
import org.springframework.data.repository.CrudRepository;

public interface AttendeeDao extends CrudRepository<Attendee,Long> {

    Attendee findAttendeeByFirstName(String firstName);
}
