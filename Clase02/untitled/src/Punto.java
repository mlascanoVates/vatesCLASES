import static java.lang.Math.sqrt;

public class Punto {
        private int x,y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public Punto(int x, int y){
            this.x=x;
            this.y=y;
        }

        public String toString(){
            return "Punto: "+ x + ";" +y + " Se encuentra en el cuadrante: " + getCuadrante() + ". Su distancia al origen es: " + distanciaOrigen();
        }

        public int getCuadrante(){
            int cuadrante=0;
            if(x>0 && y>0) return 1;
            else if(x<0 && y>0) return 2;
            else if(x<0 && y<0) return 3;
            else if(x>0 && y<0) return 4;

            return 0;

        }


        public double distanciaOrigen(){
            double valor=0;

            //se puede usar metodo pow
            valor= sqrt(x*x+y*y);
            return valor;
        }
    }

