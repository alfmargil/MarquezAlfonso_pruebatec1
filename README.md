# Prueba Técnica 1: Aplicación de Gestión de Empleados

Este ejercicio consiste en la creación de una aplicación de gestión de empleados en Java utilizando JPA (Java Persistence API) para interactuar con una base de datos.

## Descripción del Ejercicio

La aplicación permite a los usuarios realizar operaciones CRUD sobre la base de datos empleados, incluyendo:

- Agregar un nuevo empleado con información detallada (nombre, apellido, cargo, salario y fecha de inicio).
- Eliminar un empleado de la base de datos.
- Modificar la información de un empleado existente.
- Listar todos los empleados existentes.
- Buscar empleados por su cargo y visualizar una lista de empleados con ese cargo.

## Tecnologías Utilizadas

- IDE: NetBeans 17
- Java: JDK 17
- JPA (Java Persistence API): Javax.persistance
- MySQL para la base de datos

## Estructura del Proyecto

- **src/main/java/com/marquezAlfonso_pruebatec1/** Contiene la clase Main y el resto de paquetes
- **src/main/java/com/marquezAlfonso_pruebatec1/modelos** Contiene la lógica de negocio de la aplicación
- **src/main/java/com/marquezAlfonso_pruebatec1/persistencia** Contiene la lógica de persistencia de la aplicación

## Configuración

1. **Requisitos previos**: Asegúrate de tener instalado Java 17

2. **Configuración de la base de datos**: Importar el archivo sql del repositorio con la base de datos inicial. Contiene 4 elementos

3. **Ejecución del proyecto**: Abrir el proyecto en NetBeans, importar la base de datos y ejecutar.

## Casos supuestos

1. Fechas: He supuesto que la empresa existe desde 2010, por lo tanto al introducir una fecha de inicio esta debe estar entre el año 2010 y el año actual.

## Documentación

Todos los métodos están comentados con una breve explicación
