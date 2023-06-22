package Package_Handeling;

import Package_Handeling.StudentDetails;

class StudentDetails {
    public int id;
    public String name;
    public String dept;
    public String versity;
    public int age;

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + dept);
        System.out.println("Versity: " + versity);
        System.out.println("Age: " + age);
    }
}

class Student {
    public static void main(String[] args) {
        StudentDetails st = new StudentDetails();
        st.id = 2102055;
        st.name = "I am Hira";
        st.dept = "CSE";
        st.versity = "NITER(DU)";
        st.age = 23;
        st.display();
    }
}
