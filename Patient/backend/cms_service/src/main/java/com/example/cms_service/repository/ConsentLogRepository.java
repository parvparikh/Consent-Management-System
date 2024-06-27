package com.example.cms_service.repository;

import com.example.cms_service.entity.ConsentLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsentLogRepository extends JpaRepository<ConsentLogEntity,String> {
}
