// package th.mfu.Controller;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;
// import th.mfu.Repository.UserRepository;

// @Controller
// public class RegisterController {

//     @Autowired
//     private UserRepository userRepository;

//     @GetMapping("/register")
//     public String showRegisterForm() {
//         return "register";
//     }

//     @PostMapping("/register")
//     public String register(@RequestParam String username, @RequestParam String password, RedirectAttributes attributes) {
//         // Check if the username is already taken
//         if (userRepository.findByUsername(username) != null) {
//             attributes.addFlashAttribute("error", "Username is already taken");
//             return "redirect:/register";
//         }

//         // Create a new user and save to the database
//         User newUser = new User(username, password);
//         userRepository.save(newUser);

//         return "redirect:/login";
//     }
// }
