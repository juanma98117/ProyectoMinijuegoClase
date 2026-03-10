# ProyectoMinijuegoClase

Casos de uso creado
```mermaid
graph LR
%% Actor
Jugador((Jugador))

%% Límite del Sistema
subgraph "Preguntados"
   
    CU1([Jugar])
    CU2([Seleccionar categoria])
    CU3([Creditos])
    CU4([Ajustes])
    CU5([Activar/Desactivar sonido])
    CU6([Activar/Desactivar efectos de sonido])



end

%% Relaciones actor-casos de uso
Jugador --- CU1
Jugador --- CU2
Jugador --- CU3
Jugador --- CU4

CU4 -.->|&lt;&lt;extend&gt;&gt;| CU5
CU4 -.->|&lt;&lt;extend&gt;&gt;| CU6

```

# Diagrama de Secuencia: Flujo de Respuesta

```mermaid
sequenceDiagram
    actor Jugador
    participant V as Vista
    participant C as Controlador
    participant M as Modelo

    Jugador->>V: Clic en Botón (Ej: A)
    V->>C: notificarClic(indiceBoton)
    
    activate C
    C->>M: comprobarRespuesta(indiceBoton)
    activate M
    
    alt Respuesta Correcta
        M-->>C: devuelve TRUE
        C->>V: cambiarColorFondo(Verde)
        C->>M: sumarPuntos()
    else Respuesta Incorrecta
        M-->>C: devuelve FALSE
        C->>V: cambiarColorFondo(Rojo)
        C->>M: restarVida()
    end
    
    deactivate M
    
    C->>V: actualizarTextos(Puntos, Vidas)
    deactivate C

 ```
