package com.TestingAPI.TestingAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TestingAPI.TestingAPI.Dao.DefaultTerminalRepository;
import com.TestingAPI.TestingAPI.Entities.DefaultTerminal;

@RestController
@RequestMapping("/default-terminal/")
public class DefaultTerminalController {

    @Autowired
    private DefaultTerminalRepository defaultTerminalRepository;
    @PostMapping
    public String postTerminal(@RequestBody DefaultTerminal defaultTerminal){
        try {
            DefaultTerminal d=new DefaultTerminal();
           d.setCurrency(defaultTerminal.getCurrency());
           d.setCurrent_month_paid_count(defaultTerminal.getCurrent_month_paid_count());
           d.setCurrent_month_turnover(defaultTerminal.getCurrent_month_turnover());
           d.setDescriptor(defaultTerminal.getDescriptor());
           d.setDescriptor_city(defaultTerminal.getDescriptor_city());
           d.setDescriptor_state(defaultTerminal.getDescriptor_state());
           d.setIs_oct(defaultTerminal.isIs_oct());
           d.setMax_per_month(defaultTerminal.getMax_per_month());
           d.setMax_single_transaction(defaultTerminal.getMax_single_transaction());
           d.setMcc(defaultTerminal.getMcc());
           d.setPayment_methods(defaultTerminal.getPayment_methods());
           d.setProcessing_c_ref_b2p(defaultTerminal.getProcessing_c_ref_b2p());
           d.setProcessing_c_ref_p2p(defaultTerminal.getProcessing_c_ref_p2p());
           d.setProcessing_id(defaultTerminal.getProcessing_id());
           d.setProduct_permissions(defaultTerminal.getProduct_permissions());
           d.setStatus(defaultTerminal.getStatus());
           d.setStatus_3d_secure(defaultTerminal.getStatus_3d_secure());
           d.setTransaction_count_limit(defaultTerminal.getTransaction_count_limit());
           d.setType(defaultTerminal.getType());
           defaultTerminalRepository.save(d);
           return "Success";            
            
        } catch (Exception e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }

return "";
    }

@GetMapping
public List<DefaultTerminal>getAllTerminal(){
    return defaultTerminalRepository.findAll();
}




    
}
