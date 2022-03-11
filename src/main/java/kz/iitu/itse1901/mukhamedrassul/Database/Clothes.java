package kz.iitu.itse1901.mukhamedrassul.Database;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;


//@NamedQueries({
////        @NamedQuery(name = "Clothes.count",
////                query = "select distinct s from Users u " +
////                        "left join fetch s.albums a " +
////                        "left join fetch s.instruments i " +
////                        "where s.id = :id"),
////        @NamedQuery(name = "Singer.findAllWithAlbum",
////                query = "select distinct s from Singer s " +
////                        "left join fetch s.albums a " +
////                        "left join fetch s.instruments i")
//})
@Entity(name = "Clothes")
@Table(name = "Clothes")
public class Clothes implements Serializable {
    private Long clothes_id;
    private String name;
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

    @Override
    public String toString() {
        return "Clothes id: " + clothes_id  + " Name: " + name + " material_type: " + material_type + " size: " + size;
    }
}
