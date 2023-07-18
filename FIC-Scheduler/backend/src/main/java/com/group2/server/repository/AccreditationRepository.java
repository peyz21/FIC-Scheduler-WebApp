package com.group2.server.repository;

import com.group2.server.model.Accreditation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccreditationRepository extends JpaRepository<Accreditation, Integer> {
    Accreditation findByName(String name);
}
