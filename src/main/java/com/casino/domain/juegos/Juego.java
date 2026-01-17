package com.casino.domain.juegos;
/**
 * =========================
 * Juego
 * =========================
 *
 * Tipo:
 * - Interfaz
 *
 * Responsabilidad:
 * - Definir el contrato común para todos los juegos del casino
 *
 * Método principal:
 * - jugar(Apuesta)
 *
 * Implementaciones:
 * - Tragamonedas
 * - Ruleta
 * - Blackjack
 * - Dados
 *
 * Relaciones:
 * - Implementada por: domain.juegos.*
 * - Usada por: factory, service, facade
 */

public interface Juego {
    void iniciar();
    void jugar();
}

