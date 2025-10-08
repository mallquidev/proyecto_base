 #backend_base - Arquitectura del Proyecto

Este repositorio es una base para construir aplicaciones backend con Spring Boot. Está organizado en tres paquetes principales que definen la arquitectura del sistema: `commons>

---

##COMMONS

En `commons` se agrupan componentes reutilizables que pueden ser usados por cualquier módulo del sistema.

**¿Quién lo usa?**
Todos los módulos que necesiten validaciones, modelos comunes, manejo de errores o utilidades compartidas.

**¿Por qué existe?**
Para evitar duplicación de código y centralizar lógica común que no pertenece a un dominio específico.

**Contenido:**
- `exception/`: Manejo de excepciones globales y personalizadas.
- `libs/`: Funciones auxiliares y utilidades compartidas.
- `models/`: Estructuras genéricas como respuestas estándar, paginación, etc.
- `validation/`: Validadores personalizados y anotaciones para asegurar integridad de datos.

---

##CONFIG

En `config` se define la configuración técnica global del sistema.

**¿Quién lo usa?**
Spring Boot lo carga automáticamente al iniciar la aplicación. Los desarrolladores lo modifican para ajustar el comportamiento del sistema.

**¿Por qué existe?**
Para separar la configuración técnica de la lógica de negocio, facilitando el mantenimiento y la personalización.

**Contenido:**
- `cors/`: Configuración de políticas CORS para permitir o restringir acceso entre dominios.
- `security/`: Configuración de seguridad con JWT, filtros personalizados, y control de roles.

---

##DOMAIN

En `domain` se define la lógica de negocio de cada módulo funcional del sistema.
Cada subcarpeta representa un módulo independiente (por ejemplo: `core`, `auth`, `user`, etc.).

**¿Quién lo usa?**
Los controladores REST, servicios y repositorios que manejan datos específicos de cada módulo.

**¿Por qué existe?**
Para mantener la lógica de negocio separada y modular, facilitando la escalabilidad y el mantenimiento.

**Ejemplo de contenido en `domain/core/`:**
- `dto/`: Objetos de transferencia de datos para entrada/salida.
- `entities/`: Clases JPA que representan las tablas de la base de datos.
- `repo/`: Interfaces de repositorio que acceden a los datos mediante Spring Data.

---
