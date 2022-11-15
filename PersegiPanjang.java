package uts;
public class PersegiPanjang {
    // atribut
    private int panjang;
    private int lebar;
    private double luas;
     
    // setter method untuk panjang
    public void setPanjang(int p){
        if (p > 0){
            this.panjang = p;
        } else {
            this.panjang = 0;
        }
    }
     
    
    public void setLebar(int l){
        if (l > 0){
            this.lebar = l;
        } else {
            this.lebar = 0;
        }
    }
     
    
    public double getLuas(){
        // menghitung luas
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
}