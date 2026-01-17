package com.casino.chainResponsibility;
/**
 * =========================
 * Validador
 * =========================
 *
 * Tipo:
 * - Clase abstracta
 *
 * Patrón:
 * - Chain of Responsibility
 *
 * Responsabilidad:
 * - Definir el esqueleto de una validación
 * - Permitir encadenar múltiples validadores
 *
 * Relaciones:
 * - Extendida por: ValidadorSaldo, ValidadorMonto, ValidadorEstado
 * - Usada por: facade
 */

public abstract class Validador {

    protected Validador siguiente;

    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract boolean validar();
}

