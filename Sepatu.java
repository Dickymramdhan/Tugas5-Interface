/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Sepatu {
    public String Merk = "All Start";
    
    public String Warna = "Putih Hitam";
    
    /*Interface tidak dapat diinisiasi*/
    public static void main(String[]args){
        Sepatu Sep = new Sepatu();
    }
}

/*class Abstract dapat mengimplements interface dengan bebas*/

public abstract class abstract implements Hewan{
    protected String getMerk(){
        return this.merk;
    }
    
    /* implement variable interface*/
    
    public class impl implements Interface{
        public static void main (String[]args){
            impl hi = new impl();
            hi.Merk;
            hi.Warna;
        }
    }
}
