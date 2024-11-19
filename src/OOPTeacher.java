public class OOPTeacher {
    public static void main(String[] args) { 

        Teacher teacher1 = new Teacher("Ahtasham", "Male", "01795230354");
        teacher1.displayInformation();

        Teacher teacher4 = new Teacher("Rifat", "Male", "01795230354");
        teacher4.displayInformation();

        Teacher teacher2 = new Teacher();
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("Halim", "Female");
        teacher3.displayInformation();

        Teacher teacher5 = new Teacher("Ahtasham", "Male", "017954202867");
        teacher5.displayInformation();

        Teacher teacher6 = new Teacher("Ahtasham", "Male", "017954202867");
        teacher6.displayInformation();
    }
}