package com.howto.demouser.repository;

import com.howto.demouser.model.Purchases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Purchases, Long> {
}
