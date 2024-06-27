package com.example.admin_service.controller;

import com.example.admin_service.entity.EntityReg;
import com.example.admin_service.model.EntityRegModel;
import com.example.admin_service.response.EntityResponse;
import com.example.admin_service.response.EntityResponseback;
import com.example.admin_service.services.EntityRegService;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class EntityMappingController {

    private final  EntityRegService entityRegService;
    public EntityMappingController(EntityRegService entityRegService) {
        this.entityRegService = entityRegService;
    }
//    @GetMapping ("/getVisitedHospitalDetails/{pid}")
@GetMapping ("/getVisitedHospitalDetails/{pid}")
    public ResponseEntity<EntityResponseback> getEntityById(@PathVariable String pid ) {
//    Object obj= JSONValue.parse(s);
//
//    JSONObject jsonObject = (JSONObject) obj;
//    String pid = (String) jsonObject.get("pid");
//    System.out.println(pid);
//        String pid="PAT01";
        EntityResponseback entityResponse =new EntityResponseback();
        entityResponse.setEntityRegs(entityRegService.getEntityById(pid));
        entityResponse.setPid(pid);
        return ResponseEntity.ok(entityResponse);
    }

}

