class Teniss{
    public static Teniss jugador_a = new Teniss();
    public static Teniss jugador_b = new Teniss();
    static Teniss todas = new Teniss();
    int puntos_a;
    int puntos_b;
    int tiros = 0;
    String cero ="LOVE";
    String ventaja ="ADVANTAGE"; 
    
    public Teniss(){}

    public void setPuntos(Teniss ob){
        this.tiros++;
        if(tiros < 3){
            if(ob == Teniss.jugador_a){
                this.puntos_a += 15;
            }else{
                this.puntos_b += 15;
            }
        }else{
            if(ob == Teniss.jugador_a){
                this.puntos_a += 10;
            }else{
                this.puntos_b += 10;
            }    
        }
        
        
    }
    
    public int getPuntos(Teniss ob){
        if(ob == Teniss.this.jugador_a){
            return this.puntos_a;
        }else{
            return this.puntos_b;
        }
    }
    
    public void score(){
        if(jugador_a.getPuntos(jugador_a)==0 ){
          System.out.println("jugador A ( " + cero +" - " + jugador_b.getPuntos(jugador_b)+" ) jugador B ");
        }
          if(jugador_b.getPuntos(jugador_b)==0 ){
          System.out.println("jugador A ( " + jugador_a.getPuntos(jugador_a) +" - " + cero+" ) jugador B ");
        }
                  else{
        System.out.println("jugador A ( " + jugador_a.getPuntos(jugador_a)+" - " + jugador_b.getPuntos(jugador_b)+" ) jugador B ");
        }
    }

    public void ganador(){
        if( jugador_a.getPuntos(jugador_a) == jugador_b.getPuntos(jugador_b)){
            System.out.println("deuce");  
        }else if(this.puntos_a == 50){
            System.out.println(ventaja + " para el jugador A");
             System.out.println("total de tiros: " + tiros);
        }else if(this.puntos_b == 50){
            System.out.println(ventaja + " para el jugador B");
            System.out.println("total de tiros: " + tiros);    
        }
        else if(this.puntos_b >= 60){
            System.out.println("el ganador es B");
            System.out.println("total de tiros: " + tiros);
        }
        else if(this.puntos_a >= 60){
            System.out.println("el ganador es A");
            System.out.println("total de tiros: " + tiros);
            
        }
        
    }
    
    public static void main(String []a){
        
            jugador_a.setPuntos(jugador_a);
            jugador_a.setPuntos(jugador_a);
            //jugador_a.setPuntos(jugador_a);
            //jugador_a.setPuntos(jugador_a);
            //jugador_a.setPuntos(jugador_a);
           //jugador_b.setPuntos(jugador_b);
            jugador_b.setPuntos(jugador_b);
            jugador_b.setPuntos(jugador_b);
           // jugador_b.setPuntos(jugador_b);
           // jugador_b.setPuntos(jugador_b); 
           //jugador_b.setPuntos(jugador_b); 
        todas.score();
        jugador_a.ganador();
        jugador_b.ganador();
    }
}