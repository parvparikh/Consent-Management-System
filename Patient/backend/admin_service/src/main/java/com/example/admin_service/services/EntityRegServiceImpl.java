package com.example.admin_service.services;

import com.example.admin_service.entity.EntityReg;
import com.example.admin_service.entity.EntityRes;
import com.example.admin_service.repository.EntityRepository;
import com.example.admin_service.response.EntityResponse;
import com.example.admin_service.response.EntityResponseback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.Query;
import java.util.List;
@Transactional
@Service
public class EntityRegServiceImpl implements EntityRegService{
    @Autowired
    private EntityRepository entityRepository;

    @Override
    public List<EntityRes> getEntityById(String pid) {
        List<EntityRes> entityReg=null;

//        String q="select e from entity_reg  e JOIN entity_patient_mapping em on e.eid=em.eid  where em.pid="+pid;
        entityReg= entityRepository.getEntityById(pid);
        System.out.println(entityReg);
        return entityReg;
    }
}
