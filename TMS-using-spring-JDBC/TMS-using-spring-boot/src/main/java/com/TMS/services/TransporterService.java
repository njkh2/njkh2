package com.TMS.services;

import com.TMS.entity.Transporter;

import java.util.List;

public interface TransporterService {
    public Transporter saveTransporter(Transporter transporter);

    public List<Transporter> fetchTransporterList();

    public Transporter fetchTransporterById(int id);

    public void deleteTransporter(int id);

    public Transporter updateTransporter(Transporter transporter, int id);
}
