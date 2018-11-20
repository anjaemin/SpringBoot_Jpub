package info.thecodinglive.controller;

import info.thecodinglive.model.UserVO;
import info.thecodinglive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public ResponseEntity<?> registUser(@Validated @RequestBody UserVO userVO) {
        System.out.println("controller vo check::" + userVO.toString());
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<?> userList() {
        Iterable<UserVO> users = userService.findAllUserInfo();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    /*@RequestMapping("/{username}")
    public ResponseEntity<?> findByUserOne(@PathVariable("username") String userName) {
//        UserVO userVO =
    }*/
}
