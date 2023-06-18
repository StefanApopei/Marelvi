package com.ccf.marelvi.models;

import java.sql.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.ccf.marelvi.models.enums.EDepartment;
import com.ccf.marelvi.models.enums.EProjectStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Projects {

    @Id
    private String id;

    private String projectName;

    private EDepartment department;

    private User projectManager;

    private List<User> projectUsers;

    private EProjectStatus status;

    private Date startDate;

    private Date deadlineDate;
}
