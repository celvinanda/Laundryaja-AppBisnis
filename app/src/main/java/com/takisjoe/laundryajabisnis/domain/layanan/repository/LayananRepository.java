package com.takisjoe.laundryajabisnis.domain.layanan.repository;

import com.takisjoe.laundryajabisnis.domain.layanan.entity.Layanan;

public interface LayananRepository {

    Layanan getAll();

    void setALl(Layanan layanan);

    void setIdLayanan(String idLayanan);

    void setNameLayanan(String nameLayanan);

    void setAliasLayanan(String aliasLayanan);

    void setDurasiLayanan(Long durasiLayanan);

    void setSeenUpdateLayanan(Long seenUpdateLayanan);

    void setHargaLayanan(int hargaLayanan);

    void setStatusLayanan(Boolean statusLayanan);
}
