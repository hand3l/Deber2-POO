public class Main {
    public static void main(String[] args) {
        // Cancion
        Cancion cancion1 = new Cancion("Let It Be", "The Beatles");
        Cancion cancion2 = new Cancion("Blinding Lights", "The Weeknd");
        cancion1.imprimirInfo();
        cancion2.imprimirInfo();
        System.out.println();  // Salto de línea

        // Serie
        Serie serie1 = new Serie("The Witcher", 3);
        Serie serie2 = new Serie("Stranger Things", 4);
        serie1.imprimirInfo();
        serie2.imprimirInfo();
        System.out.println();  // Salto de línea

        // Videojuego
        Videojuego juego1 = new Videojuego("Hades", "Roguelike");
        Videojuego juego2 = new Videojuego("Minecraft", "Sandbox");
        juego1.imprimirInfo();
        juego2.imprimirInfo();
        System.out.println();  // Salto de línea

        // Persona
        Persona persona1 = new Persona("Juan", 29);
        Persona persona2 = new Persona("María", 34);
        persona1.imprimirInfo();
        persona2.imprimirInfo();
        System.out.println();  // Salto de línea

        // Auto
        Auto auto1 = new Auto("Chevrolet", "Spark");
        Auto auto2 = new Auto("Mazda", "CX-5");
        auto1.imprimirInfo();
        auto2.imprimirInfo();
        System.out.println();  // Salto de línea

        // Transporte
        Transporte transporte1 = new Transporte("Bicicleta", 25);
        Transporte transporte2 = new Transporte("Ferry", 70);
        transporte1.imprimirInfo();
        transporte2.imprimirInfo();
        System.out.println();  // Salto de línea

        // Materia
        Materia materia1 = new Materia("Física", "Electromagnetismo");
        Materia materia2 = new Materia("Química", "Termodinámica");
        materia1.imprimirInfo();
        materia2.imprimirInfo();
        System.out.println();  // Salto de línea

        // Zapato
        Zapato zapato1 = new Zapato("Puma", 38);
        Zapato zapato2 = new Zapato("Converse", 44);
        zapato1.imprimirInfo();
        zapato2.imprimirInfo();
        System.out.println();  // Salto de línea

        // Instrumento Musical
        InstrumentoMusical instrumento1 = new InstrumentoMusical("Saxofón", "Viento");
        InstrumentoMusical instrumento2 = new InstrumentoMusical("Batería", "Percusión");
        instrumento1.imprimirInfo();
        instrumento2.imprimirInfo();
        System.out.println();  // Salto de línea

        // Película
        Pelicula pelicula1 = new Pelicula("Avatar", "James Cameron");
        Pelicula pelicula2 = new Pelicula("Interstellar", "Christopher Nolan");
        pelicula1.imprimirInfo();
        pelicula2.imprimirInfo();
        System.out.println();  // Salto de línea
    }
}

class Cancion {
    private String titulo;
    private String artista;

    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public void imprimirInfo() {
        System.out.println("Canción: " + titulo + " - Artista: " + artista);
    }
}

class Serie {
    private String titulo;
    private int temporadas;

    public Serie(String titulo, int temporadas) {
        this.titulo = titulo;
        this.temporadas = temporadas;
    }

    public void imprimirInfo() {
        System.out.println("Serie: " + titulo + " - Temporadas: " + temporadas);
    }
}

class Videojuego {
    private String titulo;
    private String genero;

    public Videojuego(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public void imprimirInfo() {
        System.out.println("Videojuego: " + titulo + " - Género: " + genero);
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirInfo() {
        System.out.println("Persona: " + nombre + " - Edad: " + edad);
    }
}

class Auto {
    private String marca;
    private String modelo;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void imprimirInfo() {
        System.out.println("Auto: " + marca + " - Modelo: " + modelo);
    }
}

class Transporte {
    private String tipo;
    private int velocidadMaxima;

    public Transporte(String tipo, int velocidadMaxima) {
        this.tipo = tipo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimirInfo() {
        System.out.println("Transporte: " + tipo + " - Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}

class Materia {
    private String nombre;
    private String tema;

    public Materia(String nombre, String tema) {
        this.nombre = nombre;
        this.tema = tema;
    }

    public void imprimirInfo() {
        System.out.println("Materia: " + nombre + " - Tema: " + tema);
    }
}

class Zapato {
    private String marca;
    private int talla;

    public Zapato(String marca, int talla) {
        this.marca = marca;
        this.talla = talla;
    }

    public void imprimirInfo() {
        System.out.println("Zapato: " + marca + " - Talla: " + talla);
    }
}

class InstrumentoMusical {
    private String nombre;
    private String tipo;

    public InstrumentoMusical(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void imprimirInfo() {
        System.out.println("Instrumento Musical: " + nombre + " - Tipo: " + tipo);
    }
}

class Pelicula {
    private String titulo;
    private String director;

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    public void imprimirInfo() {
        System.out.println("Película: " + titulo + " - Director: " + director);
    }
}
