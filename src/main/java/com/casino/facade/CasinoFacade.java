package com.casino.facade;
/**
 * =========================
 * CasinoFacade
 * =========================
 *
 * Tipo:
 * - Clase concreta
 *
 * Patrón:
 * - Facade
 *
 * Responsabilidad:
 * - Proveer un punto único de acceso a la lógica del casino
 * - Orquestar validaciones, creación de juegos y ejecución
 *
 * Qué hace:
 * - Llama a validadores (Chain of Responsibility)
 * - Solicita juegos al Factory
 * - Ejecuta la lógica de negocio vía Service
 *
 * Relaciones:
 * - Usa: service, factory, chain
 * - Es usada por: controller, command
 */

public class CasinoFacade {

    public void jugar(String juego) {
        // Orquesta validaciones y ejecución
    }
}

