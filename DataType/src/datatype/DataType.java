
package datatype;


public class DataType {

    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        float b = 2.4f;
        char c = 'x';
        boolean d = true;
        short e = 4453;
        double f = 34.5;
        
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);
        System.out.println("f = "+f);
        
        //Format specifier Example
        System.out.printf("\na = %d\n",a);
        System.out.printf("b = %.2f\n",b);
        System.out.printf("c = %c\n",c);
        System.out.printf("d = %b\n",d);
        System.out.printf("e = %d\n",e);
        System.out.printf("f = %f\n",f);
    }
    
}
