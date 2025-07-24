package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "moneymovement")
public class MoneyMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Double value;
    private String type;
    private Date movementDate;

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
}
