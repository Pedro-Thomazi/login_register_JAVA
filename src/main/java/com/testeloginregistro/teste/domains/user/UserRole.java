package com.testeloginregistro.teste.domains.user;

public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return role;
    }
}
