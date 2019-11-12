package com.greenfoxacademy.smallproject.userrestcontroller;

import com.greenfoxacademy.smallproject.models.User;
import com.greenfoxacademy.smallproject.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserRestControllerTests {

    @Mock
    UserRepository userRepositoryMock;

    User mockUser = new User(1, "emil", "admin");

    @Test
    public void listUserById_Test_TestValidUserId(){
        when(userRepositoryMock.findById(1)).thenReturn(java.util.Optional.ofNullable(mockUser));

    }
}
