package pegadaian.assignment.android.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    }

    public Detail(DetailId id, Product product, Transaction transaction, Integer qty) {
        this.id = id;
        this.product = product;
        this.transaction = transaction;
        this.qty = qty;
    }

    public DetailId getId() {
        return id;
    }

    public void setId(DetailId id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
