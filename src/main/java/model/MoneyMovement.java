package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "financial_logs")
public class MoneyMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 300, nullable = false, unique = true, name = "description")
    private String description;
    private Double value;
    private String type;
    @Temporal(TemporalType.TIMESTAMP)
    private Date movementDate;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Double getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public Date getMovementDate() {
        return movementDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMovementDate(Date movementDate) {
        this.movementDate = movementDate;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
