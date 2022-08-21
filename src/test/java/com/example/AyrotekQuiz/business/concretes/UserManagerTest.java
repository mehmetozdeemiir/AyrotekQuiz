package com.example.AyrotekQuiz.business.concretes;

import com.example.AyrotekQuiz.TestSupport;
import com.example.AyrotekQuiz.repository.UserRepository;
import com.example.AyrotekQuiz.response.converter.UserResponseConverter;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class UserManagerTest extends TestSupport {

    private UserRepository userRepository;
    private UserResponseConverter userResponseConverter;
    private UserManager userManager;


    @BeforeEach
    void setUp() {
        userResponseConverter= Mockito.mock(UserResponseConverter.class);
        userRepository= Mockito.mock(UserRepository.class);

        userManager=new UserManager(userRepository,userResponseConverter);
    }

   /* @Test
    public void addUser() {
        //given
        UserRequest request=userRequestSupport2;
        User user =entitySupport2;
        User savedUser= savedUserSupport;
        UserResponse userResponse=userResponseSupport;

        //when
        when(userRepository.save(user)).thenReturn(savedUser);
        when(userResponseConverter.fromUser(savedUser)).thenReturn(userResponse);

        //then
        UserResponse result= userManager.addUser(request);
        Assertions.assertEquals(userResponse,result);

        verify(userRepository).save(user);
        verify(userResponseConverter).fromUser(savedUser);
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }

    /*@Test
    public void getAllUser() {
        //given
        List<User> users=generateListUser();
        List<UserResponse> userResponses=generateUsersResponseList(users);

        //when
        when(userRepository.findAll()).thenReturn(users);
        when(userResponseConverter.from(users)).thenReturn(userResponses);

        //then
        List<UserResponse> result= userManager.getAllUser();

        Assertions.assertEquals(userResponses,result);

        verify(userRepository).findAll();
        verify(userResponseConverter).from(users);
    }

     */
   /* @Test
    void getAllFirstName(){
        List<User> users=generateListUser();
        List<UserResponse> userResponses=generateUsersResponseList(users);

        //when
        when(userRepository.findAllByFirstName(entitySupport2.getFirstName())).thenReturn(users);
        when(userResponseConverter.fromList(users)).thenReturn(userResponses);

        //then
        List<UserResponse> result= userManager.getAllUser();

        Assertions.assertEquals(userResponses,result);

        verify(userRepository).findAll();
        verify(userResponseConverter).fromList(users);

    }

    */
}