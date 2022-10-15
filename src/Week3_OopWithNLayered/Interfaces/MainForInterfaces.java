package Week3_OopWithNLayered.Interfaces;

public class MainForInterfaces {
    public static void main(String[] args){
      //  ICustomerDaI customerDaI=new ICustomerDaI(); interfacelerde new ile obje olusturamazlar,içlerinde objeye dair bir sey
                                                    //ve içi dolu bir method bulunmamakta.
// inteface kendisini implemente eden class ile kullanılır.Katmanlar arası geçişlerde interface bağımlılkları azaltmak için kullanılır.
        CustomerManager customerManager= new CustomerManager(new OracleCustomerDal());
        //customer manager içindeki constructor parametreli olduğunda parametre olarak ne gönderirisek o sınıf içindek method calısacak.
        customerManager.add();
        //bu method OracleCustomerDal içindeki add methodundan yazılanları döndürür
    }
}
