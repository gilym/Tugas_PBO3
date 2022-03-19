
package tugas;


public class Balok extends variabel implements MenghitungRuang {
    
double tempv,templp;

   public Balok(double p,double l,double t){
        super(p,l,t);
}
 ;
    
    

   @Override
    public void volume() {
        double v;
        v = p*l*t;
        
        tempv=v;
    }

    @Override
    public void luasPermukaan() {
      double luasBal ;
      luasBal = 2 *(p*l + p*t + l*t);
        
        templp=luasBal;
    }


    
}
