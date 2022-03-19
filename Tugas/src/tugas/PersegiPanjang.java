
package tugas;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PersegiPanjang extends variabel implements MenghitungBidang{

   double templp,tempk;
    public PersegiPanjang(double p,double l,double t){
        super(p,l,t);
}
   

    @Override
    public void luas() {
        double luasPersegiPanjang;
        luasPersegiPanjang = p * l ;
        templp=luasPersegiPanjang;
   
    }

    @Override
    public void keliling() {
        double kelPersegiPanjang;
        kelPersegiPanjang = 2 *(p + l);
        
        tempk=kelPersegiPanjang;
    }
}