package CoR;

public abstract class SupportStaff {
    private SupportStaff nextSupportStaff;

    public SupportStaff setNextSupportStaff(SupportStaff nextSupportStaff) {
        this.nextSupportStaff = nextSupportStaff;
        return nextSupportStaff;
    }

    public void handleProblemRequest(ProblemCheck problem) {
        if (canHandleProblem(problem)) {
            handle(problem);
        } else if (nextSupportStaff != null) {
            nextSupportStaff.handleProblemRequest(problem);
        } else {
            System.out.println("No support staff available to handle the request.");
        }
    }

    protected abstract boolean canHandleProblem(ProblemCheck problem);
    protected abstract void handle(ProblemCheck problem);
}