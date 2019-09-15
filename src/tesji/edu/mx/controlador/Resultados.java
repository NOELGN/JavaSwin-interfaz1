package tesji.edu.mx.controlador;
import javax.swing.JOptionPane;

public class Resultados {
    public String jugadores="";
    public int puntajeMejor;
    public int puntajePeor;
    public String nombreMejor="";
    public String NombrePeor="";
    public int total;

    public void Numero(int numero){
        int puntos=0;
        int mayor =-1;
        int menor = 5000;
        String datos="";
        String Calificacion ="";
        
        for(int i=0; i<numero;i++){
            String nombre = JOptionPane.showInputDialog(null, ("Ingrese el nombre del jugador: " + (i+1)));
            for(int j=0;j<10; j++){
                int punto = Integer.parseInt(JOptionPane.showInputDialog(null,("Ingrese el puntaje del partido: " + (j+1))));
                puntos+=punto;
            }
            if(puntos>mayor){//aqui evalua cual es el mejor puntaje y el poer
               mayor=puntos;
               nombreMejor = nombre;
               puntajeMejor = mayor;
            } 
            if(puntos<menor){
                menor = puntos;
                NombrePeor = nombre;
                puntajePeor= menor;
            }
              
            if (puntos <40) {//aqui evalua si es deficiente o bueno o excelente
                Calificacion="Deficiente";
            } else if(puntos>=40&&puntos<=90){
                Calificacion= "Bueno";
            } else if(puntos >90){
                Calificacion= "Excelente";
            }
        datos = ("El jugador: " + nombre + " obtuvo: " + puntos + " nivel de juego: " +Calificacion+"\n");
        jugadores += datos;
        total +=puntos;
        puntos=0;
        }        
    }    
}

