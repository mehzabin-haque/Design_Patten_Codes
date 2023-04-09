package CoR;

public class Level2SupportStaff extends SupportStaff {
    @Override
    protected boolean canHandleProblem(ProblemCheck problem) {
        
        String problemDescription = problem.getProblemDescription().toLowerCase();
        return problemDescription.contains("bug");
    }

    @Override
    protected void handle(ProblemCheck problem) {
        System.out.println("Level 2 support staff is handling the problem: " + problem.getProblemDescription());
    }
}
