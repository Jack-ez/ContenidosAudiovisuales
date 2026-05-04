Descripción del Proyecto
Este proyecto tiene como objetivo modelar un sistema de gestión de contenido audiovisual utilizando Programación Orientada a Objetos (POO) en Java.

La aplicación permite representar diferentes tipos de contenido como películas, series, documentales, podcasts y transmisiones en vivo, mostrando sus características y relaciones mediante herencia, composición y asociación.

---

Objetivos
- Aplicar los principios de la Programación Orientada a Objetos.
- Implementar herencia, encapsulamiento y polimorfismo.
- Modelar relaciones entre clases (composición y asociación).
- Diseñar un sistema escalable y organizado.

Clases y Funcionalidades

Clase Base
- ContenidoAudiovisual (abstracta)
- Contiene atributos comunes como título, duración y género.

Clases Principales
- Pelicula → incluye actores
- SerieDeTV → incluye temporadas
- Documental → incluye investigador
- Podcast → contenido de audio
- TransmisionEnVivo → contenido en tiempo real

Clases Auxiliares
- Actor
- Temporada
- Investigador
- Plataforma

---

Relaciones entre clases

- Película → Actor (**Composición**)
- Serie → Temporada (**Composición**)
- Documental → Investigador (**Asociación**)
- Podcast → PodcastEntrevista (**Herencia**)
- Transmisión en vivo → Plataforma (**Asociación**)

---

Instrucciones de Instalación y Uso

1. Copiar el enlace de Github
2. Abrir el proyecto en Eclipse
Abrir Eclipse
Ir a File → Import
Seleccionar: la carpeta Git
3. seleccionar projects from Git → Next
4. Clone URL → Next
5. En URI pegar el enlace que antes se copio de GIT
6. Aceptamos todas las ventanas con Next → y finish
Asi se nos abrira el proyecto automaticamente en nuestro escritorio de Eclipse 
