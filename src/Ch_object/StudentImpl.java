package Ch_object;

public class StudentImpl {

        public static void main(String[] args)
        {
          Student tom= new Student("Tom","Male",25,"Gray");
          Student rony = new Student("Rony","Male",45,"Black");
            System.out.println(tom.toString());
            System.out.println(rony.toString());
        }

}
