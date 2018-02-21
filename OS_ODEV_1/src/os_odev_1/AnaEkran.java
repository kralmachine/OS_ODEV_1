
package os_odev_1;


import java.util.ArrayList;
import java.util.Random;


public class AnaEkran extends javax.swing.JFrame {
  
    Random random=new Random();
    int[] girilenSayilar;
    int gelenSayiAdet,gelenThreadAdet;
    
    ArrayList<Thread> multiThreads=new ArrayList<Thread>();
   
  
    ///////////////////////////////////////////////////////////
    int[] sayilar={1,2,3,4,2,1,5,6,2,1,2,3,7,6,3,2,1,2,3,6};
    int faultCounter=0;
    int[] fifo,Lru,optimal;
    int[] gecici;
    int coutNumber=0;
    boolean isDurum=true;
    int hitCounter=0;
    public static int indexCanavari=-1;
    static int index;
    static int say=0;
    static int gonderilenI=-1;
    ///////////////////////////////////////////////////////////
    
    public AnaEkran() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnKacSayi = new javax.swing.JButton();
        txtGirilenKacSayi = new javax.swing.JTextField();
        btnEnBuyukSayiAramayiBaslat = new javax.swing.JButton();
        btnThreadSayisi = new javax.swing.JButton();
        txtGirilenThreadSayisi = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnKacSayiAdetIkinci = new javax.swing.JButton();
        btnEnBuyukAsalSayiBaslat = new javax.swing.JButton();
        btnGirilenThreadSayisiIkinci = new javax.swing.JButton();
        txtSayiAdetGirinizIkınci = new javax.swing.JTextField();
        txtGirilenThreadSayisiIkinci = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnUcuncuSoruCozumu = new javax.swing.JButton();
        btnFifoIslemi = new javax.swing.JButton();
        btnOptimalIslemi = new javax.swing.JButton();
        btnLruIslemi = new javax.swing.JButton();
        btnTumSayfalama = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MULTIHREAD İŞLEMİ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("BİRİNCİ SORU"));

        btnKacSayi.setText("KAÇ SAYI");
        btnKacSayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKacSayiActionPerformed(evt);
            }
        });

        btnEnBuyukSayiAramayiBaslat.setText("EN BÜYÜK SAYIYI ARAMAYI BAŞLAT");
        btnEnBuyukSayiAramayiBaslat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnBuyukSayiAramayiBaslatActionPerformed(evt);
            }
        });

        btnThreadSayisi.setText("THREAD SAYISI");
        btnThreadSayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreadSayisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKacSayi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGirilenKacSayi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnBuyukSayiAramayiBaslat)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThreadSayisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGirilenThreadSayisi))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGirilenKacSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGirilenThreadSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKacSayi)
                            .addComponent(btnThreadSayisi)))
                    .addComponent(btnEnBuyukSayiAramayiBaslat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("İKİNCİ SORU"));

        btnKacSayiAdetIkinci.setText("KAÇ SAYI");
        btnKacSayiAdetIkinci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKacSayiAdetIkinciActionPerformed(evt);
            }
        });

        btnEnBuyukAsalSayiBaslat.setText("EN BÜYÜK ASAL SAYI BAŞLAT");
        btnEnBuyukAsalSayiBaslat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnBuyukAsalSayiBaslatActionPerformed(evt);
            }
        });

        btnGirilenThreadSayisiIkinci.setText("GİRİLEN THREAD SAYISI");
        btnGirilenThreadSayisiIkinci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirilenThreadSayisiIkinciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSayiAdetGirinizIkınci)
                    .addComponent(btnKacSayiAdetIkinci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addComponent(btnEnBuyukAsalSayiBaslat, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGirilenThreadSayisiIkinci, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGirilenThreadSayisiIkinci))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEnBuyukAsalSayiBaslat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtSayiAdetGirinizIkınci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtGirilenThreadSayisiIkinci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKacSayiAdetIkinci)
                            .addComponent(btnGirilenThreadSayisiIkinci))))
                .addGap(32, 32, 32))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("ÜÇÜNCÜ SORU"));

        btnUcuncuSoruCozumu.setText("3.SORU CEVAP 1.SORU VE 2.SORU KULLAN");
        btnUcuncuSoruCozumu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUcuncuSoruCozumuActionPerformed(evt);
            }
        });

        btnFifoIslemi.setText("FIFO");
        btnFifoIslemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFifoIslemiActionPerformed(evt);
            }
        });

        btnOptimalIslemi.setText("OPTIMAL ");
        btnOptimalIslemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptimalIslemiActionPerformed(evt);
            }
        });

        btnLruIslemi.setText("LRU");
        btnLruIslemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLruIslemiActionPerformed(evt);
            }
        });

        btnTumSayfalama.setText("TÜM SAYFALAMA");
        btnTumSayfalama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTumSayfalamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnUcuncuSoruCozumu, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTumSayfalama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLruIslemi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOptimalIslemi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFifoIslemi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnUcuncuSoruCozumu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(btnFifoIslemi)
                .addGap(5, 5, 5)
                .addComponent(btnOptimalIslemi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLruIslemi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTumSayfalama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKacSayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKacSayiActionPerformed
       
        gelenSayiAdet=Integer.valueOf(txtGirilenKacSayi.getText());
        girilenSayilar=new int[gelenSayiAdet];
        for(int i=0;i<gelenSayiAdet;i++){
            girilenSayilar[i]=random.nextInt(1000000);
        }
                   
    }//GEN-LAST:event_btnKacSayiActionPerformed

    private void btnThreadSayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreadSayisiActionPerformed
        
         gelenThreadAdet=Integer.valueOf(txtGirilenThreadSayisi.getText());
     
    }//GEN-LAST:event_btnThreadSayisiActionPerformed

    private void btnKacSayiAdetIkinciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKacSayiAdetIkinciActionPerformed
      
         gelenSayiAdet=Integer.valueOf(txtSayiAdetGirinizIkınci.getText());
        girilenSayilar=new int[gelenSayiAdet];
        for(int i=0;i<gelenSayiAdet;i++){
            girilenSayilar[i]=random.nextInt(1000000);
        }
        
    }//GEN-LAST:event_btnKacSayiAdetIkinciActionPerformed

    private void btnGirilenThreadSayisiIkinciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirilenThreadSayisiIkinciActionPerformed
       
      gelenThreadAdet=Integer.valueOf(txtGirilenThreadSayisiIkinci.getText());
                
    }//GEN-LAST:event_btnGirilenThreadSayisiIkinciActionPerformed

    private void veriEkle(int girilenSayi){
        
        gelenSayiAdet=girilenSayi;
        girilenSayilar=new int[gelenSayiAdet];
        for(int i=0;i<gelenSayiAdet;i++){
            girilenSayilar[i]=random.nextInt(1000000);
        }
        
    }
    private void btnUcuncuSoruCozumuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUcuncuSoruCozumuActionPerformed
      
        int[] threadCount={2,4,8};
         veriEkle(1000000);
          
          for(int index=0;index<threadCount.length;index++){
              
            multiThreads.clear();
              
            long start=System.nanoTime();
            
            int bas=0,bit=0;
            int aralik;
            
            aralik=gelenSayiAdet/threadCount[index];
            bit=aralik;
            
            for(int i=0;i<threadCount[index];i++){
                multiThreads.add(new Thread(new MultiThread(girilenSayilar,bas,bit)));
                bas+=aralik;
                bit+=aralik;
            }
            
           
            for(int i=0;i<multiThreads.size();i++){
              multiThreads.get(i).start();
            }
          
           boolean finish = false;
            
            do{
                finish = false;
                for (int i = 0; i <multiThreads.size(); i++) {
                    if(multiThreads.get(i).isAlive()){
                          finish=true;
                          break;
                    }
                }
            }while(finish);
            
            for(int i=0;i<multiThreads.size();i++){
              multiThreads.get(i).stop();
            }
           
          
            long end=System.nanoTime();
            
            System.out.printf("\n"+multiThreads.size()+" adet thread'de en büyük  sayi bulma süresi %.2g saniyedir\n--------------------------\n", (double)((end-start)/1e9)/multiThreads.size());
             
            
         }
          
          for(int index=0;index<threadCount.length;index++){
              
            multiThreads.clear(); 
            int bas=0,bit;
            int aralik;
            
            aralik=gelenSayiAdet/threadCount[index];
            long start=System.nanoTime();  
            bit=aralik;
            for(int i=0;i<threadCount[index];i++){
                 multiThreads.add(new Thread(new EnBuyukAsalSayi(girilenSayilar,bas,bit)));
                 bas+=aralik;
                 bit+=aralik;
            }
           
            
            for(int i=0;i<multiThreads.size();i++){
                  multiThreads.get(i).start();
            }
            
            
             boolean finish = false;
            
            do{
                finish = false;
                for (int i = 0; i <multiThreads.size(); i++) {
                    if(multiThreads.get(i).isAlive()){
                          finish=true;
                          break;
                    }
                }
            }while(finish);
           
          
            for(int i=0;i<multiThreads.size();i++){
              multiThreads.get(i).stop();
            }
            
            long end=System.nanoTime();
            
            System.out.printf("\n"+multiThreads.size()+" adet thread'de en büyük asal sayi bulma süresi %.2g saniyedir\n--------------------------\n", (double)((end-start)/1e9)/multiThreads.size());
              
              
          }
          
         
    }//GEN-LAST:event_btnUcuncuSoruCozumuActionPerformed
 
    private  int indexBul(int indexFind) {
        
        indexFind++;
        indexCanavari++;
        if(indexFind==3){
            indexFind=0;
            indexCanavari=0;
        }
        
        return indexFind;
    }
    
     private  int indexBul4(int indexFind) {
        
        indexFind++;
        indexCanavari++;
        if(indexFind==4){
            indexFind=0;
            indexCanavari=0;
        }
        
        return indexFind;
    }
     
       private  int indexBul5(int indexFind) {
        
        indexFind++;
        indexCanavari++;
        if(indexFind==5){
            indexFind=0;
            indexCanavari=0;
        }
        
        return indexFind;
    }
    
    private void btnFifoIslemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFifoIslemiActionPerformed
        
          fifo=new int[3];
          gecici=new int[3];
          
          indexCanavari=-1;
          index=-1;
          faultCounter=0;
          hitCounter=0;
          coutNumber=0;
          
          for(int i=0;i<fifo.length;i++){
              fifo[i]=-1;
              gecici[i]=-1;
          }
          
          for(int i=0;i<sayilar.length;i++){
              if(isEmpty(fifo)){
                  
                  for(int k=0;k<fifo.length;k++){
                          if(fifo[k]==sayilar[i]){
                             isDurum=false;
                              break;
                          } 
                          else{
                             isDurum=true;
                          }
                      }
                          
                  if(isDurum){
                       index=indexBul(indexCanavari);
                       fifo[index]=sayilar[i];
                       faultCounter++;
                       isDurum=false;
                  }else{
                       hitCounter++;
                  }
                
              }else{
                     
                      for(int k=0;k<fifo.length;k++){
                          
                                if(fifo[k]==sayilar[i]){
                                    isDurum=false;
                                    break;
                                } else{
                                    isDurum=true;
                                }                                            
                      }
                      
                      if(isDurum){
                          fifo[coutNumber]=sayilar[i];
                          gecici[coutNumber]=sayilar[i];
                          coutNumber++;
                          faultCounter++;
                          isDurum=false;
                      }
                  
        
              }
          } 
          
        System.out.println(" FIFO Fault Sayisi :"+faultCounter);
        System.err.println(" FIFO Hit SAyisi :"+hitCounter);
        System.out.println("-------------------------------------------------");
         
    }//GEN-LAST:event_btnFifoIslemiActionPerformed

    
    private void btnLruIslemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLruIslemiActionPerformed
        
         Lru=new int[3];
         gecici=new int[3];
          
         indexCanavari=-1;
         index =-1;
         faultCounter=0;
         hitCounter=0;
         coutNumber=0;
          
         
          for(int i=0;i<Lru.length;i++){
              Lru[i]=-1;
              gecici[i]=-1;
          }
          
          for(int i=0;i<sayilar.length;i++){
             
              if(isEmpty(Lru)){
                  
                  for(int k=0;k<Lru.length;k++){
                          if(Lru[k]==sayilar[i]){
                             isDurum=false;
                              break;
                          } 
                          else{
                             isDurum=true;
                          }
                      }
                          
                  if(isDurum){
                     
                       index=indexBul(indexCanavari);
                       Lru[index]=sayilar[i];
                       faultCounter++;
                       isDurum=false;
                  }else{
                      index=indexBul(indexCanavari);
                      hitCounter++;
                  }
                
              }else{
                     
                      for(int k=0;k<Lru.length;k++){
                          
                                if(Lru[k]==sayilar[i]){
                                    isDurum=false;
                                    break;
                                } else{
                                    isDurum=true;
                                }                                            
                      }
                      
                      if(isDurum){
                          Lru[coutNumber]=sayilar[i];
                          gecici[i]=sayilar[i];
                          coutNumber++;
                          faultCounter++;
                          isDurum=false;
                      }
                  
        
              }
          } 
          
          faultCounter++;
          hitCounter--;
        System.out.println(" LRU Fault Sayisi :"+faultCounter);
        System.out.println(" LRU Hit SAyisi :"+hitCounter);
        System.out.println("-------------------------------------------------");
        
    }//GEN-LAST:event_btnLruIslemiActionPerformed

     private int getIndexOptimal(int[] optimal,int j) {
       int temp=-1;
       say=0;
       int index=-1,i=0;
       boolean durum=false;
       int[] dizi=new int[3];
       
        for(int k=0;k<optimal.length;k++){
            
            for(i=j;i<sayilar.length;i++){
           
               if(optimal[k]==sayilar[i]){
                   durum=true;
                   break;
                   
               }else{
                   durum=false;
               }

           }
            
             if(durum){
                 
                   dizi[say]=i;
                   say++;
                   durum=false;
                   
               }else{
                    dizi[say]=100;
                    say++;
               }   
           
       }
        
        temp=dizi[0];
        index=0;
        for(int k=1;k<3;k++){
            if(temp<dizi[k]){
                temp=dizi[k];
            }         
        }
        
        if(temp==dizi[0])
            index=0;
        else if(temp==dizi[1])
            index=1;
        else if(temp==dizi[2])
            index=2;
        else{
            ;
        }
        
       
       return index;
    }
    
      private int getIndexOptimal4(int[] optimal,int j) {
       int temp=-1;
       say=0;
       int index=-1,i=0;
       boolean durum=false;
       int[] dizi=new int[4];
       
        for(int k=0;k<optimal.length;k++){
            
            for(i=j;i<sayilar.length;i++){
           
               if(optimal[k]==sayilar[i]){
                   durum=true;
                   break;
                   
               }else{
                   durum=false;
               }

           }
            
             if(durum){
                 
                   dizi[say]=i;
                   say++;
                   durum=false;
                   
               }else{
                    dizi[say]=100;
                    say++;
               }   
           
       }
        
        temp=dizi[0];
        index=0;
        for(int k=1;k<4;k++){
            if(temp<dizi[k]){
                temp=dizi[k];
            }         
        }
        
        if(temp==dizi[0])
            index=0;
        else if(temp==dizi[1])
            index=1;
        else if(temp==dizi[2])
            index=2;
        else if(temp==dizi[3])
            index=3;
        else{
            ;
        }
        
       
       return index;
    }
    
      
     private int getIndexOptimal5(int[] optimal,int j) {
       int temp=-1;
       say=0;
       int index=-1,i=0;
       boolean durum=false;
       int[] dizi=new int[5];
       
        for(int k=0;k<optimal.length;k++){
            
            for(i=j;i<sayilar.length;i++){
           
               if(optimal[k]==sayilar[i]){
                   durum=true;
                   break;
                   
               }else{
                   durum=false;
               }

           }
            
             if(durum){
                 
                   dizi[say]=i;
                   say++;
                   durum=false;
                   
               }else{
                    dizi[say]=100;
                    say++;
               }   
           
       }
        
        temp=dizi[0];
        index=0;
        for(int k=1;k<5;k++){
            if(temp<dizi[k]){
                temp=dizi[k];
            }         
        }
        
        if(temp==dizi[0])
            index=0;
        else if(temp==dizi[1])
            index=1;
        else if(temp==dizi[2])
            index=2;
        else if(temp==dizi[3])
            index=3;
        else if(temp==dizi[4])
            index=4;
        else{
            ;
        }
        
       
       return index;
    }
      
     
    private void btnOptimalIslemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptimalIslemiActionPerformed
       
        
         optimal=new int[3];
         gecici=new int[3];
          
          indexCanavari=-1;
          index=-1;
          faultCounter=0;
          hitCounter=0;
          coutNumber=0;
          
          for(int i=0;i<optimal.length;i++){
              optimal[i]=-1;
              gecici[i]=-1;
          }
          
          for(int i=0;i<sayilar.length;i++){
              if(isEmpty(optimal)){
                  
                  for(int k=0;k<optimal.length;k++){
                          if(optimal[k]==sayilar[i]){
                             isDurum=false;
                              break;
                          } 
                          else{
                             isDurum=true;
                          }
                      }
                          
                  if(isDurum){
                      gonderilenI=i;
                       index=getIndexOptimal(optimal,gonderilenI);
                       optimal[index]=sayilar[i];
                       faultCounter++;
                       isDurum=false;
                        
                  }else{
                      
                       //index=getIndexOptimal(optimal,i);
                       hitCounter++;
                       
                  }
                
              }else{
                     
                      for(int k=0;k<optimal.length;k++){
                          
                                if(optimal[k]==sayilar[i]){
                                    isDurum=false;
                                    break;
                                } else{
                                    isDurum=true;
                                }                                            
                      }
                      
                      if(isDurum){
                          optimal[coutNumber]=sayilar[i];
                          gecici[coutNumber]=sayilar[i];
                          coutNumber++;
                          faultCounter++;
                          isDurum=false;
                      }
                  
        
              }
          }
          
        System.out.println(" OPTIMAL Fault Sayisi :"+faultCounter);
        System.out.println(" OPTIMAL Hit SAyisi :"+hitCounter);
        System.out.println("-------------------------------------------------");
    }//GEN-LAST:event_btnOptimalIslemiActionPerformed

    private void btnTumSayfalamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTumSayfalamaActionPerformed
      
        //4 DEĞERİ İÇİN YAPILAN DÜZENLEME  HEPSİ İÇİN
        
        //FIFO
        /////////////////////////////////////////////////
        
          fifo=new int[4];
          gecici=new int[4];
          
          indexCanavari=-1;
          index=-1;
          faultCounter=0;
          hitCounter=0;
          coutNumber=0;
          
          for(int i=0;i<fifo.length;i++){
              fifo[i]=-1;
              gecici[i]=-1;
          }
          
          for(int i=0;i<sayilar.length;i++){
              if(isEmpty4(fifo)){
                  
                  for(int k=0;k<fifo.length;k++){
                          if(fifo[k]==sayilar[i]){
                             isDurum=false;
                              break;
                          } 
                          else{
                             isDurum=true;
                          }
                      }
                          
                  if(isDurum){
                       index=indexBul4(indexCanavari);
                       fifo[index]=sayilar[i];
                       faultCounter++;
                       isDurum=false;
                  }else{
                       hitCounter++;
                  }
                
              }else{
                     
                      for(int k=0;k<fifo.length;k++){
                          
                                if(fifo[k]==sayilar[i]){
                                    isDurum=false;
                                    break;
                                } else{
                                    isDurum=true;
                                }                                            
                      }
                      
                      if(isDurum){
                          fifo[coutNumber]=sayilar[i];
                          gecici[coutNumber]=sayilar[i];
                          coutNumber++;
                          faultCounter++;
                          isDurum=false;
                      }
                  
        
              }
          } 
          
        System.out.println(" FIFO 4 Fault Sayisi :"+faultCounter);
        System.out.println(" FIFO 4 Hit SAyisi :"+hitCounter);
        
        
        /////////////////////////////////////////////////
        
        
        //LRU
        /////////////////////////////////////////////////
        
         Lru=new int[4];
         gecici=new int[4];
          
         indexCanavari=-1;
         index =-1;
         faultCounter=0;
         hitCounter=0;
         coutNumber=0;
          
         
          for(int i=0;i<Lru.length;i++){
              Lru[i]=-1;
              gecici[i]=-1;
          }
          
          for(int i=0;i<sayilar.length;i++){
             
              if(isEmpty4(Lru)){
                  
                  for(int k=0;k<Lru.length;k++){
                          if(Lru[k]==sayilar[i]){
                             isDurum=false;
                              break;
                          } 
                          else{
                             isDurum=true;
                          }
                      }
                          
                  if(isDurum){
                     
                       index=indexBul4(indexCanavari);
                       Lru[index]=sayilar[i];
                       faultCounter++;
                       isDurum=false;
                  }else{
                      index=indexBul4(indexCanavari);
                      hitCounter++;
                  }
                
              }else{
                     
                      for(int k=0;k<Lru.length;k++){
                          
                                if(Lru[k]==sayilar[i]){
                                    isDurum=false;
                                    break;
                                } else{
                                    isDurum=true;
                                }                                            
                      }
                      
                      if(isDurum){
                          Lru[coutNumber]=sayilar[i];
                          gecici[i]=sayilar[i];
                          coutNumber++;
                          faultCounter++;
                          isDurum=false;
                      }
                  
        
              }
          } 
          
          faultCounter++;
          hitCounter--;
        System.out.println(" LRU 4 Fault Sayisi :"+faultCounter);
        System.out.println(" LRU 4 Hit SAyisi :"+hitCounter);
        
        /////////////////////////////////////////////////
        
        //OPTIMAL
        /////////////////////////////////////////////////
        
         optimal=new int[4];
         gecici=new int[4];
          
          indexCanavari=-1;
          index=-1;
          faultCounter=0;
          hitCounter=0;
          coutNumber=0;
          
          for(int i=0;i<optimal.length;i++){
              optimal[i]=-1;
              gecici[i]=-1;
          }
          
          for(int i=0;i<sayilar.length;i++){
              if(isEmpty4(optimal)){
                  
                  for(int k=0;k<optimal.length;k++){
                          if(optimal[k]==sayilar[i]){
                             isDurum=false;
                              break;
                          } 
                          else{
                             isDurum=true;
                          }
                      }
                          
                  if(isDurum){
                      gonderilenI=i;
                       index=getIndexOptimal4(optimal,gonderilenI);
                       optimal[index]=sayilar[i];
                       faultCounter++;
                       isDurum=false;
                  }else{
                      
                       //index=getIndexOptimal(optimal,i);
                       hitCounter++;
                       
                  }
                
              }else{
                     
                      for(int k=0;k<optimal.length;k++){
                          
                                if(optimal[k]==sayilar[i]){
                                    isDurum=false;
                                    break;
                                } else{
                                    isDurum=true;
                                }                                            
                      }
                      
                      if(isDurum){
                          optimal[coutNumber]=sayilar[i];
                          gecici[coutNumber]=sayilar[i];
                          coutNumber++;
                          faultCounter++;
                          isDurum=false;
                      }
                  
        
              }
          } 
          
        System.out.println(" OPTIMAL 4 Fault Sayisi :"+faultCounter);
        System.out.println(" OPTIMAL 4 Hit SAyisi :"+hitCounter);
        
        /////////////////////////////////////////////////
        
        System.out.println("----------------------------------------------------");
        
        ////////////////////////////////////////////////
        
        
        //5 DEĞERİ İÇİN YAPILAN DÜZENLEME  HEPSİ İÇİN
        
        //FIFO
        /////////////////////////////////////////////////
        
          fifo=new int[5];
          gecici=new int[5];
          
          indexCanavari=-1;
          index=-1;
          faultCounter=0;
          hitCounter=0;
          coutNumber=0;
          
          for(int i=0;i<fifo.length;i++){
              fifo[i]=-1;
              gecici[i]=-1;
          }
          
          for(int i=0;i<sayilar.length;i++){
              if(isEmpty5(fifo)){
                  
                  for(int k=0;k<fifo.length;k++){
                          if(fifo[k]==sayilar[i]){
                             isDurum=false;
                              break;
                          } 
                          else{
                             isDurum=true;
                          }
                      }
                          
                  if(isDurum){
                       index=indexBul5(indexCanavari);
                       fifo[index]=sayilar[i];
                       faultCounter++;
                       isDurum=false;
                  }else{
                       hitCounter++;
                  }
                
              }else{
                     
                      for(int k=0;k<fifo.length;k++){
                          
                                if(fifo[k]==sayilar[i]){
                                    isDurum=false;
                                    break;
                                } else{
                                    isDurum=true;
                                }                                            
                      }
                      
                      if(isDurum){
                          fifo[coutNumber]=sayilar[i];
                          gecici[coutNumber]=sayilar[i];
                          coutNumber++;
                          faultCounter++;
                          isDurum=false;
                      }
                  
        
              }
          } 
          
        System.out.println(" FIFO 5 Fault Sayisi :"+faultCounter);
        System.out.println(" FIFO 5 Hit SAyisi :"+hitCounter);
        
        
        /////////////////////////////////////////////////
        
        
        //LRU
        /////////////////////////////////////////////////
        
         Lru=new int[5];
         gecici=new int[5];
          
         indexCanavari=-1;
         index =-1;
         faultCounter=0;
         hitCounter=0;
         coutNumber=0;
          
         
          for(int i=0;i<Lru.length;i++){
              Lru[i]=-1;
              gecici[i]=-1;
          }
          
          for(int i=0;i<sayilar.length;i++){
             
              if(isEmpty5(Lru)){
                  
                  for(int k=0;k<Lru.length;k++){
                          if(Lru[k]==sayilar[i]){
                             isDurum=false;
                              break;
                          } 
                          else{
                             isDurum=true;
                          }
                      }
                          
                  if(isDurum){
                     
                       index=indexBul5(indexCanavari);
                       Lru[index]=sayilar[i];
                       faultCounter++;
                       isDurum=false;
                  }else{
                      index=indexBul5(indexCanavari);
                      hitCounter++;
                  }
                
              }else{
                     
                      for(int k=0;k<Lru.length;k++){
                          
                                if(Lru[k]==sayilar[i]){
                                    isDurum=false;
                                    break;
                                } else{
                                    isDurum=true;
                                }                                            
                      }
                      
                      if(isDurum){
                          Lru[coutNumber]=sayilar[i];
                          //gecici[i]=sayilar[i];
                          coutNumber++;
                          faultCounter++;
                          isDurum=false;
                      }
                  
        
              }
          } 
          
          faultCounter++;
          hitCounter--;
        System.out.println(" LRU 5 Fault Sayisi :"+faultCounter);
        System.out.println(" LRU 5 Hit SAyisi :"+hitCounter);
        
        
        /////////////////////////////////////////////////
        
        //OPTIMAL
        /////////////////////////////////////////////////
        
        
         optimal=new int[5];
         gecici=new int[5];
          
          indexCanavari=-1;
          index=-1;
          faultCounter=0;
          hitCounter=0;
          coutNumber=0;
          
          for(int i=0;i<optimal.length;i++){
              optimal[i]=-1;
              gecici[i]=-1;
          }
          
          for(int i=0;i<sayilar.length;i++){
              if(isEmpty5(optimal)){
                  
                  for(int k=0;k<optimal.length;k++){
                          if(optimal[k]==sayilar[i]){
                             isDurum=false;
                              break;
                          } 
                          else{
                             isDurum=true;
                          }
                      }
                          
                  if(isDurum){
                      gonderilenI=i;
                       index=getIndexOptimal5(optimal,gonderilenI);
                       optimal[index]=sayilar[i];
                       faultCounter++;
                       isDurum=false;
                  }else{
                      
                       //index=getIndexOptimal(optimal,i);
                       hitCounter++;
                       
                  }
                
              }else{
                     
                      for(int k=0;k<optimal.length;k++){
                          
                                if(optimal[k]==sayilar[i]){
                                    isDurum=false;
                                    break;
                                } else{
                                    isDurum=true;
                                }                                            
                      }
                      
                      if(isDurum){
                          optimal[coutNumber]=sayilar[i];
                          gecici[coutNumber]=sayilar[i];
                          coutNumber++;
                          faultCounter++;
                          isDurum=false;
                      }
                  
        
              }
          } 
          
        System.out.println(" OPTIMAL 5 Fault Sayisi :"+faultCounter);
        System.out.println(" OPTIMAL 5 Hit SAyisi :"+hitCounter);
        
        
       
        /////////////////////////////////////////////////
        
         System.out.println("----------------------------------------------------");
        
        
    }//GEN-LAST:event_btnTumSayfalamaActionPerformed

    private void btnEnBuyukSayiAramayiBaslatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnBuyukSayiAramayiBaslatActionPerformed
           
            int bas=0,bit=0;
            int aralik;
            long start=System.nanoTime();
            
            aralik=gelenSayiAdet/gelenThreadAdet;
            
            multiThreads.clear();
            bit=aralik;
            for(int i=0;i<gelenThreadAdet;i++){
                
                System.out.println("Bas :"+bas+" Bit :"+bit);
                multiThreads.add(new Thread(new MultiThread(girilenSayilar,bas,bit)));
                bas+=aralik;
                bit+=aralik;
               
            }
            
           
            for(int i=0;i<multiThreads.size();i++){
              multiThreads.get(i).start();
            }
             
            boolean finish = false;
            
            do{
                finish = false;
                for (int i = 0; i <multiThreads.size(); i++) {
                    if(multiThreads.get(i).isAlive()){
                          finish=true;
                          break;
                    }
                }
            }while(finish);
            
            
            for(int i=0;i<multiThreads.size();i++){
              multiThreads.get(i).stop();
            }
          
          
        long end=System.nanoTime();
            
        System.out.printf("\n"+multiThreads.size()+" adet thread'de en büyük  sayi bulma süresi %.2g saniyedir\n--------------------------\n", (double)((end-start)/1e9)/multiThreads.size());
      
           
            
          
        
    }//GEN-LAST:event_btnEnBuyukSayiAramayiBaslatActionPerformed

    private void btnEnBuyukAsalSayiBaslatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnBuyukAsalSayiBaslatActionPerformed
              
        
            int bas=0,bit=0;
            int aralik;
            aralik=gelenSayiAdet/gelenThreadAdet;
            
            multiThreads.clear(); 
            
            long start=System.nanoTime();  
            bit=aralik;
            for(int i=0;i<gelenThreadAdet;i++){
                
                multiThreads.add(new Thread(new EnBuyukAsalSayi(girilenSayilar,bas,bit)));
                bas+=aralik;
                bit+=aralik;
            }
           
            
            for(int i=0;i<multiThreads.size();i++){
                  multiThreads.get(i).start();
            }
            
            
             boolean finish = false;
            do{
                finish = false;
                for (int i = 0; i <multiThreads.size(); i++) {
                    if(multiThreads.get(i).isAlive()){
                          finish=true;
                          break;
                    }
                }
            }while(finish);
           
          
            for(int i=0;i<multiThreads.size();i++){
              multiThreads.get(i).stop();
            }
            
            long end=System.nanoTime();
            
            System.out.printf("\n"+multiThreads.size()+" adet thread'de en büyük asal sayi bulma süresi %.2g saniyedir\n--------------------------\n", (double)((end-start)/1e9)/multiThreads.size());
            
            System.out.println("MAx :"+EnBuyukAsalSayi.max);
        
    }//GEN-LAST:event_btnEnBuyukAsalSayiBaslatActionPerformed

    
    private boolean isEmpty(int[] gelenSayilar){
        int count=0;
        for(int i=0;i<gelenSayilar.length;i++){
            if(gelenSayilar[i]>=0){
                count++;
            }
        }
        if(count==3)
            return true;
        
        return false;
    }
    
     private boolean isEmpty4(int[] gelenSayilar){
        int count=0;
        for(int i=0;i<gelenSayilar.length;i++){
            if(gelenSayilar[i]>=0){
                count++;
            }
        }
        if(count==4)
            return true;
        
        return false;
    }
     
       private boolean isEmpty5(int[] gelenSayilar){
        int count=0;
        for(int i=0;i<gelenSayilar.length;i++){
            if(gelenSayilar[i]>=0){
                count++;
            }
        }
        if(count==5)
            return true;
        
        return false;
    }
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnBuyukAsalSayiBaslat;
    private javax.swing.JButton btnEnBuyukSayiAramayiBaslat;
    private javax.swing.JButton btnFifoIslemi;
    private javax.swing.JButton btnGirilenThreadSayisiIkinci;
    private javax.swing.JButton btnKacSayi;
    private javax.swing.JButton btnKacSayiAdetIkinci;
    private javax.swing.JButton btnLruIslemi;
    private javax.swing.JButton btnOptimalIslemi;
    private javax.swing.JButton btnThreadSayisi;
    private javax.swing.JButton btnTumSayfalama;
    private javax.swing.JButton btnUcuncuSoruCozumu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtGirilenKacSayi;
    private javax.swing.JTextField txtGirilenThreadSayisi;
    private javax.swing.JTextField txtGirilenThreadSayisiIkinci;
    private javax.swing.JTextField txtSayiAdetGirinizIkınci;
    // End of variables declaration//GEN-END:variables

}
