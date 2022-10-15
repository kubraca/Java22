package Week3_OopWithNLayered.staticDemo;

public class ProductManager {// bu tip nesneleri static tanımlamayız,uygulama sıfırlanana kadar
    // bellekte kalır bu yüzden.Static olursa ilk çağıran kullanıcı olusturuyor diğerleri çağırıyor
    //bir methodu static yaparsak class ismi ile onu çağırabiliriz
    public void add(Product product) {
        ProductValidator validator = new ProductValidator();
        if (validator.isValid(product)) {
            System.out.println("Ürün eklendi");
        } else {
            System.out.println("Ürün bilgilieri geçersiz");
        }
    }
    public void nothing(){
        //static tanımlanmazsa bu methodu kullanabilmek için ProductManagerı kullanacağımız yerde new ile olusturmamız gerekir
        //örn:Constructorlarda new ile o classı başlattığımız yerde çalısırlar.
    }
}