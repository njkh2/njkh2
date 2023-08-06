package com.TMS.services;

import com.TMS.entity.Transporter;
import com.TMS.repository.TransporterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TransporterServiceImpl implements TransporterService{
    @Autowired
    private TransporterRepository transporterRepository;
    @Override
    public Transporter saveTransporter(Transporter transporter) {
        return transporterRepository.save(transporter);
    }

    @Override
    public List<Transporter> fetchTransporterList() {
        return transporterRepository.findAll();
    }

    @Override
    public Transporter fetchTransporterById(int id) {
        return transporterRepository.findById(id).get();
    }

    @Override
    public void deleteTransporter(int id) {
        transporterRepository.deleteById(id);
    }

    @Override
    public Transporter updateTransporter(Transporter transporter, int id) {
        Transporter transporterdb = transporterRepository.findById(id).get();
        if(Objects.nonNull(transporter.getTransporterName()) &&
        !"".equalsIgnoreCase(transporter.getTransporterName())) {
            transporterdb.setTransporterName(transporter.getTransporterName());
        }
        if(Objects.nonNull(transporter.getAddress()) &&
                !"".equalsIgnoreCase(transporter.getAddress())) {
            transporterdb.setAddress(transporter.getAddress());
        }
        if(Objects.nonNull(transporter.getMobile()) &&
                !"".equalsIgnoreCase(transporter.getMobile())) {
            transporterdb.setMobile(transporter.getMobile());
        }
        return transporterRepository.save(transporterdb);
    }
}
