# Semana 1 - Fundamentos

## Objetivos
- Instalar herramientas y configurar entornos (JDK 21, Node.js, IntelliJ y VS Code)
- Consolidar fundamentos de Java
- Tutorial React: primeros componentes y JSX

## Actividades
- [x] Instalar JDK 21, Node.js, IntelliJ y VS Code
- [x] Repasar sintaxis básica de Java
- [x] Tutorial React: primeros componentes y JSX


# Configuración de Java 21 en macOS

# 1️⃣ Definir la variable JAVA_HOME
# JAVA_HOME indica la ruta donde está instalado el JDK.
# macOS busca automáticamente la instalación de JDK versión 21.
export JAVA_HOME=$(/usr/libexec/java_home -v21)

# 2️⃣ Actualizar el PATH
# Agrega la carpeta 'bin' del JDK al PATH, permitiendo usar comandos como `java` y `javac` desde la terminal.
export PATH=$JAVA_HOME/bin:$PATH

# 3️⃣ Configuración permanente de Java 21 en macOS (Zsh)
# Agrega JAVA_HOME y actualiza PATH automáticamente al iniciar la terminal
echo 'export JAVA_HOME=$(/usr/libexec/java_home -v 21)' >> ~/.zshrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.zshrc


# 4️⃣ Extensiones recomendadas para VS Code

# Java Extension Pack
# Proporciona soporte completo para desarrollo en Java: depuración, autocompletado, gestión de proyectos y más.

# Node.js Extension Pack
# Facilita el desarrollo en JavaScript/Node.js con herramientas como depuración, linting y snippets.

# Prettier
# Formateador de código automático que mantiene un estilo consistente en Java, JS y otros lenguajes.

### Proyecto React completado
- [x] Repositorio: https://github.com/yizreela/Semana-1---Tutorial-React-primeros-componentes-y-JSX
- [x] App desplegada: https://semana-1-tutorial-react-primeros-co.vercel.app
- [x] 10 ejercicios de fundamentos completados
- [x] Documentación creada en Ejercicios-semana/Semana 1/

## Recursos
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Node.js Documentation](https://nodejs.org/en/docs/)
- [React Documentation](https://react.dev/)

## Resultados
- [x] Herramientas instaladas y configuradas
- [x] Proyecto React creado y funcionando
- [x] Ejercicios de Java completados

## Tiempo invertido
- Lunes: ___ horas
- Martes: ___ horas
- Miércoles: ___ horas
- Jueves: ___ horas
- Viernes: ___ horas
- Sábado: ___ horas
- Domingo: ___ horas
- **Total semanal: ___ horas**

## Notas
- Asegúrate de tener las versiones correctas instaladas
- Practica la sintaxis básica de Java antes de avanzar
- Familiarízate con el entorno de desarrollo
