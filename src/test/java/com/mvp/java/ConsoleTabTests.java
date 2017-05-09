package com.mvp.java;

import com.mvp.java.services.MissionsService;
import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Main.class)
public class ConsoleTabTests {

    @Autowired MissionsService missionsService;

    @Test
    public void retrieveMissionInfoSucessfully() throws IOException {
        String info = missionsService.getMissionInfo("Apollo");
        assertTrue(!info.isEmpty());
    }
    
}
