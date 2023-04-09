package CoR;

public class Level3SupportStaff extends SupportStaff {
    @Override
    protected boolean canHandleProblem(ProblemCheck problem) {
        
        String problemDescription = problem.getProblemDescription().toLowerCase();
        return problemDescription.contains("database");
    }

    @Override
    protected void handle(ProblemCheck problem) {
        System.out.println("Level 3 support staff is handling the problem: " + problem.getProblemDescription());
    }
}
