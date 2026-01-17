package com.casino.application.factory;

public interface IFactory {
    <T> T createFactory(String name);
    void init(String pkgName);
}

