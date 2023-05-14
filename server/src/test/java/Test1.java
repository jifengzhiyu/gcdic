import com.zjy.dubbo.api.MainApi;
import com.zjy.dubbo.api.TestApi;
import com.zjy.model.domain.Main;
import com.zjy.server.ServerApplication;
import com.zjy.server.service.MainService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServerApplication.class)

public class Test1 {
    @DubboReference
    private TestApi testApi;

    @Test
    public void testMapper() {
//        int insert = testApi.insert(new com.zjy.model.domain.Test(11, "aa"));
//        System.out.println(insert);
//        testApi.add("ΆστεΝΗ",10);
//        System.out.println(testApi.findById(26));

        String str = "αρεσω";
        System.out.println(testApi.findLikely(str).toString());
        System.out.println("ααααα");

    }

    @DubboReference
    private MainApi mainApi;

    @Test
    public void findWords(){
        System.out.println(mainApi.findWords("αρε"));
        System.out.println("ααααα");

    }

}
