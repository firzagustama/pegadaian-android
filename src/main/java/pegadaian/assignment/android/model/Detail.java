package pegadaian.assignment.android.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "detail")
public class Detail {
    @EmbeddedId
    DetailId id;

    @ManyToOne
    @MapsId("product_id")
    @JoinColumn(name = "product_id")
    @JsonIgnoreProperties("detail")
    Product product;

    @ManyToOne
    @MapsId("transaction_id")
    @JoinColumn(name = "transaction_id")
    @JsonIgnoreProperties("detail")
    Transaction transaction;

    Integer qty;

    public Detail() {
        this.id = new DetailId();
    }

    @JsonSetter("productId")
    public void setProductId(Integer id) {
        this.id.productId = id;
    }

    @JsonSetter("transactionId")
    public void setTransactionId(Integer id) {
        this.id.transactionId = id;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public Integer getQty() {
        return qty;
    }
}
