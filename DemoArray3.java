public class DemoArray3{

    public static void main(String [] args) {
       int nilai[] = new int[3];
        nilai[0] = 70;
        nilai[1] = 80;
        nilai[2] = 65;
    
    double ratarata=0.0;
    for(int i=0; i<nilai.length; i++) {    
            ratarata+=nilai[i];             //ratarata = ratarata + nilai[1]
    }
    ratarata/=nilai.length;             //ratarata = ratarata /nilai.length
    System.out.println("nilai ratarata = " + ratarata);
    System.out.println("nilai ratarata = "  + Math.ceil(ratarata));
     }
}