public abstract class BaseFunctionality implements BaseFunctionalityInterface{
    private int memberId;
    private int fee;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;

    }
}