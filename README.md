"# T2_JEREMYSALAS" 

# Blockbuster Fake

¡Bienvenido a Blockbuster Fake!  
Este es un sistema web de alquiler de películas desarrollado en Java con Spring Boot, Thymeleaf y MySQL.

## Características

- Listado de clientes y registro de nuevos clientes.
- Listado de películas con información de nombre, género, stock y precio.
- Registro de nuevos alquileres.
- Interfaz moderna y responsiva.

## Tecnologías utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL
- Bootstrap (para estilos)

## Estructura del proyecto

```
src/
 └── main/
     ├── java/
     │    └── com/peliculast2/bbfake/
     │         ├── alquiler/
     │         │    ├── controller/
     │         │    ├── entity/
     │         │    └── repository/
     │         └── BbfakeApplication.java
     └── resources/
          ├── templates/
          │    ├── inicio.html
          │    ├── listado_clientes.html
          │    ├── listado_peliculas.html
          │    └── registro_cliente.html
          └── application.properties
```

## Configuración

1. **Base de datos:**  
   Crea una base de datos MySQL llamada `BD2_SALAS` y configura el usuario y contraseña en `src/main/resources/application.properties`:

   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/BD2_SALAS
   spring.datasource.username=TU_USUARIO
   spring.datasource.password=TU_PASSWORD
   spring.jpa.hibernate.ddl-auto=update
   ```

2. **Dependencias:**  
   Asegúrate de tener las dependencias de Spring Boot, Spring Data JPA, Thymeleaf y MySQL Connector en tu archivo `pom.xml`.

3. **Ejecución:**  
   Ejecuta la aplicación desde tu IDE o con el comando:

   ```
   ./mvnw spring-boot:run
   ```

4. **Acceso:**  
   Abre tu navegador y entra a [http://localhost:8080](http://localhost:8080)

## Autores

- Desarrollado por Jeremy Salas

---

¡Disfruta del proyecto Blockbuster Fake!
