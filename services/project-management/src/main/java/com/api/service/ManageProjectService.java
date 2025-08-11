package com.api.service;

import com.api.dto.request.ProjectManagementRequest;
import com.api.dto.request.ProjectManagementResponse;

public interface ManageProjectService {
    ProjectManagementResponse createProject(ProjectManagementRequest request);
}
