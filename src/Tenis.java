import java.util.*;

class Tenis{
    static ArrayList puntos_jugador_a = new ArrayList();
    static ArrayList puntos_jugador_b = new ArrayList();
    static Tenis jugador_a = new Tenis();
    static Tenis jugador_b = new Tenis();
    static Tenis player = new Tenis();
    int tiros_jugador_a;
    int tiros_jugador_b;
    String puntos_nombre[] = {"fefteen", "thirty","fourteen}"};
    int tiros = 0;
    String cero ="LOVE";
    String all="ALL";
    String ventaja ="ADVANTAGE";
    
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
        //score.score();
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
    
    public void ganador(){
        if(getJugadorA() >= 40 && getJugadorB() < 40){
            System.out.println("ganador A");
        }
        if(getJugadorA() < 40 && getJugadorB() >= 40){
            System.out.println("ganador B");
        }
        if(getJugadorA() == 40 && getJugadorB() == 40 || 
            player.getTirosJugador_a() >= 4 && player.getTirosJugador_b() >= 4 && 
            getJugadorA() == getJugadorB()){
            System.out.println("Deuce");
        }
        if(player.getTirosJugador_a() % player.getTirosJugador_b() == 2){
            System.out.println("ganador A");
        }
        if(player.getTirosJugador_b() % player.getTirosJugador_a() == 2){
            System.out.println("ganador B");
        }
    }
    
    public void score(){ 
        if(player.getJugadorA()==0 && player.getJugadorB() == 0 ){
         System.out.println("jugador A ( " + cero +" - " + all +" ) jugador B ");
        }
        else if(player.getJugadorA()==0 && player.getJugadorB()>1){
         System.out.println("jugador A ( " + cero +" - " + player.getJugadorB() +" ) jugador B ");
        }
        else if(player.getJugadorB()==0 && player.getJugadorA()>1){
         System.out.println("jugador A ( " + player.getJugadorA() +" - " + all +" ) jugador B ");
        }
          else if(player.getJugadorA()==40 && player.getJugadorB()==40 ){
         System.out.println("jugador A ( " + puntos_nombre[1] +" - " + puntos_nombre[1] +" ) jugador B "); 
        }
        else if(player.getJugadorA()>=15 && player.getJugadorB()>=15 ){
         System.out.println("jugador A ( " + player.getJugadorA() +" - " + player.getJugadorB() +" ) jugador B "); 
        }
      
    }

    public int getTirosJugador_a(){
        return Tenis.puntos_jugador_a.size();
    }

    public int getTirosJugador_b(){
        return Tenis.puntos_jugador_b.size();
    }    
    
    public static void main(String []a){
          player.setPuntos(jugador_a);
            player.setPuntos(jugador_a);
          // player.setPuntos(jugador_a);
           player.setPuntos(jugador_a);
           // player.setPuntos(jugador_a);
           // player.setPuntos(jugador_a);
            //player.setPuntos(jugador_b);
           // player.setPuntos(jugador_b);
            //player.setPuntos(jugador_b);
            player.setPuntos(jugador_b);
            player.setPuntos(jugador_b);
            player.setPuntos(jugador_b);
            //player.setPuntos(jugador_b);
            //player.setPuntos(jugador_b);
            player.score();
           // System.out.println(player.getJugadorA());
           // System.out.println(player.getJugadorB());
           player.ganador();
           // System.out.println(player.getTirosJugador_a());
           // System.out.println(player.getTirosJugador_b());
    }
}