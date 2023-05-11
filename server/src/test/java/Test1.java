import com.zjy.dubbo.DubboDBApplication;
import com.zjy.dubbo.api.TestApi;
import com.zjy.dubbo.mappers.TestMapper;
import com.zjy.server.ServerApplication;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServerApplication.class)

public class Test1 {
    @DubboReference
    private TestApi testApi;

    @Test
    public  void  testMapper() {
//        int insert = testApi.insert(new com.zjy.model.domain.Test(11, "aa"));
//        System.out.println(insert);
//        testApi.add("ΆστεΝΗ",10);
//        System.out.println(testApi.findById(26));

        String str = "αρεσω";
        System.out.println(testApi.findLikely(str).toString());
        System.out.println("ααααα");

    }

}
