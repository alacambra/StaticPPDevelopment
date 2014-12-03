package com.poolingpeople.staticcdi;

import com.poolingpeople.commons.entities.Channel;
import com.poolingpeople.commons.entities.People;
import com.poolingpeople.commons.states.people.Completed;
import com.poolingpeople.commons.states.people.PeopleState;
import com.poolingpeople.persistence.daos.PeopleDao;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import java.util.UUID;

/**
 * Created by alacambra on 03.12.14.
 */
public class Hello {

    @Inject
    PeopleDao dao;

    @Inject
    Instance<People> peopleInstance;

    @Inject
    Instance<Channel> channelInstance;

    public void  create() {
        People people = peopleInstance.get();
        people.setState(new Completed());
        people.setChannel(channelInstance.get());
        people.setUuid(UUID.randomUUID().toString());
        people.setFamilyName("AL112");
        dao.create(people, people.getUuid());
    }
}
