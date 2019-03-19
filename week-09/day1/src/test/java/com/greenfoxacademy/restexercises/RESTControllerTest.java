package com.greenfoxacademy.restexercises;

import com.greenfoxacademy.restexercises.controller.REST_Controller;
import com.greenfoxacademy.restexercises.model.DoubleNumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(REST_Controller.class)
public class RESTControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    MockMvc mockMvc;

    @Test
    public void doubleANumber_isOK() throws Exception {

        mockMvc.perform(
                get("/doubling?input=4"))
                .andExpect(jsonPath("$.result", is(8)));
    }

    @Test
    public void greeterNameAndTitle_isOK() throws Exception {

        mockMvc.perform(
                get("/greeter?name=Baba&title=Mr."))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Baba, my dear Mr.!")));
    }

    @Test
    public void greeterNoTitle() throws Exception {

        mockMvc.perform(
                get("/greeter?name=Baba"))
                .andExpect(jsonPath("$.error", is("Please provide a title!")));
    }

    @Test
    public void appendIsAppending() throws Exception {

        mockMvc.perform(
                get("/appenda/{appendable}","kuty"))
                .andExpect(jsonPath("$.appended", is("kutya")));
    }
}
