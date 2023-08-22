package com.project.domain.DTO.Search;

import lombok.Builder;
import lombok.Data;

@Data
public class MemberSearch {

    private String name;
    private String gender;
    private String skillLevel;
    private String joinDate;
    private String exitDate;

    @Builder
    public MemberSearch(String name, String gender, String skillLevel, String joinDate, String exitDate) {
        this.name = name;
        this.gender = gender;
        this.skillLevel = skillLevel;
        this.joinDate = joinDate;
        this.exitDate = exitDate;
    }
}
