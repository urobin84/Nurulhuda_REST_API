package com.nurulhuda.mqr.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "keuangan")
public class Keuangan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer program_id;

    @NotBlank
    private Integer debit;

    @NotBlank
    private Integer kredit;

    @NotBlank
    private Integer saldo;

    @NotBlank
    @Column(length = 50)
    private String tanggal;

    @NotBlank
    @Column(length = 255)
    private String keterangan;

    public Keuangan() {
    }

    public Keuangan(Integer debit, Integer kredit, Integer saldo, String tanggal, String keterangan) {
        this.debit = debit;
        this.kredit = kredit;
        this.saldo = saldo;
        this.tanggal = tanggal;
        this.keterangan = keterangan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProgram_id() {
        return program_id;
    }

    public void setProgram_id(Integer program_id) {
        this.program_id = program_id;
    }

    public Integer getDebit() {
        return debit;
    }

    public void setDebit(Integer debit) {
        this.debit = debit;
    }

    public Integer getKredit() {
        return kredit;
    }

    public void setKredit(Integer kredit) {
        this.kredit = kredit;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
