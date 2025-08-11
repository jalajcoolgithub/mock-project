package com.api.controller;

import com.api.common.RestResponse;
import com.api.dto.request.ProjectManagementRequest;
import com.api.dto.request.ProjectManagementResponse;
import com.api.service.ManageProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/projects/")
public class ManageProjectController {

    @Autowired
    private ManageProjectService manageProjectService;

    @GetMapping("v1/get")
    public ResponseEntity<RestResponse<String>> getProject() {
        RestResponse<String> response = new RestResponse<>("Success", "Project data", null);
        return ResponseEntity.ok(response);
    }

    @GetMapping("v1/get/all")
    public ResponseEntity<RestResponse<String>> getAllProjects() {
        RestResponse<String> response = new RestResponse<>("Success", "Project data", null);
        return ResponseEntity.ok(response);
    }

    @PostMapping("v1/create")
    public ResponseEntity<RestResponse<String>> createProject(@RequestBody ProjectManagementRequest request) {
        ProjectManagementResponse res = manageProjectService.createProject(request);
        RestResponse<String> response = new RestResponse<>("Success", "Project data", null);
        return ResponseEntity.ok(response);
    }

    @PostMapping("v1/update")
    public ResponseEntity<RestResponse<String>> updateProject() {
        RestResponse<String> response = new RestResponse<>("Success", "Project data", null);
        return ResponseEntity.ok(response);
    }

    @PostMapping("v1/delete")
    public ResponseEntity<RestResponse<String>> deleteProject() {
        RestResponse<String> response = new RestResponse<>("Success", "Project data", null);
        return ResponseEntity.ok(response);
    }
}
