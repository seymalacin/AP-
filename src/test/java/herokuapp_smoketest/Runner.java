package herokuapp_smoketest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        S1Post.class,
        S2Put.class,
        S3Delete.class,
        S5Get.class

})

public class Runner {//Oluşturulan classları sırayla çalıştırmak için bir Runner class oluşturuyoruz



}