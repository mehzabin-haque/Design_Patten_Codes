package CoR;

public class Level3SupportStaff extends SupportStaff {
    @Override
    protected boolean canHandleProblem(ProblemCheck problem) {
        // Check if the problem can be handled by Level 3 support staff
        // Here, you can define your own logic to determine if a problem is Level 3
        // For example, checking keywords in the problem description
        String problemDescription = problem.getProblemDescription().toLowerCase();
        return problemDescription.contains("database");
    }

    @Override
    protected void handle(ProblemCheck problem) {
        System.out.println("Level 3 support staff is handling the problem: " + problem.getProblemDescription());
    }
}
