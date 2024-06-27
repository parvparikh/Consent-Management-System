package com.example.cms_service.repository;

import com.example.cms_service.entity.ConsentMappingEntity;
import com.example.cms_service.entity.Consent_Comp_key;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsentMappingRepository extends CrudRepository<ConsentMappingEntity, Consent_Comp_key> {
}
