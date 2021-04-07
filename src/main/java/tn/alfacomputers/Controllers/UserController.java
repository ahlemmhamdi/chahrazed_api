package tn.alfacomputers.Controllers;

import tn.alfacomputers.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.alfacomputers.repositories.UserRepository;


@Controller
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/adduser") // Map ONLY POST Requests
    public @ResponseBody
    String addNewUser (
              @RequestBody User user) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setUsername(user.getUsername());
        n.setEmail(user.getEmail());
        n.setPassword(user.getPassword());
        userRepository.save(n);
        return "User Successfully added :)";
    }

    @GetMapping(path="/getusers")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users

        return userRepository.findAll();
    }
}
