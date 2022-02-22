package com.nurulhuda.mqr.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "programs")
public class Program {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 50)
    private String nama;
    
    @NotBlank
    @Size(max = 50)
    private String tgl_mulai;
    
    @NotBlank
    @Size(max = 50)
    private String tgl_akhir;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<JenisProgram> jenisProgram = new HashSet<>();

    public Program() {
    }

    public Program(String nama, String tgl_mulai, String tgl_akhir) {
        this.nama = nama;
        this.tgl_mulai = tgl_mulai;
        this.tgl_akhir = tgl_akhir;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgl_mulai() {
        return tgl_mulai;
    }

    public void setTgl_mulai(String tgl_mulai) {
        this.tgl_mulai = tgl_mulai;
    }

    public String getTgl_akhir() {
        return tgl_akhir;
    }

    public void setTgl_akhir(String tgl_akhir) {
        this.tgl_akhir = tgl_akhir;
    }

    public Set<JenisProgram> getJenisProgram() {
        return jenisProgram;
    }

    public void setJenisPrograms(Set<JenisProgram> jenisProgram) {
        this.jenisProgram = jenisProgram;
    }
}
