package com.bread.web.user;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;
    private final  User user;

    public UserController(UserService userService, UserRepository userRepository, User user) {
        this.userService = userService;
        this.userRepository = userRepository;
        this.user = user;
    }

    @PostMapping("/signIn")
    public ResponseEntity<User> signIn(@RequestBody User user) {
        System.out.println(user);
    Optional<User> findByUserId = userService.findByUserId(user.getUserId());
    if (findByUserId.isPresent()) {
        User userLogin = findByUserId.get();
        if (user.getPassword().equals(userLogin.getPassword())) {
            return ResponseEntity.ok(userLogin);
        } else {
            return ResponseEntity.badRequest().build();
        }
    } else {
        return ResponseEntity.notFound().build();
    }

    }
    // 회원가입
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        User newUser = userRepository.save(user);
        return user.getName() + "님의 회원가입을 축하합니다";
    }

    // read 회원검색
    @GetMapping("/findUser")
    public User findUser(@RequestBody Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }


    @PatchMapping("/changeInfo/{userId}")
    public ResponseEntity<User> changeInfo(@PathVariable String userId, @RequestBody User user){
        Optional<User> updateUser = userService.findByUserId(user.getUserId());
        if (updateUser.isPresent()){
            updateUser.ifPresent(selectUser ->{
            selectUser.setName(user.getName());
            selectUser.setUserId(user.getUserId());
            selectUser.setPassword(user.getPassword());
            selectUser.setEmail(user.getEmail());
            selectUser.setPhone(user.getPhone());
            userRepository.save(selectUser);
            });
            return ResponseEntity.ok(updateUser.get());
        } else {
            System.out.println("정보수정 실패 재시도 바랍니다");

            return ResponseEntity.notFound().build();
        }
    }
    // 회원 정보변경
//    @PutMapping("/changeInfo")
//    public Optional<User> changeInfo(@RequestBody User user){
//        Optional<User> updateUser = userRepository.findByUserId(user.getUserId());
//        System.out.println("회원 정보 변경들어옴"+updateUser);
//        updateUser.ifPresent(selectUser->{
//            selectUser.setName(user.getName());
//            selectUser.setUserId(user.getUserId());
//            selectUser.setPassword(user.getPassword());
//            selectUser.setEmail(user.getEmail());
//            selectUser.setPhone(user.getPhone());
//            userRepository.save(selectUser);
//        });
//        System.out.println("회원 정보 변경들어옴 리턴"+updateUser);
//        return updateUser;
//    }




    // 회원삭제
    @PostMapping("/delete")
    public Optional<User> userDelete(@RequestBody User user){
        Optional<User> userCancle = userRepository.findByUserId(user.getUserId());
        System.out.println(userCancle);
        userCancle.ifPresent(selectUser ->{
            userRepository.delete(selectUser);
        });
        return userCancle;
    }
}