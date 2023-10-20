package br.com.domingos.collector.controller;

import br.com.domingos.collector.entity.Accessed;
import br.com.domingos.collector.entity.User;
import br.com.domingos.collector.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    ResponseEntity<List<User>>getAll( User user){
        List<User>data = this.userService.findAll(user);

        return ResponseEntity.ok(data);
    }

    @GetMapping(params = "cnpj")
    public ResponseEntity<User> getByCnpj(@RequestParam("cnpj") String cnpj) {
        return this.userService.findByCnpj(cnpj)
                .map(user -> ResponseEntity.ok(user)).orElse(ResponseEntity.notFound().build());
    }

}
