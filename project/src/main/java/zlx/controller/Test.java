package zlx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zlx.service.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class Test {
    @Autowired
    private UserService us;
    @RequestMapping(value = "/my.action")
    public String my(String username){
        return "index";
    }
    @RequestMapping(value = "/totest.action")
    public String toTest(String username , Model model,Integer count){
        return "test";
    }
    @RequestMapping(value = "/test.action")
    public String test(String username , Model model, HttpSession session){
        System.out.println("nimende");
        Integer coount=null;
        try {
            coount = us.countUserByUserName(username);
        } catch (Exception e) {
            model.addAttribute("error",e.getMessage());
            return "index";
        }
        session.setAttribute("count",coount);
        return "redirect:/totest.action";
    }
}
