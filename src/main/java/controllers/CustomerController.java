package controllers;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;

import java.util.List;
import java.util.Map;


@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public ModelAndView home() {
        List<Customer> listCustomer = customerService.listAll();
        ModelAndView mav = new ModelAndView("/WEB-INF/index.jsp");
        mav.addObject("listCustomer", listCustomer);
        return mav;
    }

    @RequestMapping("/new")
    public String newCustomerForm(Map<String, Object> model) {
        Customer customer = new Customer();
        model.put("customer", customer);
        return "new_customer";
    }
}
