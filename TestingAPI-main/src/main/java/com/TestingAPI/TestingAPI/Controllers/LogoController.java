package com.TestingAPI.TestingAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TestingAPI.TestingAPI.Dao.LogoRepository;
import com.TestingAPI.TestingAPI.Entities.Logo;

@RestController
@RequestMapping("/logo/")
public class LogoController {

    @Autowired
    private LogoRepository logoRepository;

    @PostMapping
    public String postLogo(@RequestBody Logo logo){
     
     try{
        Logo log1=new Logo();
        log1.setHeight(logo.getHeight());
        log1.setImage(logo.getImage());
        log1.setImage_type(logo.getImage_type());
        log1.setOriginal_filename(logo.getOriginal_filename());
        log1.setType(logo.getType());
        log1.setWidth(logo.getWidth());
        logoRepository.save(log1);
        return "Success";

     }  
     catch(Exception e){
        e.printStackTrace();
     }
     return "Something went wrong";

     


    }

@GetMapping
public List<Logo>getAllLogo(){
    return logoRepository.findAll();
}



    
}
