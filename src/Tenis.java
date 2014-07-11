import java.util.*;
class Tenis{
    static Tenis jugador_a = new Tenis();
    static Tenis jugador_b = new Tenis();
    static Tenis player = new Tenis();
    static String mi_idioma[];
    static ArrayList puntos_jugador_a = new ArrayList();
    static ArrayList puntos_jugador_b = new ArrayList();
    static int tiros_jugador_a;
    static int tiros_jugador_b;
    static String puntos_nombre_en[] = {"LOVE","fifteen", "thirteen", "fourteen", "Avantage"};
    static String puntos_nombre_es[] = {"LOVE","Quince", "Treinta", "Cuarenta", "Ventaja"};
    static String puntos_nombre_fr[] = {"LOVE","Quinze", "Trente", "Quarante", "Avantage"};

    public Tenis(){}

    public void setPuntos(Tenis ob){
        if(ob == Tenis.jugador_a && tiros_jugador_a < 2){
            puntos_jugador_a.add(15);
            tiros_jugador_a++;
        }else if(ob == Tenis.jugador_b && tiros_jugador_b < 2){
            puntos_jugador_b.add(15);
            tiros_jugador_b++;
        }
        else{
            if(ob == Tenis.jugador_a){
                puntos_jugador_a.add(10);
            }else{
                puntos_jugador_b.add(10);
            }
        }
    }
    
    public int getJugadorA(){
        int suma_puntos_a = 0;
        for (Object puntos_jugador_a1 : puntos_jugador_a) {
            suma_puntos_a += (int) puntos_jugador_a1;
        }
        return suma_puntos_a;
    }
    
    public int getJugadorB(){
       int suma_puntos_b = 0;
        for (Object puntos_jugador_b1 : puntos_jugador_b) {
            suma_puntos_b += (int) puntos_jugador_b1;
        }
        return suma_puntos_b;
    }
    
    public int ganador(){
        if(getJugadorA() >= 50 && getJugadorB() < 40){
            return 1;
        }
        if(getJugadorB() >= 50  && getJugadorA() < 40){
            return 2;
        }
        if(getJugadorA()-getJugadorB() == 20){
            return 1;
        }
        if(getJugadorB() - getJugadorA() == 20){
            return 2;
        }
        if(getJugadorA() == 40 && getJugadorB() == 40 || 
            player.getTirosJugador_a() >= 4 && player.getTirosJugador_b() >= 4 && 
            getJugadorA() == getJugadorB()){
            return 3;
        }
        if(player.getTirosJugador_a() - player.getTirosJugador_b() == 2 && player.getTirosJugador_a() >= 4){
            return 1;
        }
        if(player.getTirosJugador_b() - player.getTirosJugador_a() == 2 && player.getTirosJugador_a() >= 4){
            return 2;
        }
        return 0;
    }
    
    public void score(String idiomas[]){
        mi_idioma = idiomas;
        if(player.ganador() != 1 && player.getTirosJugador_a() < 4){
            //System.out.println(puntos_nombre_en[player.getTirosJugador_a()]);
            System.out.println(mi_idioma[player.getTirosJugador_a()]);
        }
        if(player.ganador() != 2 && player.getTirosJugador_b() < 4){
            System.out.println(mi_idioma[player.getTirosJugador_b()]);
        }
        if(player.getTirosJugador_a()-player.getTirosJugador_b() == 1 && player.getTirosJugador_a() > 3){
            System.out.println(mi_idioma[4] + " Jugador A");
            System.out.println(player.getTirosJugador_a());
        }
        if(player.getTirosJugador_b()-player.getTirosJugador_a() == 1 && player.getTirosJugador_b() > 3){
            System.out.println(mi_idioma[4] + " Jugador B");
            System.out.println(player.getTirosJugador_a());
        }
        if(player.ganador() == 1){
            System.out.println("ganador A");
        }
        if(player.ganador() == 2){
            System.out.println("ganador B");
        }
        if(player.ganador() == 3){
            System.out.println("Deuce");
        }
    }

    public int getTirosJugador_a(){
        return Tenis.puntos_jugador_a.size();
    }

    public int getTirosJugador_b(){
        return Tenis.puntos_jugador_b.size();
    }    
       
}