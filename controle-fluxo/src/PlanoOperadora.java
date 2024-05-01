public class PlanoOperadora {
   
        public static void main (String [] args) {
            String planos = "BASIC";
    
           switch (planos) {
             case "BASIC":
                System.out.println("100 minutos de ligação");
                break;
            case "MIDIA": 
                System.out.println("100 minutos de ligação + whats e instagram grátis");
                break;
            case "TURBO":
               System.out.println("100 minutos de ligação + whats e instagram grátis + 5GB Youtube");
               break;
            default:
               System.out.println("INDEFINIDO");
           }
    }
    
  
    
}
