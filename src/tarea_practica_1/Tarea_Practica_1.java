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
     Perro primero = new Perro("Siberiano", "Grande", 10, "Negro", "Puppy");
     primero.setNombre("Rony");
     System.out.println(primero.getNombre());
     primero.setRaza("Pastor aleman");
     System.out.println(primero.getRaza());
     primero.setTamano("Grande");
     System.out.println(primero.getTamano());
     primero.setAnos(9);
     System.out.println(primero.getAnos());
     primero.setColor("Cafe");
     System.out.println(primero.getColor());
     Auto carro1 = new Auto("Nissan", "Negro", 1999, 273920, "Camioneta");
     carro1.setMarca("Ford");
     System.out.println(carro1.getMarca());
     carro1.setColor("Azul");
     System.out.println(carro1.getColor());
     carro1.setAno(2000);
     System.out.println(carro1.getAno());
     carro1.setPrecio(978656);
     System.out.println(carro1.getPrecio());
     carro1.setTipo("Auto");
     System.out.println(carro1.getTipo());
     Arbol arbol1 = new Arbol("Roble Mediterraneo", 78273, "Grande", 30, "Roble");
     arbol1.setNombre("Eucalipto");
     System.out.println(arbol1.getNombre());
     arbol1.setNumeroDeArboles(2983);
     System.out.println(arbol1.getNumeroDeArboles());
     arbol1.setTamano("Pequeño");
     System.out.println(arbol1.getTamano());
     arbol1.setAnos(50);
     System.out.println(arbol1.getAnos());
     arbol1.setFamilia("Myrtaceae");
     System.out.println(arbol1.getFamilia());
     Pelicula peli1 = new Pelicula("La bella y la bestia", 2017, "Bill Condon", 120, 8, "Drama");
     peli1.setNombre("Titanic");
     System.out.println(peli1.getNombre());
     peli1.setGenero("Drama");
     System.out.println(peli1.getGenero());
     peli1.setAno(1997);
     System.out.println(peli1.getAno());
     peli1.setDirector("James Cameron");
     System.out.println(peli1.getDirector());
     peli1.setMinutos(139);
     System.out.println(peli1.getMinutos());
     peli1.setCalificacion(10);
     System.out.println(peli1.getCalificacion());
     
     Libro libro1 = new Libro("Juego de Tronos", 755, "George R.R. Martin", "Fantasia", "Plaza Janés");
     libro1.setNombre("Hija de humo y hueso");
     System.out.println(libro1.getNombre());
     libro1.setNumPag(450);
     System.out.println(libro1.getNumPag());
     libro1.setAutor("Laini Taylor");
     System.out.println(libro1.getAutor());
     libro1.setGenero("fantasia");
     System.out.println(libro1.getGenero());
     libro1.setEditorial("Alfaguara");
     System.out.println(libro1.getEditorial());
     Gato gato1 = new Gato("Anastasia", "Egipcio", 3, "Piel", "Mediano");
     gato1.setNombre("tequila");
     System.out.println(gato1.getNombre());
     gato1.setRaza("minino");
     System.out.println(gato1.getRaza());
     gato1.setAnos(2);
     System.out.println(gato1.getAnos());
     gato1.setColor("cafe");
     System.out.println(gato1.getColor());
     gato1.setTamano("grande");
     System.out.println(gato1.getTamano());
     
     InstrumentoMusical instrumento1 = new InstrumentoMusical("Violín", "Café caoba", 10, 564.3);
     instrumento1.setNombre("guitarra");
     System.out.println(instrumento1.getNombre());
     instrumento1.setColor("cafe");
     System.out.println(instrumento1.getColor());
     instrumento1.setNumInstrumentos(8);
     System.out.println(instrumento1.getNumInstrumentos());
     instrumento1.setPrecio(799);
     System.out.println(instrumento1.getPrecio());
     
     Cancion sonido1 = new Cancion("Sabes", "Balada", 3.45, "Reik");
     sonido1.setNombre("7 rings");
     System.out.println(sonido1.getNombre());
     sonido1.setGenero("Pop");
     System.out.println(sonido1.getGenero());
     sonido1.setDuracion(3.45);
     System.out.println(sonido1.getDuracion());
     sonido1.setAutor("Ariana Grande");
     System.out.println(sonido1.getAutor());
     
     Computadora compu1 = new Computadora("Hp", "Intel", 2, "Gris", 27.4);
     compu1.setMarca("lenovo");
     System.out.println(compu1.getMarca());
     compu1.setTipoProcesador("AMD");
     System.out.println(compu1.getTipoProcesador());
     compu1.setMemoria(3);
     System.out.println(compu1.getMemoria());
     compu1.setColor("gris");
     System.out.println(compu1.getColor());
     compu1.setTamPantalla(28.3);
     System.out.println(compu1.getTamPantalla());
     
     Camara cam1 = new Camara("Nikon", 20.5, "Negra", 5, "Nikkor AF-S DX");
     cam1.setMarca("Nikon");
     System.out.println(cam1.getMarca());
     cam1.setColor("verde");
     System.out.println(cam1.getColor());
     cam1.setMegapixeles(30.6);
     System.out.println(cam1.getMegapixeles());
     cam1.setMemoria(6);
     System.out.println(cam1.getMemoria());
     cam1.setTipoLente("X A5");
     System.out.println(cam1.getTipoLente());
     Mochila moch1 = new Mochila("Totto", 670, "Rosa", 3.5, "maleta");
     moch1.setMarca("Adidas");
     System.out.println(moch1.getMarca());
     moch1.setPrecio(679);
     System.out.println(moch1.getPrecio());
     moch1.setColor("Gris");
     System.out.println(moch1.getColor());
     moch1.setPeso(2.5);
     System.out.println(moch1.getPeso());
     moch1.setTipo("mariconera");
     System.out.println(moch1.getTipo());
     Television tele1 = new Television("Samsung", 98, "Smart", "Negra");
     tele1.setMarca("LG");
     System.out.println(tele1.getMarca());
     tele1.setPulgadasPantalla(32);
     System.out.println(tele1.getPulagadasPantalla());
     tele1.setTipo("Smart");
     System.out.println(tele1.getTipo());
     tele1.setColor("Negra");
     System.out.println(tele1.getColor());
     Conejo conejito1 = new Conejo("Rabbit", "Belier Holandes", 2, 3.4, 0.34);
     conejito1.setNombre("Rabito");
     System.out.println(conejito1.getNombre());
     conejito1.setRaza("Conejito");
     System.out.println(conejito1.getRaza());
     conejito1.setEdad(2);
     System.out.println(conejito1.getEdad());
     conejito1.setPeso(2.8);
     System.out.println(conejito1.getPeso());
     conejito1.setEstatura(0.45);
     System.out.println(conejito1.getEstatura());
     Puerta puert1 = new Puerta("Arcon", "Blanca", "Caoba", 2.0, 36);
     
     
     Celular cel1 = new Celular("Iphone 8", "dual" , "Apple A12", 23000, 10, 405, "Plata");
     
     Libreta lib1 = new Libreta("Norma", 56.6, 100, "Mezclilla", "Doble linea");
     
     Idioma idioma1 = new Idioma("Español", "Mas de 20 paises", 27, 572000000);
     
     Materias materia1 = new Materias("Biologia", "Seres vivos", 90, "Irma Guadalupe Sanchez");
     
     Deporte dep1 = new Deporte("Futbol", "Liga nacional mexicana", 11, "Marcos Cruz");
     
     Pescado pesc1 = new Pescado("Pez globo", "Agua salada", 1, 3);
     
     
     
        System.out.println();
    }
    
}
