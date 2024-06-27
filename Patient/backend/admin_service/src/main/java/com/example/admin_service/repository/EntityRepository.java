package com.example.admin_service.repository;

import com.example.admin_service.entity.EntityReg;
import com.example.admin_service.entity.EntityRes;
import com.example.admin_service.model.EntityRegModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("entityRepository")
public interface EntityRepository extends JpaRepository<EntityReg,String> {

//    @Query("select t.eid,t.ename,t.etype,t.eip,t.port from EntityReg  t join t.patientIds u where u.pid =:pid")
@Query("select new com.example.admin_service.entity.EntityRes(t.eid,t.ename,t.etype,t.eip,t.port) from EntityReg  t join t.patientIds u where u.pid =:pid")
    public List<EntityRes> getEntityById(@Param("pid") String pid);


}
