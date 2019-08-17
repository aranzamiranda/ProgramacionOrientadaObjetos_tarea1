/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_practica_1;

/**
 *
 * @author chiky
 */
public class Tarea_Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objeto de clase Perro
        Perro primero = new Perro("Siberiano", "Grande", 10, "Negro", "Puppy");
        primero.anos = 7;
        primero.color = "Café";
        primero.nombre = "Pelon";
        primero.raza = "Husky";
        primero.tamano = "Mediano";
        //Objeto de clase Auto
        Auto carro1 = new Auto("Nissan", "Negro", 1999, 273920, "Camioneta");
        carro1.marca = "Ford";
        carro1.color = "Azul";
        carro1.precio = 2983782;
        carro1.ano = 2009;
        carro1.tipo = "limusina";
        //Objeto de clase Arbol
        Arbol arbol1 = new Arbol("Roble Mediterraneo", 78273, "Grande", 30, "Roble");
        arbol1.nombre = "Eucalipto";
        arbol1.numeroDeArboles = 4534;
        arbol1.tamano = "Chico";
        arbol1.anos = 10;
        arbol1.familia = "Myrtaceae";
        //Objeto de clase Pelicula
        Pelicula peli1 = new Pelicula("La bella y la bestia", 2017, "Bill Condon", 120, 8, "Drama");
        peli1.nombre = "Titanic";
        peli1.ano = 1997;
        peli1.director = "James Cameron";
        peli1.minutos = 140;
        peli1.calificacion = 8.9;
        peli1.genero = "Drama y Romance";
        //Objeto de clase Libro
        Libro libro1 = new Libro("Juego de Tronos", 755, "George R.R. Martin", "Fantasia", "Plaza Janés");
        libro1.nombre = "Hija de Humo y Hueso";
        libro1.numPag = 400;
        libro1.autor = "Laini Taylor";
        libro1.genero = "Fantasia";
        libro1.editorial = "Alfaguara";
        //Objeto de clase Gato
        Gato gato1 = new Gato("Anastasia", "Egipcio", 3, "Piel", "Mediano");
        gato1.nombre = "Dani";
        gato1.raza = "Siames";
        gato1.anos = 4;
        gato1.color = "Blanco con negro";
        gato1.tamano = "Mediano";
        //Objeto de clase InstrumentoMusical
        InstrumentoMusical instrumento1 = new InstrumentoMusical("Violín", "Café caoba", 10, 564.3);
        instrumento1.nombre = "Guitarra";
        instrumento1.color = "Café claro";
        instrumento1.numInstrumentos = 14;
        instrumento1.precio = 345.6;
        //Objeto de clase Cancion
        Cancion sonido1 = new Cancion("Sabes", "Balada", 3.45, "Reik");
        sonido1.nombre = "7 rings";
        sonido1.genero = "Electronica";
        sonido1.duracion = 3;
        sonido1.autor = "Ariana Grande";
        //Objeto de clase Computadora
        Computadora compu1 = new Computadora("Hp", "Intel", 2, "Gris", 27.4);
        compu1.marca = "Lenovo";
        compu1.tipoProcesador = "AMD";
        compu1.memoria = 3;
        compu1.color = "Plateado";
        compu1.tamPantalla = 34.6;
        //Objeto de clase Camara
        Camara cam1 = new Camara("Nikon", 20.5, "Negra", 5, "Nikkor AF-S DX");
        cam1.marca = "Fuiji";
        cam1.megapixeles = 25.3;
        cam1.color = "Azul";
        cam1.memoria = 0;
        cam1.tipoLente = "X A5";
        //Objeto de clase Mochila
        Mochila moch1 = new Mochila("Totto", 670, "Rosa", 3.5, "maleta");
        moch1.marca = "Jansport";
        moch1.precio = 1100;
        moch1.color = "Negra";
        moch1.peso = 2.6;
        moch1.tipo = "Morral";
        //Objeto de clase Television
        Television tele1 = new Television("Samsung", 98, "Smart", "Negra");
        tele1.marca = "LG";
        tele1.pulgadasPantalla = 32;
        tele1.tipo = "Smart";
        tele1.color = "Gris";
        //Objeto de clase Conejo
        Conejo conejito1 = new Conejo("Rabbit", "Belier Holandes", 2, 3.4, 0.34);
        conejito1.nombre = "Milanesa";
        conejito1.raza = "Silver Fox";
        conejito1.edad = 1;
        conejito1.peso = 4;
        conejito1.estatura = 0.35;
        //Objeto de clase Puerta
        Puerta puert1 = new Puerta("Arcon", "Blanca", "Caoba", 2.0, 36);
         puert1.marca = "Cortizo";
         puert1.color = "Gris";
         puert1.tipoMadera = "No madera";
         puert1.altura = 2.0;
         puert1.peso = 37;
        //Objeto de clase Celular
        Celular cel1 = new Celular("Iphone 8", "dual" , "Apple A12", 23000, 10, 405, "Plata");
        cel1.marca = "Samsung";
        cel1.camara = "3D";
        cel1.procesador = "Exynos";
        cel1.precio = 12000;
        cel1.tamano = 9;
        cel1.peso = 406;
        cel1.color = "Blanco";
        //Objeto de clase Libreta
        Libreta lib1 = new Libreta("Norma", 56.6, 100, "Mezclilla", "Doble linea");
                lib1.marca = "Scribe";
                lib1.gramaje = 98.6;
                lib1.paginas = 200;
                lib1.color = "Tornasol";
                lib1.tipo = "Cuadro chico";
        //Objeto de clase Idioma
        Idioma idioma1 = new Idioma("Español", "Mas de 20 paises", 27, 572000000);
                idioma1.nombre = "Ingles";
                idioma1.pais = "Mas de 50 paises";
                idioma1.numSignos = 26;
                idioma1.hablantes = 400000000;
        //Objeto de clase Materia
        Materias materia1 = new Materias("Biologia", "Seres vivos", 90, "Irma Guadalupe Sanchez");
        materia1.nombre = "Historia";
        materia1.campoDeConocimiento = "Historia de la humanidad";
        materia1.calificacion = 70;
        materia1.maestro = "Sandra Cruz";
        //Objeto de clase Deporte
        Deporte dep1 = new Deporte("Futbol", "Liga nacional mexicana", 11, "Marcos Cruz"); 
        dep1.name = "Basquetbol";
        dep1.liga = "LNBP";
        dep1.jugadores = 40;
        dep1.entrenador = "Antonio Ruiz";
          //Objeto de clase Pescado
        Pescado pesc1 = new Pescado("Pez globo", "Agua salada", 1, 3);
        pesc1.nombre = "Tiburon blanco";
        pesc1.tipo = "Agua salada";
        pesc1.anos = 3;
        pesc1.peso = 23;
        
        
        System.out.println();
    }
    
}
