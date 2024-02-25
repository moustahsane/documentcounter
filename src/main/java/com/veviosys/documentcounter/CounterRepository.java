package com.veviosys.documentcounter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface CounterRepository extends JpaRepository<CounterEntity,Long> {

    @Query(value = "update counter_entity set current_count = current_count + :newcount ", nativeQuery = true)
    @Modifying
    @Transactional
    void increaseCount(@Param("newcount") Long newCount);

}
