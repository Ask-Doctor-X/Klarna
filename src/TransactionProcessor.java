/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionProcessor {

    public static List<String> findRejectedTransactions(List<String> transactions, int creditLimit) {
        List<String> rejectedTransactions = new ArrayList<>();
        Map<String, Integer> consumerCreditLimits = new HashMap<>();

        for(String transaction : transactions){
            String[] transactionDetails = transaction.split(",");
            String firstName = transactionDetails[0];
            String lastName = transactionDetails[1];
            String email = transactionDetails[2];
            int amount = Integer.parseInt(transactionDetails[3]);
            String transactionId = transactionDetails[4];

            String consumerKey = email + firstName + lastName ;
            if (consumerCreditLimits.containsKey(consumerKey)) {
                int totalAmount = consumerCreditLimits.get(consumerKey) + amount;
                if (totalAmount > creditLimit) {
                    rejectedTransactions.add(transactionId);
                } else {
                    consumerCreditLimits.put(consumerKey, totalAmount);
                }
            }else if(amount > creditLimit){
                    rejectedTransactions.add(transactionId);
            }else {
                    consumerCreditLimits.put(consumerKey, amount);
            }
        }

        return rejectedTransactions;
    }

    public static void main(String[] args) {
        //System.out.println(findRejectedTransactions(new ArrayList<>(), 0)); // returns empty list []
        //System.out.println(findRejectedTransactions(List.of("John, Doe,john@doe.com,200,TR0001"), 200)); // returns empty list []
        System.out.println(findRejectedTransactions(List.of(
                "Jane,Doe,jane@doe.com,0,TR0001",
                "Jane,Doe,jane@doe.com,1,TR0002",
                "Jane,Doe,jane@doe.com,1,TR0003"
                ), 0)); // returns [TR0001]
        //System.out.println(findRejectedTransactions(List.of("Jane,Doe,jane@doe.com,199,TR0001","Jane,Doe,jane@doe.com,2,TR0002"), 200)); // returns [TR0002]
    }
}

 */