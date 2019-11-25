package pegadaian.assignment.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DetailId implements Serializable {
    @Column(name = "product_id")
    Integer productId;
    @Column(name = "transaction_id")
    Integer transactionId;

    public DetailId() {
    }

    public DetailId(Integer productId, Integer transactionId) {
        this.productId = productId;
        this.transactionId = transactionId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }
}
