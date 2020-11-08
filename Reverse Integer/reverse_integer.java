public class HelloWorld{


        static int reverse(int x) {
        String s=Integer.toString(x);
        StringBuilder sb= new StringBuilder();
        sb.append(s);
        sb=sb.reverse();
        String a=sb.toString();
        
        if(a.contains("-"))
        {
            a=a.replace("-","");
            a="-".concat(a);
            return Integer.valueOf(a);
        }
        else
        {
            x=Integer.parseInt(a);
            return x;
        }
        
        
        }
    
     public static void main(String []args){
        
        System.out.println(reverse(1211));
     }
}
