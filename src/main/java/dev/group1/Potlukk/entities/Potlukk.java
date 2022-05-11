package dev.group1.Potlukk.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "potluck")
public class Potlukk {
    @Id
    @Column(name = "p_id")
    private int id;
    @Column(name = "event_name")
    private String name;
    @Column(name = "date_time")
    private int epochTime;
    @Column(name = "host_id")
    private int hostID;
    @Column(name = "event_loc")
    private String location;
}
