package week1;

public class multidimension {
    public static void main(String[]args){
        String [][] sehirler=new String[3][3];
        sehirler[0][0]="Istanbul";
        sehirler[0][1]="Kocaeli";
        sehirler[0][2]="Bursa";
        sehirler[1][0]="Ankara";
        sehirler[1][1]="Konya";
        sehirler[1][2]="Sivas";
        sehirler[2][0]="Samsun";
        sehirler[2][1]="Giresun";
        sehirler[2][2]="Trabzon";
        for(int i=0; i<sehirler.length; i++){
            for(int j=0; j<sehirler.length; j++){
                System.out.println( sehirler[i][j]);
            }
            System.out.println("-----------------");
        }
    }
}
