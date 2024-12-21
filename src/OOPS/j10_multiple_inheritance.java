package OOPS;

interface College {
    String getCollegeName();
}

interface Branch {
    String getBranchName();
}

class Student implements College, Branch {
    private String collegeName;
    private String branchName;

    public Student(String collegeName, String branchName) {
        this.collegeName = collegeName;
        this.branchName = branchName;
    }
        public String getCollegeName() {
        return collegeName;
    }
    public String getBranchName() {
        return branchName;
    }

    public static void main(String[] args) {
        Student student = new Student("dsce", "Computer Science");
        System.out.println("College: " + student.getCollegeName());
        System.out.println("Branch: " + student.getBranchName());
    }
}
