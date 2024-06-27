package com.example.admin_service.services;

import com.example.admin_service.entity.EntityReg;
import com.example.admin_service.entity.EntityRes;
import com.example.admin_service.response.EntityResponse;
import com.example.admin_service.response.EntityResponseback;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EntityRegService {
   List<EntityRes> getEntityById(String pid);
}
