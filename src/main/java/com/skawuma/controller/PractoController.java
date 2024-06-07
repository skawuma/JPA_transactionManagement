package com.skawuma.controller;

import com.skawuma.dto.PatientAppointmentRequest;
import com.skawuma.service.PractoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author samuelkawuma
 * @package com.skawuma.controller
 * @project practoapp
 * @date 6/6/24
 */
@RestController
@RequestMapping("/practo")
public class PractoController {
    @Autowired
    private PractoService service;

    @PostMapping("/bookAppointment")
    public String bookDoctorsAppointment(@RequestBody PatientAppointmentRequest request){
        return service.bookAppointment(request);
    }
}
