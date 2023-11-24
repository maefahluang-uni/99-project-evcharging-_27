package th.mfu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

     @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes attributes) {
        if ("Admin".equals(username) && "1234".equals(password)) {
            return "redirect:/station";
        } else if ("Barista".equals(username) && "1234".equals(password)) {
            return "redirect:/station";
        }
        
        attributes.addFlashAttribute("error", "Invalid username or password");
        return "redirect:/login";
    }
    @GetMapping("/station")
    public String showAdminForm(){
        return "station";
    }
    @GetMapping("barista-dashboard")
    public String showBaristaForm(){
        return "barista-dashboard";
    }


    }
