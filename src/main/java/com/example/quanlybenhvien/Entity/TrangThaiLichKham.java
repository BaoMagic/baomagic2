package com.example.quanlybenhvien.Entity;

public enum TrangThaiLichKham {
    CHO_XAC_NHAN("Chờ xác nhận"),
    BENH_NHAN_DA_DEN("Bệnh nhân đã đến"),
    BAC_SI_XAC_NHAN("Bác sĩ đã xác nhận");

    private final String label;

    TrangThaiLichKham(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
