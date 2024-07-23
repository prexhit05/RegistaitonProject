package com.oaklandsytems.employeeregistration.Controller;

import com.oaklandsytems.employeeregistration.Entities.Employee;
import com.oaklandsytems.employeeregistration.Entities.LoginForm;
import com.oaklandsytems.employeeregistration.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    private String loginId=null;
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("employee",new Employee());
        return "register";
    }

    @PostMapping("/register")
    public String postEmp(@ModelAttribute("Employee") Employee emp, Model model) {
//        System.out.println(emp);
        employeeService.postEmp(emp);
        model.addAttribute("message","Employee Registered");
        return "redirect:/login";
    }


    @GetMapping("/login")
    public String loginget(Model model) {
        model.addAttribute("loginForm",new LoginForm());
        return "login";
    }

    @PostMapping("/login")
    public String loginpost(@ModelAttribute LoginForm loginForm, Model model ){
        String loginId = loginForm.getLoginId();
        this.loginId=loginId;
        String password = loginForm.getPassword();
        System.out.println(loginId+"     " +password);
        if (employeeService.login(loginId,password)) {
            model.addAttribute("massage","Login Successfull");
            return "redirect:/welcome";
        } else {
            model.addAttribute("massage","in valid cridentials");
            return "redirect:/login";
        }
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        if (this.loginId != null) {
            Employee getemp = employeeService.getemp(this.loginId);
            System.out.println(getemp);
            if (getemp != null) {
                model.addAttribute("employee",getemp);
                return "welcome";
            }
        }
            return "error";
    }
    @GetMapping("/employees")
    public String getAllEmp(Model model){
        List<Employee> list=new ArrayList<>();
        list=employeeService.getAllEmp();
        if (list != null) {
            model.addAttribute("EmployeeList",list);
            return "employeeList";
        }
        return "error";
    }
}
