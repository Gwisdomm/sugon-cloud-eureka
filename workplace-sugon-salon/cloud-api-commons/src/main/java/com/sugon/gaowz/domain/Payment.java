package com.sugon.gaowz.domain;

/**
 * @program: workplace-sugon-salon
 * @description:
 * @date: 22:32 2021/4/18
 * @author: gaowz
 **/
public class Payment {
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
