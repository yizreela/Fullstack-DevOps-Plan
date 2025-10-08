# Semana 1 - Tutorial React: Primeros Componentes y JSX

## 📋 Resumen del Proyecto

Este proyecto contiene ejercicios fundamentales de React para aprender los conceptos básicos de componentes, JSX, props, estado y eventos.

## 🔗 Enlaces del Proyecto

### 📁 Repositorio GitHub
**URL**: [https://github.com/yizreela/Semana-1---Tutorial-React-primeros-componentes-y-JSX](https://github.com/yizreela/Semana-1---Tutorial-React-primeros-componentes-y-JSX)

### 🌐 Aplicación en Vercel
**URL**: [https://semana-1-tutorial-react-primeros-co.vercel.app](https://semana-1-tutorial-react-primeros-co.vercel.app)

## 🎯 Ejercicios de Fundamentos de React

### 1️⃣ Crear tu primer componente
**Objetivo**: Entender cómo funcionan los componentes y JSX.

- Crea un componente `Saludo` que reciba un nombre como prop y muestre:
  - ¡Hola, [nombre]!
- Renderízalo dentro de `App.js` con tu nombre.
- **Extra**: Añade un párrafo `<p>` debajo con un mensaje de bienvenida.

### 2️⃣ Usar props
**Objetivo**: Aprender a pasar datos a los componentes.

- Crea un componente `Usuario` que reciba:
  - `nombre` (string)
  - `edad` (número)
- Muestra en pantalla:
  - Nombre: [nombre], Edad: [edad]
- Crea 3 instancias diferentes en `App.js`.

### 3️⃣ Lista y .map()
**Objetivo**: Renderizar listas dinámicas.

- Crea un array dentro de `App.js`:
  ```javascript
  const frutas = ["Manzana", "Banana", "Uva"];
  ```
- Crea un componente `ListaFrutas` que reciba ese array como prop y renderice un `<ul>` con `<li>` por cada fruta.

### 4️⃣ Estado con useState
**Objetivo**: Aprender a manejar el estado de un componente.

- Crea un componente `Contador`:
  - Muestra un número inicial 0
  - Dos botones: Incrementar y Decrementar
  - Al presionar los botones, cambia el número usando `useState`
  ```javascript
  import { useState } from "react";
  ```

### 5️⃣ Manejar eventos
**Objetivo**: Capturar eventos de usuario.

- En el componente `Contador`, añade un botón Reset que deje el contador en 0
- Crea un input de texto que al cambiar, actualice un estado `nombre` y lo muestre en tiempo real en un `<p>`

### 6️⃣ Condicionales en JSX
**Objetivo**: Renderizar contenido según condiciones.

- Crea un componente `UsuarioEdad` que reciba `edad` como prop
- Muestra:
  - "Eres mayor de edad" si `edad >= 18`
  - "Eres menor de edad" si `edad < 18`

### 7️⃣ Componentes anidados
**Objetivo**: Entender la composición de componentes.

- Crea un componente `TarjetaUsuario` que reciba `nombre` y `edad`
- Dentro de `TarjetaUsuario`, usa el componente `UsuarioEdad` del ejercicio anterior
- Renderiza varias tarjetas en `App.js`

### 8️⃣ Estilos en React
**Objetivo**: Aplicar estilos inline o con clases CSS.

- Crea un componente `Boton` que cambie de color cuando pases un prop `color`
- Aplica estilos inline o usa un archivo CSS

### 9️⃣ Formulario básico
**Objetivo**: Manejar inputs y submit.

- Crea un formulario con:
  - Input para nombre
  - Input para email
  - Botón enviar
- Al enviar, muestra los datos debajo del formulario

### 🔟 Proyecto mini: lista de tareas
**Objetivo**: Integrar todos los fundamentos.

- Crea un componente `TodoApp`:
  - Input para agregar tareas
  - Lista de tareas usando `.map()`
  - Botón para marcar cada tarea como completada
  - Mostrar cuántas tareas quedan pendientes

## 🛠️ Tecnologías Utilizadas

- **React 18+**
- **Vite** (Build tool)
- **JavaScript ES6+**
- **CSS3**
- **Vercel** (Deployment)

## 📚 Conceptos Aprendidos

- ✅ Componentes funcionales
- ✅ JSX y sintaxis
- ✅ Props y paso de datos
- ✅ Estado con useState
- ✅ Eventos y handlers
- ✅ Renderizado condicional
- ✅ Listas y map()
- ✅ Composición de componentes
- ✅ Estilos en React
- ✅ Formularios básicos

## 🚀 Cómo ejecutar localmente

```bash
# Clonar el repositorio
git clone https://github.com/yizreela/Semana-1---Tutorial-React-primeros-componentes-y-JSX.git

# Instalar dependencias
npm install

# Ejecutar en modo desarrollo
npm run dev

# Construir para producción
npm run build
```

## 📝 Notas de Aprendizaje

Este proyecto forma parte del **Mes 1 - Fundamentos** del plan de aprendizaje Fullstack-DevOps, específicamente de la **Semana 1** donde se consolidan los fundamentos de React y se prepara el terreno para el desarrollo de aplicaciones más complejas.

---

**Autor**: Yizreel  
**Fecha**: Semana 1 - Fundamentos  
**Plan**: Fullstack-DevOps (4 meses)
