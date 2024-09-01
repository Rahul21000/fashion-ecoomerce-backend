package com.travelltrip.transporthub.repository;

import com.travelltrip.transporthub.model.WhisList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WhistListRepository extends JpaRepository<WhisList,Long> {
}
