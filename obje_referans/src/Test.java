
public class Test {
    public static void main(String[] args) {
        
  
    /*
    obje referansları 
    referanslar c ve c++ ta bulunan pointerlar gibi davranıyor...
    */
  /*  Account ac1 = new Account("hllbr","h2lbr@gmail.com","132467519761367");
    Account ac2 = ac1;//2 referansta aynı yeri gösteriyor...
    Account ac3 = new Account();
    
    if(ac1 == ac2){
    //ac1 ve ac2 aynı yerimi gösteriyor diye bir sorgulama yaptık 
            System.out.println("Aynı objeyi gösteriyorlar");
}if( ac1 == ac3){
        System.out.println("Aynı objeyi gösteriyorlar");
}else {
        System.out.println("Aynı objeyi göstermiyorlar");
}
    */
      
    new Account("@PRİNCE","HEXDECİMAL@GMAİL.COM","658596471").bilgileri_goster();
    //JAVA  bunu herhangi bir referansa atamadığmızda sıkıntı vermiyor.
    //Çünkü bu işlemin çıktısı bir obje oluşturuyor ve bir referans çıktısı veriyor
    //bunu bir referansa atamadığımız için ilerde kullanamayacağız.Tek satırlık bir işleminiz varsa bir fonksiyona obje gönderiyorsanız bu alternatif bir yöntem.
    
    
    }
}
