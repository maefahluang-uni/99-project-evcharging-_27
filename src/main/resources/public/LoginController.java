import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage(Model model) {
        if (model.containsAttribute("error")) {
            model.addAttribute("error", model.getAttribute("error"));
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {
        // โค้ดที่ใช้สำหรับการล็อกอิน ในที่นี้เราให้เป็นการตรวจสอบพื้นฐาน
        if ("user".equals(username) && "password".equals(password)) {
            return "redirect:/success";
        } else {
            model.addAttribute("error", "ชื่อผู้ใช้หรือรหัสผ่านไม่ถูกต้อง");
            return "redirect:/login";
        }
    }

    @GetMapping("/success")
    public String successPage() {
        return "success";
    }
}
