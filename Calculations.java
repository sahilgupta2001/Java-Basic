public class Calculations {
    int a;
    int b;
    int c;
        
        public void addtwonumber() {
            a = 10;
            b = 20;
            c = a+b;
            System.out.println(c);
        }
        
        public void subtwonumber() {
            a = 10;
            b = 20;
            c = a-b;
            System.out.println(c);
        }
        
        public void multwonumber() {
            a = 10;
            b = 20;
            c = a*b;
            System.out.println(c);
        }
        
        public void divtwonumber() {
            a = 10;
            b = 20;
            c = a/b;
            System.out.println(c);
        }
        
    
        public static void main(String[] args) {
            Calculations sb = new Calculations();
            sb.addtwonumber();
            sb.subtwonumber();
            sb.multwonumber();
            sb.divtwonumber();
        
    }}
    