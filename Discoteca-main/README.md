# Discoteca

## Cómo realizar un fork de un proyecto para trabajar sobre él y quede guardado en tu repositorio de Github

Una bifurcación (fork en inglés), en el ámbito del desarrollo de software, es la creación de un proyecto en una dirección distinta de la principal u oficial tomando el código fuente del proyecto ya existente.

Los cambios que se hacen en el repositorio original no se transmiten automáticamente a la copia (fork). Esto tampoco ocurre a la inversa. Las modificaciones que se hagan en la copia (fork) no se transmiten automáticamente al repositorio original.

```
Para hacer un fork hay que ir a la página del repositorio del proyecto del examen: 'tps://github.com/darioaxel/Discoteca' y pulsar sobre el botón FORK que se encuentra en la parte superior derecha de la pantalla. Posteriormente, haz un clonado de tu nuevo proyecto con Eclipse o el IDE que utilices y empieza a trabajar sobre él.
```

## Ejercicios grupo A

1. Implementa una clase que permita recuperar, utilizando los métodos de la interfaz DAO, los usuarios de la discoteca. Realiza un commit con el texto "Implementación DAO".
2. Implementa en la clase UsuarioUtils.java la función ValidarCalidadPassword para que los passwords tengan un tamaño mínimo de 8 caracteres y al menos 1 dígito. Realiza un commit con el texto "Funcion ValidarCalidadPassword". 
3. Crea dos tests que validen la función que acabas de crear; uno con un password con formato válido y otro que no.Realiza un commit con el texto "Test de la función"
4. Crea con Java Swing una gui llamada Login.java una ventana que tenga:  
 4.1. Un campo para el email y otro para el password, con sus label correspondientes y usando los componentes de password.  
 4.2. Un botón Aceptar que tenga la siguiente funcionalidad:  
 * Si se introduce un email que no está en la base de datos de usuarios, lanzar un JDialog con el texto "Usuario no existente"
 * Si el email existe, pero la contraseña no coincide, se hace visible una etiqueta con un texto que diga: "Error en el password"
 * Si se introduce 3 veces una contraseña que no coincide con la que tiene el email asociado, se cierra la aplicación automáticamente.
 Realizar el commit final "Pantalla de login"
