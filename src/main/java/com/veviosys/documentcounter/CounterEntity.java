package com.veviosys.documentcounter;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CounterEntity {


    @Id
    private Long id = 0L;
    private Long currentCount=0L;

    public CounterEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Long currentCount) {
        this.currentCount = currentCount;
    }






}
