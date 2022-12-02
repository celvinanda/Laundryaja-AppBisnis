package com.takisjoe.laundryajabisnis.domain.layanan.entity;

public class Layanan {
    private String idLayanan;
    private String nameLayanan;
    private String aliasLayanan;
    private Long durasiLayanan;
    private Long seenUpdateLayanan;
    private int hargaLayanan;
    private Boolean statusLayanan;

    public Layanan() {
    }

    public Layanan(String idLayanan, String nameLayanan, String aliasLayanan, Long durasiLayanan, Long seenUpdateLayanan, int hargaLayanan, Boolean statusLayanan) {
        this.idLayanan = idLayanan;
        this.nameLayanan = nameLayanan;
        this.aliasLayanan = aliasLayanan;
        this.durasiLayanan = durasiLayanan;
        this.seenUpdateLayanan = seenUpdateLayanan;
        this.hargaLayanan = hargaLayanan;
        this.statusLayanan = statusLayanan;
    }

    public String getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(String idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getNameLayanan() {
        return nameLayanan;
    }

    public void setNameLayanan(String nameLayanan) {
        this.nameLayanan = nameLayanan;
    }

    public String getAliasLayanan() {
        return aliasLayanan;
    }

    public void setAliasLayanan(String aliasLayanan) {
        this.aliasLayanan = aliasLayanan;
    }

    public Long getDurasiLayanan() {
        return durasiLayanan;
    }

    public void setDurasiLayanan(Long durasiLayanan) {
        this.durasiLayanan = durasiLayanan;
    }

    public Long getSeenUpdateLayanan() {
        return seenUpdateLayanan;
    }

    public void setSeenUpdateLayanan(Long seenUpdateLayanan) {
        this.seenUpdateLayanan = seenUpdateLayanan;
    }

    public int getHargaLayanan() {
        return hargaLayanan;
    }

    public void setHargaLayanan(int hargaLayanan) {
        this.hargaLayanan = hargaLayanan;
    }

    public Boolean getStatusLayanan() {
        return statusLayanan;
    }

    public void setStatusLayanan(Boolean statusLayanan) {
        this.statusLayanan = statusLayanan;
    }
}
