package com.daniel.recordvslombok;

public record UserRecord(
        String name,
        String password,
        String email) {

    public UserRecord {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("O nome de usuário não pode ser nulo ou em branco");
        }

        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("A senha não pode ser nula ou em branco");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("O e-mail não pode ser nulo ou em branco");
        }
    }

}
