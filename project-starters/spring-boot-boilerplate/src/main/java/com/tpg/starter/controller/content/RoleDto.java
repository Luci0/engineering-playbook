package com.tpg.starter.controller.content;

public class RoleDto {

    private Long id;

    private String name;

    public RoleDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
