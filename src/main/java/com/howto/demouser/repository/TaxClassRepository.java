package com.howto.demouser.repository;


import com.howto.demouser.model.TaxRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxClassRepository extends JpaRepository<TaxRate, Long> {
}
