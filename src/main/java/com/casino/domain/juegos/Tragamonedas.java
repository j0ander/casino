package com.casino.domain.juegos;


import com.casino.domain.anotaciones.Proveedor;

@Proveedor(name = "tragamonedas")
public class Tragamonedas implements Juego {

    @Override
    public void iniciar() {}

    @Override
    public void jugar() {}
}
