package com.daniel.recordvslombok;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    Map<String, User> users = new HashMap<>();
    Map<String, UserRecord> usersRecord = new HashMap<>();

    // Utilizando Lombok
    public void createUser(User user) {
        users.put(user.getName(), new User(user.getName(), user.getPassword(), user.getEmail()));
    }

    // Utilizando record - record são acessados usando a sintaxe de método, como
    // user.name(), é porque os records são projetados para serem portadores de
    // dados imutáveis e transparentes.
    public void createUser(UserRecord user) {
        users.put(user.name(), new User(user.name(), user.password(), user.email()));
    }

    /* No exemplo abaixo:
     * A diferença principal entre um Record e uma classe gerada pelo Lombok, como
     * no exemplo, está na forma como são definidos e tratados pelo compilador. Os
     * Records são uma nova feature da linguagem Java que simplifica a criação de
     * classes de dados imutáveis, transparentes e com métodos padrão como equals,
     * hashCode e toString. Por outro lado, o Lombok é uma biblioteca que utiliza
     * anotações para gerar automaticamente métodos como getters, setters,
     * construtores, equals e hashCode.
     */

    // Utilizando Lombok
    public User getUser(String name) {
        return users.get(name);
    }

    // Utilizando record
    public UserRecord getUserRecord(String name) {
        return usersRecord.get(name);
    }

}
