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
                             Double d = Double.parseDouble(a);
                           // x=Integer.parseInt(a);
                            if(d > 2147483647  || d < -2147483648)
                            {
                                return 0;
                            }

                            else
                            {   
                                x=Integer.parseInt(a);
                                 return x;
                            }

                        }


                        else
                        {
                            Double d = Double.parseDouble(a);
                           // x=Integer.parseInt(a);
                            if(d > 2147483647  || d < -2147483648)
                            {
                                return 0;
                            }

                            else
                            {   
                                x=Integer.parseInt(a);
                                 return x;
                            }

                        }


                    }
    
     public static void main(String []args){
        
        System.out.println(reverse(1211));
     }
}
