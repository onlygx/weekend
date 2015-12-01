package mybatis;
/**
 * 测试mybatis与spring的集成
 * 并且获取数据库中的数据
 * Created by GaoXiang on 2015/9/17 0017.
 */

import javax.annotation.Resource;

import com.elangzhi.base.services.AdminService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.alibaba.fastjson.JSON;
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private AdminService adminService;


    @Test
    public void test1() {

    }
}