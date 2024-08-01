package Policy_management_system;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;
import java.util.TreeSet;

public class Policy_manager {
    Set<Policy> P_hashset=new HashSet<>();
    Set<Policy>P_linkedhashset=new LinkedHashSet<>();
//    Set<Policy>P_treeset=new TreeSet<>();
Set<Policy> P_treeset = new TreeSet<>(new Comparator<Policy>() {
    @Override
    public int compare(Policy p1, Policy p2) {
        return p1.getExpiry_date().compareTo(p2.getExpiry_date());
    }
});
    public void addPolicy(Policy policy) {
        P_hashset.add(policy);
        P_linkedhashset.add(policy);
        P_treeset.add(policy);
    }

    public Set<Policy> getAllUniquePolicies() {
        return P_hashset;
    }
    public Set<Policy> getPoliciesExpiringSoon() {
        Set<Policy> expiringSoon = new TreeSet<>(new Comparator<Policy>() {
            @Override
            public int compare(Policy p1, Policy p2) {
                return p1.getExpiry_date().compareTo(p2.getExpiry_date());
            }
        });
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date soon = cal.getTime();

        for (Policy policy : P_treeset) {
            if (policy.getExpiry_date().before(soon)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }
    public Set<Policy> getPoliciesByCoverage(String coverage) {
        Set<Policy> policiesByCoverage = new HashSet<>();
        for (Policy policy : P_hashset) {
            if (policy.getCoverage().equalsIgnoreCase(coverage)) {
                policiesByCoverage.add(policy);
            }
        }
        return policiesByCoverage;
    }

    public Set<Policy> findDuplicatePolicies() {
        Set<Policy> duplicates = new HashSet<>();
        Set<Integer> policyNumbers = new HashSet<>();
        for (Policy policy : P_hashset) {
            if (!policyNumbers.add(policy.getPolicy_no())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }



}
