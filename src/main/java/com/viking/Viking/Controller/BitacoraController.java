package com.viking.Viking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viking.Viking.Entity.ApiResponse;
import com.viking.Viking.Entity.Bitacora;
import com.viking.Viking.Entity.ModelGroup;
import com.viking.Viking.Service.BitacoraService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/bitacora")
public class BitacoraController {
    @Autowired
    private BitacoraService itemService;
    
    @PostMapping
    public ApiResponse<Bitacora> saveBitacora(@RequestBody Bitacora item){
        return new ApiResponse<>(HttpStatus.OK.value(), "Bitacora saved successfully.",itemService.save(item));
    }

    @GetMapping
    public ApiResponse<List<Bitacora>> listBitacora(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Bitacora list fetched successfully.",itemService.findAll());
    }
    @GetMapping("/getList")
    public ApiResponse<List<ModelGroup>> listGroup(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Bitacora list fetched successfully.",itemService.groupBy());
    }

}
