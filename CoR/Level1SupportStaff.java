package CoR;

public class Level1SupportStaff extends SupportStaff {
    @Override
    protected boolean canHandleProblem(ProblemCheck problem) {
       
        String problemDescription = problem.getProblemDescription().toLowerCase();
        return problemDescription.contains("login");
    }

    @Override
    protected void handle(ProblemCheck problem) {
        System.out.println("Level 1 support staff is handling the problem: " + problem.getProblemDescription());
    }
}