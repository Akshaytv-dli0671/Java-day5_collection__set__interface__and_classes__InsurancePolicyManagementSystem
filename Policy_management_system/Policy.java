package Policy_management_system;

import java.util.Date;

public class Policy {
    int policy_no;
    String policy_holder;
    Date expiry_date;
    String coverage;
    long amount;

    public Policy(int policy_no, String policy_holder, Date expiry_date, String coverage, long amount) {
        this.policy_no = policy_no;
        this.policy_holder = policy_holder;
        this.expiry_date = expiry_date;
        this.coverage = coverage;
        this.amount = amount;
    }

    public int getPolicy_no() {
        return policy_no;
    }

    public void setPolicy_no(int policy_no) {
        this.policy_no = policy_no;
    }

    public String getPolicy_holder() {
        return policy_holder;
    }

    public void setPolicy_holder(String policy_holder) {
        this.policy_holder = policy_holder;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policy_no=" + policy_no +
                ", policy_holder='" + policy_holder + '\'' +
                ", expiry_date=" + expiry_date +
                ", coverage='" + coverage + '\'' +
                ", amount=" + amount +
                '}';
    }
}
