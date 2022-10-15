package Week3_OopWithNLayered.staticDemo;

public class ProductValidator {//ürünü güncellerken ürünün kurallara uyup uymadığını kontrol eder.
// ana class static olamaz javada
    public boolean isValid(Product product){
    if(product.price>0&& !product.name.isEmpty()){
       return true;
    }
    else return false;
}
    public static class AnotherClass{// inner class,gruplandırma amaçlı kullanılır
    public static void Ekle(){// bu methodu kullanmak için
                            //Another classını static yaparız
    }
    }
}

