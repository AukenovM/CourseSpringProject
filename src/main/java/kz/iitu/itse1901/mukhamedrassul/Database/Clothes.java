package kz.iitu.itse1901.mukhamedrassul.Database;

import com.sun.istack.NotNull;
import kz.iitu.itse1901.mukhamedrassul.Customs.ConstraintAnnotation;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "Clothes")
@Table(name = "Clothes")
@ToString
@Transactional
public class Clothes implements Serializable {
    private Long clothes_id;
    @NotNull
    @Size(min = 5, max = 25)
    private String name;
    @ConstraintAnnotation
    @NotNull
    @Size(min = 5, max = 25)
    private String material_type;
    private String size;


    public Clothes(Long clothes_id, String name, String material_type, String size) {
        this.clothes_id = clothes_id;
        this.name = name;
        this.material_type = material_type;
        this.size = size;
    }

    public Clothes(String name, String material_type, String size) {
        this.name = name;
        this.material_type = material_type;
        this.size = size;
    }

    public Clothes() {}

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    public Long getClothes_id() {
        return clothes_id;
    }

    public void setClothes_id(Long clothes_id) {
        this.clothes_id = clothes_id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "material_type")
    public String getMaterial_type() {
        return material_type;
    }

    public void setMaterial_type(String material_type) {
        this.material_type = material_type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
