// package th.mfu.Controller;


// import org.springframework.http.MediaType;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;
// import th.mfu.Model.RegisModel;
// import th.mfu.Service.RegisterService;

// import javax.validation.Valid;

// @RestController
// public class RegisterController {
//     @Autowired
//     RegisterService registerService;
//     @PostMapping(value = "/regis", produces = MediaType.APPLICATION_JSON_VALUE)
//     public RegisModel regis(@Valid @RequestBody RegisModel regisModel) {
//          return registerService.register(regisModel.getUsername(),regisModel.getPassword(),regisModel.getName());
//     }
// }
