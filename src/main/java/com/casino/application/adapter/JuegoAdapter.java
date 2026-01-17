package com.casino.application.adapter;
// SOLO si hace falta

/**
 * =========================
 * DadosAdapter
 * =========================
 *
 * Tipo:
 * - Clase concreta
 *
 * Patrón:
 * - Adapter
 *
 * Responsabilidad:
 * - Adaptar un juego con interfaz incompatible al contrato Juego
 *
 * Cuándo usar:
 * - Cuando un juego no implementa la interfaz Juego
 *
 * Relaciones:
 * - Implementa: domain.juegos.Juego
 * - Envuelve: clase legacy o externa
 */


import com.casino.domain.juegos.Juego;

public class JuegoAdapter implements Juego {

    @Override
    public void iniciar() {}

    @Override
    public void jugar() {}
}

