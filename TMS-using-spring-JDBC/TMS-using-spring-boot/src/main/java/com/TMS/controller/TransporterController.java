package com.TMS.controller;

import com.TMS.entity.Transporter;
import com.TMS.services.TransporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransporterController {
    @Autowired
    private TransporterService transporterService;
    @PostMapping("/transporter")
    public Transporter saveTransporter(@RequestBody Transporter transporter){
        return transporterService.saveTransporter(transporter);
    }

    @GetMapping("/transporter")
    public List<Transporter> fetchTransporterList(){
        return transporterService.fetchTransporterList();
    }

    @GetMapping("/transporter/{id}")
    public Transporter fetchTransporterById(@PathVariable("id") int id){
        return transporterService.fetchTransporterById(id);
    }

    @DeleteMapping("/transporter/{id}")
    public String deleteTransporter(@PathVariable("id") int id){
        transporterService.deleteTransporter(id);
        return "transporter Deleted Successfully";
    }

    @PutMapping("/transporter/{id}")
    public Transporter updateTransporter(@RequestBody Transporter transporter,
                                         @PathVariable("id") int id){
        return transporterService.updateTransporter(transporter,id);
    }

}
