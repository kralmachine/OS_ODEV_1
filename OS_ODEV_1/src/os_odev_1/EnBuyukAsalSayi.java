package os_odev_1;


public class EnBuyukAsalSayi implements Runnable{

    int[] gelenSayilar;
    int bas,bit;
    static int max=0;
    public EnBuyukAsalSayi(int[] gelenSayilar,int bas,int bit) {
        
        this.gelenSayilar=gelenSayilar;
        this.bas=bas;
        this.bit=bit;
    }
   
    @Override
    public void run() {

       enbuyukAsalSayiDegeri(gelenSayilar);
         
    }
    
     public  synchronized void enbuyukAsalSayiDegeri(int[] gelenSayilar){
    
       boolean asalDurum=false;
        for(int i=bas;i<bit;i++){
        
            for(int j=2;j<gelenSayilar[i]/2;j+=1){
                if(gelenSayilar[i]%j==0){
                    asalDurum=false;
                    break;
                }else{
                    asalDurum=true; 
                }
            }
            
          if(asalDurum)
            if(max<gelenSayilar[i])
                max=gelenSayilar[i];
        }
       
      // return max;
    }
      
}

    
    
