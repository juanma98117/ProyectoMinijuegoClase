DISEÑO Y ARQUITECTURA - SISTEMA DE JUEGO.
El sistema tiene una arquitectura modular donde tenemos una clase principal (Ventana) que actúa como el jefe de la interfaz de usuario, gestionando el intercambio entre diferentes paneles.
La lógica de negocio está desacoplada de la interfaz mediante clases de tipo "Motor" (MotorJuego, MotorCategorias).

DIAGRAMA DE CLASES.
El Diagrama De Clases representa la jerarquía de la aplicación, destacando la relación de composición entre la ventana principal y lo que la compone.

COMPONENTES PRINCIPALES.
NUCLEO DE LA INTERFAZ (UI):
Ventana: Es la clase maestra. Contiene las instacias de todos los paneles y define los métodos para alternar la visibilidad entre ellos (mostrarMenu(), mostrarJuego).

Paneles: (PanelMenu, PanelCreditos, PanelAjustes...) Representandon diferentes vistas de la app.
- PanelAjustes: Gestiona el estado de audio y efectos.
- PanelJuego: Se encarga de la representación visual de las preguntas y la actualización de la puntuación en la pantalla.

LÓGICA DE NEGOCIO.
MotorCategorias: Gestiona la persistencia y selección de las categorias disponibles en el juego.
MotorJuego: Controla el flujo de la partida.

- Mantiene la puntuación y la listaPreguntas.
- Valida las respuestas mediante comprobarRespuesta().
- Se comunica con el MotorCategorias para filtrar el contenido según la elección del usuario.

DEFINICION DE CLASES
Clase Ventana: Orquestador principal y contenedor de vistas y  agrega todos los paneles.
PanelJuego: Interfaz activa durante la partida, Dependiente de MotorJuego.
MotorJuego: Procesa reglas de juego y puntuajes, Consulta a MotorCategorias.
PanelAjustes: Persistencia de preferencias de usuario, es Independiente.

FLUJO DE DATOS
1. El usuario interactúa con PanelCategoria y ejecuta seleccionarCategroia().
2. Esta acción se comunica el MotorCategorias.
3. El MotorJuego solicita las preguntas corrrespondientes a esa categoría.
4. La Ventana oculta el panel actual y llama a mostrarJuego().
5. PanelJuego solicita datos al MotorJuego para renderizar mostrarPregunta().
