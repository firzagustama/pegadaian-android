package pegadaian.assignment.android.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "image_url")
    private String imageUrl;
    private String name;
    private Integer price;
    @Column(name = "chart_qty")
    private Integer chartQty;
    @Column(name = "in_chart")
    private Integer inChart;

    @OneToMany(mappedBy = "product")
    @JsonIgnoreProperties("product")
    private List<Detail> detail;

    public Product() {
    }

    public Product(Integer id, String imageUrl, String name, Integer price, Integer chartQty, Integer inChart) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.price = price;
        this.chartQty = chartQty;
        this.inChart = inChart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getChartQty() {
        return chartQty;
    }

    public void setChartQty(Integer chartQty) {
        this.chartQty = chartQty;
    }

    public Integer getInChart() {
        return inChart;
    }

    public void setInChart(Integer inChart) {
        this.inChart = inChart;
    }

    public List<Detail> getDetail() {
        return detail;
    }

    public void setDetail(List<Detail> detail) {
        this.detail = detail;
    }
}
