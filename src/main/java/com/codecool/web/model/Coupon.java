package com.codecool.web.model;

public final class Coupon extends AbstractModel {

    private final String name;
    private final int percentage;
    private final int userId;

    public Coupon(int id, String name, int percentage, int userId) {
        super(id);
        this.name = name;
        this.percentage = percentage;
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
