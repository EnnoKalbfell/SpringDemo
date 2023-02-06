package com.howto.demouser.repository;

import com.howto.demouser.model.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Costumer, Long> {
}
