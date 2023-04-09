package CoR;

public class CustomerCare {
    private SupportStaff supportStaff;

    public CustomerCare() {
        // Setting up the chain of responsibility
        supportStaff = new Level1SupportStaff();
        SupportStaff level2SupportStaff = new Level2SupportStaff();
        SupportStaff level3SupportStaff = new Level3SupportStaff();

        supportStaff.setNextSupportStaff(level2SupportStaff).setNextSupportStaff(level3SupportStaff);
    }

    public void handleProblemRequest(ProblemCheck problem) {
        supportStaff.handleProblemRequest(problem);
    }
}