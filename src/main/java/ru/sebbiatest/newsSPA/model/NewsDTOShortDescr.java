package ru.sebbiatest.newsSPA.model;

import org.springframework.stereotype.Component;

public class NewsDTOShortDescr {

    private Long id;

    private String shortDescr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortDescr() {
        return shortDescr;
    }

    public void setShortDescr(String shortDescr) {
        this.shortDescr = shortDescr;
    }

    public NewsDTOShortDescr(Long id, String shortDescr) {
        this.id = id;
        this.shortDescr = shortDescr;
    }

    public NewsDTOShortDescr() {
    }
}
