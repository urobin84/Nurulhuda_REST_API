package com.nurulhuda.mqr.models;

import javax.persistence.*;

@Entity
@Table(name = "jenis_program")
public class JenisProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EJenisProgram nama;

    public JenisProgram() {

    }

    public JenisProgram(EJenisProgram nama) {
        this.nama = nama;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EJenisProgram getNama() {
        return nama;
    }

    public void setNama(EJenisProgram nama) {
        this.nama = nama;
    }
}
