package CoR;

public class Level1SupportStaff extends SupportStaff {
    @Override
    protected boolean canHandleProblem(ProblemCheck problem) {
        // Check if the problem can be handled by Level 1 support staff
        // Here, you can define your own logic to determine if a problem is Level 1
        // For example, checking keywords in the problem description
        String problemDescription = problem.getProblemDescription().toLowerCase();
        return problemDescription.contains("login");
    }

    @Override
    protected void handle(ProblemCheck problem) {
        System.out.println("Level 1 support staff is handling the problem: " + problem.getProblemDescription());
    }
}