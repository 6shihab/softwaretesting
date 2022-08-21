public class problem7 {
    public static void main(String[] args) {
        try{
            Class.forName("problem7$Animalll");
            System.out.println("class found");
        }
        catch (Exception ex){
//            ex.printStackTrace();
            System.out.println(ex);
        }
    }
    public class Animal{
        public String name;
        public String characteristics;
    }
}

