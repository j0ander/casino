package com.casino.application.config;
//SINGLETON

public class CasinoConfig {

    private static CasinoConfig instance;

    private CasinoConfig() {}

    public static CasinoConfig getInstance() {
        if (instance == null) {
            instance = new CasinoConfig();
        }
        return instance;
    }
}
