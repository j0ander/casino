# 🎰 Casino – Arquitectura en Capas

Este proyecto implementa un **Casino en JavaFX** utilizando una **arquitectura en capas**, con el objetivo de separar responsabilidades y facilitar el mantenimiento, la escalabilidad y el trabajo en equipo.

La arquitectura se divide en **capas lógicas**, donde cada capa agrupa paquetes con una función específica.

---

## 🧱 Arquitectura en Capas del Proyecto

La aplicación está organizada en **cuatro capas principales**:

1. Capa de Presentación (Interfaz Gráfica)
2. Capa de Aplicación / Coordinación
3. Capa de Lógica de Negocio
4. Capa de Datos

Cada capa **solo se comunica con la capa inmediata inferior**, evitando acoplamiento innecesario.

---

## 🟢 1. Capa de Presentación (Interfaz Gráfica)

📦 **Paquetes incluidos**
com.casino
com.casino.controller
com.casino.controller.juegos


📌 **Responsabilidad**
- Mostrar la interfaz gráfica al usuario (JavaFX)
- Capturar eventos (clics, botones, Canvas)
- Enviar solicitudes al sistema

📌 **Características**
- No contiene reglas del negocio
- No accede a datos directamente
- No crea objetos del dominio

📌 **Comunicación**
➡️ Se comunica únicamente con la **Capa de Aplicación (Facade)**

---

## 🟢 2. Capa de Aplicación / Coordinación

📦 **Paquetes incluidos**
com.casino.facade
com.casino.factory
com.casino.command
com.casino.chain
com.casino.adapter
com.casino.config


📌 **Responsabilidad**
- Coordinar el flujo de la aplicación
- Orquestar llamadas entre UI y lógica
- Crear objetos necesarios
- Aplicar validaciones generales

📌 **Características**
- No contiene interfaz gráfica
- No maneja persistencia directamente
- Centraliza el acceso al sistema

📌 **Comunicación**
➡️ Recibe solicitudes desde la **UI**  
➡️ Invoca la **Capa de Lógica de Negocio**

---

## 🟢 3. Capa de Lógica de Negocio

📦 **Paquetes incluidos**
com.casino.service
com.casino.service.juegos
com.casino.domain
com.casino.domain.juegos


📌 **Responsabilidad**
- Implementar reglas del casino
- Representar el modelo del negocio
- Ejecutar la lógica de cada juego

📌 **Características**
- Independiente de JavaFX
- Independiente de la base de datos
- Puede reutilizarse en otros contextos

📌 **Comunicación**
➡️ Es invocada por la **Capa de Aplicación**  
➡️ Utiliza la **Capa de Datos** para persistencia

---

## 🟢 4. Capa de Datos (Persistencia)

📦 **Paquetes incluidos**
com.casino.repository


📌 **Responsabilidad**
- Manejar almacenamiento de datos
- Acceso a información de jugadores, apuestas, resultados
- Abstraer la fuente de datos (memoria o base de datos)

📌 **Características**
- No contiene lógica de negocio
- No conoce la interfaz gráfica

📌 **Comunicación**
➡️ Es utilizada únicamente por la **Capa de Lógica de Negocio**

---

## 🧠 Beneficios de esta Arquitectura

- Separación clara de responsabilidades
- Facilidad para trabajar en equipo
- Código mantenible y escalable
- Permite cambiar la UI o la base de datos sin afectar la lógica
- Cumple con buenas prácticas de ingeniería de software

---

## 📌 Resumen Visual

[ Interfaz Gráfica ]
↓
[ Aplicación / Facade ]
↓
[ Lógica de Negocio ]
↓
[ Datos / Repository ]



---

🎯 **Esta organización permite que cada integrante trabaje en su capa sin interferir con las demás, manteniendo el sistema ordenado y coherente.**
