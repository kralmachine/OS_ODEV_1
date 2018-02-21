
package os_odev_1;

public class MultiThread implements Runnable{

    int[] gelenSayilar;
    int bas,bit;
    static int max=0;
    public MultiThread(int[] gelenSayilar,int bas,int bit) {
        this.gelenSayilar=gelenSayilar;
        this.bas=bas;
        this.bit=bit;
    }
  
    @Override
    public void run() {   
      
      enbuyukDeger(gelenSayilar);
     
    }
    
    public synchronized void enbuyukDeger(int[] gelenSayilar){
        
         for(int i=bas;i<bit;i++){
           
            if(max<gelenSayilar[i]){
                max=gelenSayilar[i];
            }
        }
    }
    
}
