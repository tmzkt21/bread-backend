package com.bread.web.user;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController @AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;
    private final  User user;

    @GetMapping("/csv")
    public void readCsv() {
        userService.readCsv();
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
        userRepository.save(user);
        return "님의 회원가입을 축하합니다";
    }

    // read 회원검색
    @GetMapping("/findUser")
    public User findUser(@RequestBody Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    // 회원목록 출력
    @GetMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    // 회원 정보 변경
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

    @PostMapping("/allUpdate")
    public void allUpdate(@RequestBody List<User> user){
        userService.allUpdate(user);
    }
}