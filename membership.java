public abstract class membership extends BaseFunctionality implements MembershipInterface{

    public void enroll(int months) {
        System.out.println("Enrollment Successful");
        System.out.println("Total fee");
        int store = this.getFee() * months;
        System.out.println(store);
    }

    public void cancelMembership() {
        System.out.println("Your membership is cancelled");

    }
}