class Tenis{
    static Tenis jugador_a = new Tenis();
    static Tenis jugador_b = new Tenis();
    static Tenis score = new Tenis();
    int tiros_jugador_a;
    int tiros_jugador_b;
    int puntos_a[];
    int puntos_b[];
    int tiros = 0;
    String cero ="LOVE";
    String ventaja ="ADVANTAGE";
    
    public Tenis(){}

    public void setPuntos(Tenis ob){
        this.tiros++;
        if(tiros < 3){
            if(ob == Tenis.jugador_a){
                this.puntos_a[tiros_jugador_a++] = 15;
            }else{
                this.puntos_b[tiros_jugador_b++] = 15;
            }
        }else{
            if(ob == Tenis.jugador_a){
                this.puntos_a[tiros_jugador_a++] = 10;
            }else{
                this.puntos_b[tiros_jugador_b++] = 10;
            }
        }
        score.score();
    }
    
    public int getPuntos(Tenis ob){
        if(ob == Tenis.this.jugador_a){
            return this.puntos_a[1];
        }else{
            return this.puntos_b[1];
        }
    }
    
    public void score(){
        if(jugador_a.getPuntos(jugador_a) == 0){
            System.out.println("jugador A ( " + cero +" - " + jugador_b.getPuntos(jugador_b)+" ) jugador B ");
        }
        if(jugador_b.getPuntos(jugador_b) == 0){
            System.out.println("jugador A ( " + jugador_a.getPuntos(jugador_a) +" - " + cero+" ) jugador B ");
        }
        else{
            System.out.println("jugador A ( " + jugador_a.getPuntos(jugador_a)+" - " + jugador_b.getPuntos(jugador_b)+" ) jugador B ");
        }
        if(jugador_a.getPuntos(jugador_a) == 40 && jugador_b.getPuntos(jugador_b) == 40){
            System.out.println("Douce");
        }
        if(jugador_a.getPuntos(jugador_a) == 40){
            System.out.println("Gana jugador A: " +jugador_a.getPuntos(jugador_a));
        }
        if(jugador_a.getPuntos(jugador_a) == 40){
            System.out.println("Gana jugador B: " +jugador_b.getPuntos(jugador_b));
        }
    }

    public static void main(String []a){
            jugador_a.setPuntos(jugador_a);
            jugador_b.setPuntos(jugador_b);
            jugador_a.setPuntos(jugador_a);
            jugador_b.setPuntos(jugador_b);
            jugador_a.setPuntos(jugador_a);
            jugador_b.setPuntos(jugador_b);
            System.out.println(jugador_a.getPuntos(jugador_a));
            //jugador_a.setPuntos(jugador_a);
            //jugador_a.setPuntos(jugador_a);
           //jugador_b.setPuntos(jugador_b);
            //jugador_b.setPuntos(jugador_b);
           // jugador_b.setPuntos(jugador_b);
           // jugador_b.setPuntos(jugador_b);
           // jugador_b.setPuntos(jugador_b); 
           //jugador_b.setPuntos(jugador_b); 
        //todas.score();
        //jugador_a.ganador();
        //jugador_b.ganador();
    }
}