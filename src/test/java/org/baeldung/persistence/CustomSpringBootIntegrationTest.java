package org.baeldung.persistence;

import org.baeldung.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class, H2Config.class})
@Profile("test")
public class CustomSpringBootIntegrationTest {
}
