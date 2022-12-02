package com.takisjoe.laundryajabisnis.domain.layanan.repository;

import androidx.annotation.NonNull;

import com.takisjoe.laundryajabisnis.domain.layanan.entity.Layanan;


public class LayananRepositoryImpl implements LayananRepository {
    private final Layanan layanan;

    public LayananRepositoryImpl() {
        layanan = new Layanan();
    }

    @Override
    public Layanan getAll() {
        return layanan;
    }

    @Override
    public void setALl(@NonNull Layanan layanan) {
        setIdLayanan(layanan.getIdLayanan());
        setNameLayanan(layanan.getNameLayanan());
        setAliasLayanan(layanan.getAliasLayanan());
        setDurasiLayanan(layanan.getDurasiLayanan());
        setSeenUpdateLayanan(layanan.getSeenUpdateLayanan());
        setHargaLayanan(layanan.getHargaLayanan());
        setStatusLayanan(layanan.getStatusLayanan());

    }

    @Override
    public void setIdLayanan(String idLayanan) {
        String result = idLayanan;
        layanan.setIdLayanan(result);
    }

    @Override
    public void setNameLayanan(String nameLayanan) {
        String result = nameLayanan;
        layanan.setNameLayanan(result);
    }

    @Override
    public void setAliasLayanan(String aliasLayanan) {
        String result = aliasLayanan;
        layanan.setAliasLayanan(result);
    }

    @Override
    public void setDurasiLayanan(Long durasiLayanan) {
        Long result = durasiLayanan;
        layanan.setDurasiLayanan(result);
    }

    @Override
    public void setSeenUpdateLayanan(Long seenUpdateLayanan) {
        Long result = seenUpdateLayanan;
        layanan.setSeenUpdateLayanan(result);
    }

    @Override
    public void setHargaLayanan(int hargaLayanan) {
        int result = hargaLayanan;
        layanan.setHargaLayanan(result);
    }

    @Override
    public void setStatusLayanan(Boolean statusLayanan) {
        Boolean result = statusLayanan;
        layanan.setStatusLayanan(result);
    }
}
