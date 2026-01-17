package com.casino.domain;

public class Apuesta {

    private final double monto;
    private final String juego;
    private final String descripcion;

    private Apuesta(Builder builder) {
        this.monto = builder.monto;
        this.juego = builder.juego;
        this.descripcion = builder.descripcion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private double monto;
        private String juego;
        private String descripcion;

        private Builder() {}

        public Builder monto(double monto) {
            this.monto = monto;
            return this;
        }

        public Builder juego(String juego) {
            this.juego = juego;
            return this;
        }

        public Builder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Apuesta build() {
            return new Apuesta(this);
        }
    }
}
