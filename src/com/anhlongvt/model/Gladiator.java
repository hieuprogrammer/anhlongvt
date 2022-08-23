package com.anhlongvt.model;

import java.util.Objects;
import java.util.Set;

public class Gladiator {
    private String name;
    private int hp;
    private int atk;
    private int def;
    private Set<Type> types;

    public Gladiator() {
    }

    public Gladiator(String name, int hp, int atk, int def, Set<Type> types) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Set<Type> getTypes() {
        return types;
    }

    public void setTypes(Set<Type> types) {
        this.types = types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gladiator)) return false;
        Gladiator gladiator = (Gladiator) o;
        return getHp() == gladiator.getHp() && getAtk() == gladiator.getAtk() && getDef() == gladiator.getDef() && Objects.equals(getTypes(), gladiator.getTypes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getAtk(), getDef(), getTypes());
    }
}