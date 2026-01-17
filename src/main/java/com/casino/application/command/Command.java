package com.casino.application.command;
/**
 * =========================
 * Command
 * =========================
 *
 * Tipo:
 * - Interfaz
 *
 * Patrón:
 * - Command
 *
 * Responsabilidad:
 * - Encapsular una acción del usuario como un objeto
 *
 * Implementaciones:
 * - JugarCommand
 * - ApostarCommand
 * - ReiniciarCommand
 *
 * Relaciones:
 * - Implementada por: command.*
 * - Usada por: controller
 */

public interface Command {
    void ejecutar();
}

