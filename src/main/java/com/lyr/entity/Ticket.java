package com.lyr.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zdl on 2017/1/4.
 */
@Entity
@Table(name = "ticket")
public class Ticket implements Serializable {
    private String id;
    private String name;
    private long count;

    public void setId(String id) {
        this.id = id;
    }
    @Id
    @Column(name = "id", nullable = false, length = 32, unique = true)
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
    @GeneratedValue(generator = "generator")
    public String getId() {
        return id;
    }
    @Column(name = "name", nullable = false, length = 32, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }
    @Column(name = "count", nullable = false, length = 32, unique = true)
    public long getCount() {
        return count;
    }
}
