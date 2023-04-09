package CoR;

public class Main {
    public static void main(String[] args) {
        CustomerCare customerCare = new CustomerCare();

        ProblemCheck problem1 = new ProblemCheck("Issue with login");
        ProblemCheck problem2 = new ProblemCheck("Bug in software");
        ProblemCheck problem3 = new ProblemCheck("Database connection error");

        customerCare.handleProblemRequest(problem1);
        customerCare.handleProblemRequest(problem2);
        customerCare.handleProblemRequest(problem3);
       
    }
}
