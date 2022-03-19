
package tugas;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;




public class Tugas  {
    public static void main(String[] args) {       
        new GUI();
         double pan,leb,ting;
}
   
}
 class GUI extends JFrame implements ActionListener  {
         JLabel judul = new JLabel ("Kalkulator Cuboid ");
    JLabel panjang = new JLabel ("Panjang : ");
    JTextField p = new JTextField(10);
    JLabel lebar = new JLabel ("Lebar : ");
    JTextField l = new JTextField(10);
    JLabel tinggi = new JLabel ("Tinggi : ");
    JTextField t = new JTextField(10);
    JButton hasil = new JButton ("Hasil");
    JButton reset = new JButton ("Reset");
    JLabel result = new JLabel ("Result : ");
    JTextField res = new JTextField(500); 
    JLabel lpersegi = new JLabel("");
    JLabel kpersegi = new JLabel("");
    JLabel lpbalok = new JLabel("");
    JLabel vbalok = new JLabel("");
    JLabel gambar = new JLabel(new ImageIcon(getClass().getResource("t.png")));
    
    
    
      public GUI() {
    setTitle("Menghitung Balok dan Persegi Panjang");
    setSize(500,500);
    setLayout(null);
    add(judul);
    add(panjang);
    add(p);
    add(lebar);
    add(l);
    add(tinggi);
    add(t);
    add(hasil);
    add(reset);
    add(result);
    add(res);
    add(lpersegi);
    add(kpersegi);
    add(lpbalok);
    add(vbalok);
    add(gambar);
    
    judul.setBounds(180,30,150,50);
    panjang.setBounds(70,100,120,30);
    p.setBounds(170,100,200,30);
    lebar.setBounds(70,160,120,30);
    l.setBounds(170,160,200,30);
    tinggi.setBounds(70,220,120,30);
    t.setBounds(170,220,200,30);
    result.setBounds(120,250,120,30);
    hasil.setBounds(130,420,70,20);
    reset.setBounds(260,420,70,20);
    gambar.setBounds(0,0,getWidth(),getHeight());
    //res.setBounds(130,285,250,120);
    setLocationRelativeTo(this);
    
    
    hasil.addActionListener(this);
    reset.addActionListener(this);
 //  p.setBounds()
 setVisible(true);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 


    }
       
      public void actionPerformed(ActionEvent e){
          double pan, leb,ting;
          
          if (e.getSource()== hasil){
              
              
           try{
               pan = Double.parseDouble(p.getText());
              leb = Double.parseDouble(l.getText());
           ting = Double.parseDouble(t.getText());
            Balok balok = new Balok (pan,leb,ting);
              PersegiPanjang persegi = new PersegiPanjang (pan,leb,ting);
              persegi.luas();
              persegi.keliling();
              balok.volume();
              balok.luasPermukaan();
              
              lpersegi.setBounds(90,285,500,30);
              kpersegi.setBounds(90,305,500,30);
              lpbalok.setBounds(90,325,500,30);
              vbalok.setBounds(90,345,500,30);
              lpersegi.setText("Luas Persegi Panjang         :   "  + persegi.templp);
              kpersegi.setText("keliling Persegi Panjang     :   " +persegi.tempk);
              lpbalok.setText ("Luas Permukaan Balok        :   "+balok.templp);
              vbalok.setText ("Luas Permukaan Balok        :   " +balok.tempv);
           }
           catch(Exception ex){
               JOptionPane.showMessageDialog(null, "Inputan Harus Berupa Angka");
           }
             
        
              
              
              
          }
          
          if(e.getSource()==reset){
              lpersegi.setText(null);
              kpersegi.setText(null);
              lpbalok.setText(null);
              vbalok.setText(null);
              p.setText(null);
              l.setText(null);
              t.setText(null);
          }
      }
 }
