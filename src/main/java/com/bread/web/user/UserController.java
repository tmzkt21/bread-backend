package com.bread.web.user;

import com.amazonaws.services.apigateway.model.Op;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }
    @PostMapping("/signIn")
    public String signIn(String userId, String password) {
        System.out.println("id : {} , pw : {}"+ userId + password);
        User user = userRepository.findUser(userId, password);
        if(user != null) {
            return "loginOK";
        }
        return "loginFail";
    }

    // 회원가입
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        User newUser = userRepository.save(user);
        return user.getName() + "님의 회원가입을 축하합니다";
    }
    // read 회원검색
    @GetMapping("/finduser")
    public User findUser(@RequestBody Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
    // 회원 정보변경
    @PutMapping("/changeinfo")
    public Optional<User> changeInfo(@RequestBody Long userNo , @RequestBody User user){
        Optional<User> updateUser = userRepository.findById(userNo);

        updateUser.ifPresent(selectUser->{
            selectUser.setName(user.getName());
            selectUser.setUserId(user.getUserId());
            selectUser.setPassword(user.getPassword());
            selectUser.setEmail(user.getEmail());
            selectUser.setPhone(user.getPhone());

            userRepository.save(selectUser);
        });
        return updateUser;
    }
    // 회원삭제
    @PostMapping("/delete")
    public Optional<User> userDelete(@RequestBody User user){
        Optional<User> usercancle = userRepository.findById(4L);
        usercancle.ifPresent(selectUser ->{
            userRepository.delete(selectUser);
        });
        return usercancle;
    }






}