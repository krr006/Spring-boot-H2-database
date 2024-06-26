package com.mephi.homework.util;


import com.mephi.homework.entity.Role;
import com.mephi.homework.entity.User;
import com.mephi.homework.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class InitiateUtils implements CommandLineRunner {
    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.addNewUser(User.builder()
                        .role(Role.TEAM_LEAD)
                        .firstName("leadfn")
                        .lastName("leadln")
                .build());

        userService.addNewUser(User.builder()
                        .role(Role.ADMIN)
                        .firstName("adminfn")
                        .lastName("adminln")
                .build());

        userService.addNewUser(User.builder()
                        .role(Role.DEVELOPER)
                        .firstName("devfn")
                        .lastName("devln")
                .build());

        userService.addNewUser(User.builder()
                        .role(Role.TESTER)
                        .firstName("testerfn")
                        .lastName("testerln")
                .build());

        userService.addNewUser(User.builder()
                        .role(Role.SYSTEM_ANALYST)
                        .firstName("analystfn")
                        .lastName("analystln")
                .build());


    }
}
