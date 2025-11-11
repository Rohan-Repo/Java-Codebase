package in.easysystems.pojos;

import java.time.LocalDateTime;
import java.util.UUID;

public record TransactionRecord( UUID transactionId, LocalDateTime transactionDT, String transactionType, double transactionAmt ) {
    public TransactionRecord( LocalDateTime transactionDT, String transactionType, double transactionAmt ) {
        this( UUID.randomUUID(), transactionDT, transactionType, transactionAmt );
    }

}
