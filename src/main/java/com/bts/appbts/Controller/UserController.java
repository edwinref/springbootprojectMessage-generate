package com.bts.appbts.Controller;


import com.bts.appbts.Model.Users;
import com.bts.appbts.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @PostMapping("/getuser")
    public Users getall(@RequestBody Users user){

        Users user1 =userRepository.findUsersByEmailAndAndPassword(user.getEmail(),user.getPassword());
        return user1;
    }

    @GetMapping("/getusers")
    public List<Users> getAllUsers(@RequestParam("id") String id) {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(id));
        Iterable<Integer> iterable = list;
        return userRepository.findAllById(iterable);
    }

    @PostMapping("saveuser")
    public Users getAllusers(@RequestBody Users users){
        return  userRepository.save(users);
    }

}
