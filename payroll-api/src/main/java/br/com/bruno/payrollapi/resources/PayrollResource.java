package br.com.bruno.payrollapi.resources;


import br.com.bruno.payrollapi.domain.Payroll;
import br.com.bruno.payrollapi.domain.User;
import br.com.bruno.payrollapi.feignClients.UserFeign;
import br.com.bruno.payrollapi.services.PayrollServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

  private final PayrollServices services;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(services.getPayment(workerId, payment));

    }
}
