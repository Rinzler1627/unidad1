package Examen;

public class Cancion extends Musica {

    public void cancion(String titulo, String artista, String genero, String album, String año, String disquera, String compositor) {
        System.out.println("La cancion se llama: " + titulo + "\n"
                + "Del grupo: " + artista + "\n"
                + "Es del genero: " + genero + "\n"
                + "Nombre de los compositores: " + compositor + "\n"
                + "Del album:  " + album + "\n"
                + "Año del lanzamineto del disco o la cancion : " + año + "\n"
                + "Pertenece a la disquera: " + disquera + "\n");
               
    }



}
