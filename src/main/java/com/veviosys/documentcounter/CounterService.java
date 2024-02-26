package com.veviosys.documentcounter;


import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CounterService {

    final private CounterRepository counterRepository;

    public CounterService(CounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }

    public void increaseCount(Long countToAdd){
        if(!Objects.isNull(countToAdd) && countToAdd>0){
            counterRepository.increaseCount(countToAdd);
        }else{
            counterRepository.increaseCount(1L);
        }
    }

    public Long currentValue() {
       return counterRepository.findById(0L).get().getCurrentCount();
    }
}
