package com.casino.factory;
/**
 * =========================
 * JuegoFactory
 * =========================
 *
 * Tipo:
 * - Clase concreta
 *
 * Patrón:
 * - Factory Method
 *
 * Responsabilidad:
 * - Crear instancias de los distintos juegos del casino
 *
 * Qué NO hace:
 * - No ejecuta lógica del juego
 * - No valida apuestas
 * - No interactúa con la UI
 *
 * Relaciones:
 * - Usa: domain.juegos
 * - Es usada por: facade, service
 */

import com.casino.anotaciones.Proveedor;
import com.google.common.reflect.ClassPath;

import java.util.HashMap;
import java.util.Map;

public class JuegoFactory implements IFactory {

    Map<String, Class> comp = new HashMap<>();

    @Override
    public void init(String pkgName){
        try{
            ClassPath classPath = ClassPath.from(JuegoFactory.class.getClassLoader());
            var clases = classPath.getTopLevelClassesRecursive(pkgName);
            for(var it : clases){
                var miComp = it.load().getAnnotation(Proveedor.class);
                if(miComp != null){
                    comp.put(miComp.name(), it.load());
                }
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public <T> T createFactory(String name){
        var value = comp.get(name);
        if(value == null){
            throw new RuntimeException("no se encontro la clase: " + name);
        }

        try{
            var cto = value.getConstructors()[0];
            Object obj = cto.newInstance();
            return (T) obj;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
